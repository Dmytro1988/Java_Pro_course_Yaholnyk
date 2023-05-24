package app;

public class CustomCollection {

    private  String[] strArray;
    private int count;


    public CustomCollection(int value) {
        this.strArray = new String[value];
        this.count = 0;
    }

    public boolean add(int index, String value) {

        if (index < 0 || index > count || count == strArray.length) {
            return false;
        }

        for (int i = count; i > index; i--) {
            strArray[i] = strArray[i - 1];
        }

        strArray[index] = value;
        count++;
        return true;
    }

    public boolean add(String value) {

        return add(count, value);
    }

    public boolean delete(int index) {
        if (index < 0 || index >= count) {
            return false;
        }

        for (int i = index; i < count - 1; i++) {
            strArray[i] = strArray[i + 1];
        }

        strArray[count - 1] = null;
        count--;
        return true;
    }

    public boolean delete(String value) {
        for (int i = 0; i < count; i++) {
            if (strArray[i] != null && strArray[i].equals(value)) {
                return delete(i);
            }
        }
        return false;
    }

    public String get(int index) {
        if (index < 0 || index >= count) {
            return null;
        }

        return strArray[index];
    }
    public void printCollection() {
            for (int i = 0; i < count; i++) {
                System.out.println(strArray[i] + " ");
            }
                System.out.println(" ");

    }

}







