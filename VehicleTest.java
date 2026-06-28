public class VehicleTest {

    public static void main(String[] args) {

        Vehicle car = new Cars();
        Vehicle truck = new Truck();

        car.startEngine();
        car.stopEngine();

        System.out.println();

        truck.startEngine();
        truck.stopEngine();
    }
}
