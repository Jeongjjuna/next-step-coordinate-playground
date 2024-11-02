package fuel.v1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RentCompany {

    private static final String NEWLINE = System.lineSeparator();

    private final List<Car> cars = new ArrayList<>();

    private RentCompany() {
    }

    public static RentCompany create() {
        return new RentCompany();
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public String generateReport() {
        return cars.stream()
                .map(this::generateCarReport)
                .collect(Collectors.joining());
    }

    private String generateCarReport(Car car) {
        return car.getName() + " : " + (int) car.getChargeQuantity() + "리터" + NEWLINE;
    }
}
