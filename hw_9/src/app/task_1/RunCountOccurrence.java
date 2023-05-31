package app.task_1;

import java.util.Arrays;
import java.util.List;



public class RunCountOccurrence {

    public static void main(String[] args) {
        CountOccurrence occurrence = new CountOccurrence();

        List<String> mas = Arrays.asList("Авокадо", "Овочевий перець", "Помідор", "Момордика", "Чайот", "Огірок", "Баклажан", "Люффа",
                "Маслина", "Гарбуз", "Помідор", "Стручковий перець", "Фізаліс", "Помідор", "Ангурія", "Бенінказа", "Кабачок" );
        List<String> randomMas = occurrence.getList(mas,100);
        int occurs = occurrence.countOccurrence(randomMas,  "Помідор");
        System.out.println(occurs);
    }
}
