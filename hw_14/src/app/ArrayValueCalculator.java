package app;

public class ArrayValueCalculator {
    public static int doCalc(String[][] array)
            throws ArraySizeException, ArrayDataException {

        if (array.length != 4) {
            throw new ArraySizeException("Масив повинен мати розмір 4х4");
        }
        for (String[] strings : array) {
            if (strings.length != 4) {
                throw new ArraySizeException("Масив повинен мати розмір 4х4");
            }
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new ArrayDataException("Невірні дані у комірці [" + i + "][" + j + "]");
                }
            }
        }
        return sum;
    }
}
