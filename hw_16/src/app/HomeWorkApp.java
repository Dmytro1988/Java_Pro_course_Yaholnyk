package app;

import java.util.Scanner;
import java.util.Random;

public class HomeWorkApp {
    public static void main(String[] args) {

        System.out.println(findSymbolOccurance("apple", 'p'));
        System.out.println("--------------------------------------");
        System.out.println(findWordPosition("Apple", "Plant"));
        System.out.println("----------------------------");
        System.out.println(stringReverse("pear"));
        System.out.println("---------------------");
        System.out.println(isPalindrome("race car"));
        System.out.println("-----------------------");
        guessWord();




    }

    public static int findSymbolOccurance(String str, char sym) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == sym) {
                count++;
            }
        }
        return count;
    }

    public static int findWordPosition(String source, String target) {
        return source.indexOf(target);
    }

    public static String stringReverse(String str) {
        StringBuilder reverseString = new StringBuilder(str);
//        for (int i = str.length() - 1; i >= 0; i--) {
//            reverseString.append(str.charAt(i));
//        }
//        return reverseString.toString();
        reverseString.reverse();
        return reverseString.toString();

    }
    public static boolean   isPalindrome(String str){

        str = str.replace(" ","");
        int i = 0;
        int j = str.length() - 1;
        while (i < j){
            if (str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

public static void guessWord(){


    String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado" , "broccoli", "carrot",
            "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", " pea", "peanut",
            "pear", "pepper", "pineapple", "pumpkin", "potato"};

    Random word = new Random();
    String randomWord = words[word.nextInt(words.length)];

    Scanner scanner = new Scanner(System.in);

        System.out.println(" Спробуйте вгадати слово.");

        while (true) {
        System.out.print(" Введіть ваше слово: ");
        String userWord = scanner.nextLine();

        if (userWord.equals(randomWord)) {
            System.out.println(" Бінго!!!!");
            break;
        } else {
            for (int i = 0; i < randomWord.length() && i < userWord.length(); i++) {
                if (randomWord.charAt(i) == userWord.charAt(i)) {
                    System.out.print(randomWord.charAt(i));
                } else {
                    System.out.print('#');
                }
            }
            for (int i = Math.min(randomWord.length(), userWord.length()); i < 15; i++) {
                System.out.print('#');
            }
            System.out.println();
        }
    }
}

}
