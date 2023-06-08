package app;

public class RunArrayValueCalc {
    public static void main(String[] args) {
        String[][] array = {
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
        };
        try {
            int result = ArrayValueCalculator.doCalc(array);
            System.out.println("Результат: " + result);
        } catch (ArraySizeException | ArrayDataException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("------------------------------");

        //message 1
        String[][] array1 = {
                {"1", "2", "3", "4"},
                {"1", "2", "/", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
    };
        try {
            int result = ArrayValueCalculator.doCalc(array1);
            System.out.println("Результат: " + result);
        } catch (ArraySizeException | ArrayDataException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("--------------------------------");

        //message 2
        String[][] array2 = {
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
        };
        try {
            int result = ArrayValueCalculator.doCalc(array2);
            System.out.println("Результат: " + result);
        } catch (ArraySizeException | ArrayDataException e) {
            System.out.println(e.getMessage());
        }
    }
}
















