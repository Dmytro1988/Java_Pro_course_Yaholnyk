package app.coffee.order;

public class RunCoffeeOrderBoard {

    public static void main(String[] args) {
        CoffeeOrderBoard board = new CoffeeOrderBoard();
        board.add("Віктор");
        board.add("Олена");
        board.add("Артем");
        board.add("Олексій");
        board.add("Світлана");
        board.draw();
        System.out.println("--------------------------");
        System.out.println("Видача замовлення: " + board.delivery());
        System.out.println("Видача замовлення: " + board.delivery(5));
        System.out.println("---------------------------");
        board.draw();

    }
}
