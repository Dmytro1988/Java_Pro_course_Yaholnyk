package app.task_1;


public class RunSimpleMathLibrary {

    public static void main(String[] args) {

    double a = 2.0;
    double b = 3.0;

        if (SimpleMathLibrary.add(a, b) == 5.0) {
        System.out.println("OK");
    } else {
        System.out.println("NOK");
    }

        if (SimpleMathLibrary.minus(a, b) == -1.0) {
        System.out.println("OK");
    } else {
            System.out.println("NOK");
        }


    }
}
