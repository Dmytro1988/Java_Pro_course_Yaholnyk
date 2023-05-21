package app;

import java.util.ArrayList;
import java.util.List;

public class DynamicStringCollection {
    private final List<String> list;

    public DynamicStringCollection() {
        list = new ArrayList<>();
    }

    public boolean add(String value) {
        list.add(value);
        System.out.println("Додано до масиву '" + value + "'");
        return true;
    }

    public boolean add(int index, String value) {
        if (index >= 0 && index <= list.size()) {
            list.add(index, value);
            System.out.println("Додано до масиву '" + value + "' за індесом " + index);
            return true;
        }
        System.out.println("Невірний індекс!");
        return false;
    }

    public boolean delete(int index) {
        if (index >= 0 && index < list.size()) {
            String deletedElement = list.remove(index);
            System.out.println("Видалено з масиву '" + deletedElement + "' за індексом " + index);
            return true;
        }
        System.out.println("Невірний індекс!");
        return false;
    }

    public boolean delete(String value) {
        boolean removed = list.remove(value);
        if (removed) {
            System.out.println("Елемент '" + value + "' видалено з листа");
        } else {
            System.out.println("Елемент '" + value + "' не знайдено у листі");
        }
        return removed;
    }

    public String get(int index) {
        if (index >= 0 && index < list.size()) {
            String element = list.get(index);
            System.out.println("Елемент за індексом " + index + ": ");
            return element;
        }
        System.out.println("Невірний індекс!");
        return null;
    }

    public void printCollection() {
        for (String mas : list ) {
            System.out.println(mas);
        }
    }
}