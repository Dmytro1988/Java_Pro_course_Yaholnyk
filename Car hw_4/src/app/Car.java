package app;

public class Car {
    private final double tankCapacity;
    private double fuelLevel;
    private final double fuelConsumption;

    public Car(double tankCapacity, double fuelLevel, double fuelConsumption) {
        this.tankCapacity = tankCapacity;
        this.fuelLevel = fuelLevel;
        this.fuelConsumption = fuelConsumption;
    }

    public double calculateFuelLeft(double distanceToKryveOzero) {

        double fuelLeft1 = distanceToKryveOzero/100 * fuelConsumption;
        return fuelLevel - fuelLeft1;

    }

    public double calculateFuelToRefill(double fuelLeft1) {
        return  fuelLeft1;
    }

    public void fillTank() {
        fuelLevel = tankCapacity;
    }

    public double calculateRefuelAmountForDistance(double distance) {
        double fuelConsumed = (distance / 100) * fuelConsumption;
        double remainingFuel = fuelLevel - fuelConsumed;
        return tankCapacity - remainingFuel;
    }

    public double calculateRefuelCostForDistance(double distance, double fuelPrice) {
        double fuelConsumed = (distance / 100) * fuelConsumption;
        double remainingFuel = fuelLevel - fuelConsumed;
        double refuelAmount =  tankCapacity - remainingFuel;
        return refuelAmount * fuelPrice;
    }

    public double calculateTotalCostForDistance(double refuelCost2, double refuelCost1) {
        return refuelCost1 + refuelCost2;
    }
   public double calculateTotalFuelLeft(double tankCapacity, double refuelAmount3 ) {
       return tankCapacity - refuelAmount3;

   }


}





