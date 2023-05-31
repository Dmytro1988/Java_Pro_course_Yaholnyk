package app.phonebook;

import java.util.List;

public class RunPhoneBook {

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add(new Record("Jimmy", "+380989652321"));
        phoneBook.add(new Record("John", "+380983213532"));
        phoneBook.add(new Record("Andy", "+380999875623"));
        phoneBook.add(new Record("Ron", "+380665215478"));
        phoneBook.add(new Record("Jack", "+380508965471"));
        phoneBook.add(new Record("Andy", "+380672528785"));

        Record foundRecord = phoneBook.find("Andy");
        if (foundRecord != null) {
            System.out.println("Got some record: " + foundRecord.getName() + " - " + foundRecord.getPhone());
        }else {
            System.out.println("No name like this.");
        }

        List<Record>foundRecords = phoneBook.findAll("Andy");
        if (foundRecords != null){
            System.out.println("Got few records: ");
            for (Record record : foundRecords) {
                System.out.println(record.getName() + " - " + record.getPhone());
            }
            }else {
            System.out.println("No records found.");
        }

    }
}
