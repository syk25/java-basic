package poly.car0;

public class CarMain0 {
    public static void main(String[] args) {
        K3Car k3Car = new K3Car();
        Model3Car model3Car = new Model3Car();
        Driver driver = new Driver();

        driver.setK3Car(k3Car);
        driver.drive();
        driver.setK3Car(null);
        driver.setModel3Car(model3Car);
        driver.drive();
    }
}
