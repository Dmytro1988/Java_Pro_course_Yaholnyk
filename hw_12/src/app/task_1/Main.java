package app.task_1;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        FileNavigator fileNavigator = new FileNavigator("D:\\Java Pro all");
        List<String> filelist = fileNavigator.getFiles();
        System.out.println(filelist);
        System.out.println("-------------------------------");


        FileNavigator fileNavigator1 = new FileNavigator("D:\\Java Pro all\\Java_Pro_course_Yaholnyk");
        List<String> filelist1 = fileNavigator1.getFiles();
        System.out.println(filelist1);


    }
}
