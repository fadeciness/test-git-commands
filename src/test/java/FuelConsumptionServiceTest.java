import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuelConsumptionServiceTest {

    @Test
    void calculateFuelVolumeIsZero() {
        FuelConsumptionService service = new FuelConsumptionService();
        int fuelVolume = 0;
        double consumption = 5.8;

        int result = service.calculate(consumption, fuelVolume);

        assertEquals(0, result);
    }

    @Test
    void calculateFuelVolumeLessConsumption() {
        FuelConsumptionService service = new FuelConsumptionService();
        int fuelVolume = 3;
        double consumption = 5.8;

        int result = service.calculate(consumption, fuelVolume);

        assertEquals(51, result);
    }

    @Test
    void calculateFuelVolumeOverConsumption() {
        FuelConsumptionService service = new FuelConsumptionService();
        int fuelVolume = 30;
        double consumption = 5.8;

        int result = service.calculate(consumption, fuelVolume);

        assertEquals(517, result);
    }
}