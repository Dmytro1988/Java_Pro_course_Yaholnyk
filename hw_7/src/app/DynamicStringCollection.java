package app;




public class DynamicStringCollection {
    private static final int DEFAULT_CAPACITY = 10;
    private String[] elements;
    private int size;

    public DynamicStringCollection() {
        elements = new String[DEFAULT_CAPACITY];
        size = 0;
    }

    public boolean add(String value) {
        return add(size,value);
    }

    public boolean add(int index, String value) {
        if (index < 0 || index > size)
            throw new IndexOutOfBoundsException();
          System.out.println("Додано до масиву '" + value + "' за індесом " + index);
        if (size == elements.length)
            resizeArray();

        for (int i = size - 1; i >= index; i--) {
            elements[i + 1] = elements[i];
        }
        elements[index] = value;
        size++;
        return true;
    }

    public boolean delete(String value) {
       int index = indexOf(value);
        if (index != -1) {
            delete(index);
            System.out.println("Елемент '" + value + "' видалено з листа");
            return true;
        } else {
            System.out.println("Елемент '" + value + "' не знайдено у листі");
        }
        return false;
    }

    public boolean delete(int index) {

        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException();
        for (int i = index; i < size; i++) {
            elements[i] = elements[i + 1];
        }
        elements[size - 1] = null;
        size--;
        System.out.println("Видалено з масиву за індексом " + index);
        return true;

    }

    public String get(int index) {
        if (index < 0 || index > size)
           throw new IndexOutOfBoundsException();
        System.out.println("Елемент за індексом " + index + ": ");
        return elements[index];
    }

    private void resizeArray(){
        int newCAPACITY = elements.length * 2;
        String[] newElements = new String[newCAPACITY];
        System.arraycopy(elements, 0, newElements, 0, size);
        elements = newElements;
    }
    private  int indexOf(String value){
        for(int i = 0; i < size; i++){
            if (value.equals(elements[i])){
                return i;
            }
        }
        return -1;
    }

    public void printCollection() {
        for (String mas : elements ) {
            System.out.println(mas);
        }
    }
}