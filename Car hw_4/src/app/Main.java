package app;

public class Main {

    public static void main(String[] args) {

        Car car = new Car(60, 20, 8);

        // Одеса - Криве Озеро - 178 км, Криве Озеро - Жашків - 150  км, Жажків - Київ -147
        double distanceToKryveOzero = 178;
        double distanceToZhashkiv = 150;
        double distanceToKyiv =147;
        double fuelPrice = 50;


        double fuelLeft1 = car.calculateFuelLeft(distanceToKryveOzero);
        if (fuelLeft1 >= 0) {
            System.out.println("Палива достатньо для подолання " + distanceToKryveOzero + " км до Кривого Озера");


            // Дозаправляємо машину у Кривому Озері
            double refuelAmount1 = car.calculateRefuelAmountForDistance(distanceToKryveOzero);
            double refuelCost1 = car.calculateRefuelCostForDistance(distanceToKryveOzero, fuelPrice);
            System.out.printf("Дозаправка в Кривому Озері: %.2f л, вартість - %.2f грн\n", refuelAmount1, refuelCost1);
            car.fillTank();

            // Дозаправляємо машину в Жашкові
            double refuelAmount2 = car.calculateRefuelAmountForDistance(distanceToZhashkiv);
            double refuelCost2 = car.calculateRefuelCostForDistance(distanceToZhashkiv, fuelPrice);
            System.out.printf("Дозаправка в Жашкові: %.2f л, вартість - %.2f грн\n", refuelAmount2, refuelCost2);
            car.fillTank();

            double totalCost = car.calculateTotalCostForDistance(refuelCost2, refuelCost1);
            System.out.printf("Загальна вартість поїздки:  %.2f грн\n", totalCost);

            double refuelAmount3 = car.calculateRefuelAmountForDistance(distanceToKyiv);
            System.out.printf("Витрата палива до Київа: %.2f л\n", refuelAmount3);


            double TotalFuelLeft = car.calculateTotalFuelLeft(60, refuelAmount3);
            System.out.printf("Залишок палива:  %.2f л ", TotalFuelLeft);


        } else {
            double fuelToRefill = car.calculateFuelToRefill(-fuelLeft1);
            System.out.println("Для подолання " + distanceToKryveOzero + " км до Кривого Озера потрібно дозаправити " +
                     fuelToRefill + " л");

        }

        }


    }









