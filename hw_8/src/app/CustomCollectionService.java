package app;

public interface CustomCollectionService {


     boolean delete(String value);
     String get(int index);
     boolean add(int index, String value);
     boolean add(String value);
     boolean delete(int index);
     boolean contain(String o);

     boolean equals(CustomCollectionService str);

     boolean clear();

     int size();


     void printCollection();

}
