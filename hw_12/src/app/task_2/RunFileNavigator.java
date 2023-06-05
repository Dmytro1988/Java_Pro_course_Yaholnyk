package app.task_2;


public class RunFileNavigator {

    public static void main(String[] args) {

        FileNavigator navigator = new FileNavigator();
        navigator.add( new FileData("file1.txt", 100, "/path/to/files"));
        navigator.add( new FileData("file2.txt", 200, "/path/to/files"));
        navigator.add( new FileData("file3.txt", 150, "/path/to/other/files"));

        System.out.println("Файли за шляхом /path/to/files:");
        for (FileData file : navigator.find("/path/to/files")) {
            System.out.println(file.getName() + " (" + file.getSize() + " байт)");
        }

        System.out.println("Файли розміром не більше 150 байт:");
        for (FileData file : navigator.filterBySize(150)) {
            System.out.println(file.getName() + " (" + file.getSize() + " байт)");
        }

        System.out.println("Всі файли відсортовані за розміром:");
        for (FileData file : navigator.sortBySize()) {
            System.out.println(file.getName() + " (" + file.getSize() + " байт)");
        }

        navigator.remove("/path/to/files");

        System.out.println("Файли після видалення шляху /path/to/files:");
        for (FileData file : navigator.sortBySize()) {
            System.out.println(file.getName() + " (" + file.getSize() + " байт)");
        }
    }

}
