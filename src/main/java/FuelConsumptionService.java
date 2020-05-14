class FuelConsumptionService {

    /**
     * Calculates the approximate power reserve
     * @param consumptionPerHundredKm - fuel consumption per 100 kilometers in liters
     * @param fuelVolumeLiter - the amount of available fuel in liters
     * @return distance in kilometers that can be driven
     */
    int calculate(double consumptionPerHundredKm, int fuelVolumeLiter) {
        double consumptionPerOneKm = consumptionPerHundredKm / 100;
        return (int)(fuelVolumeLiter / consumptionPerOneKm);
    }
}
