public class BmiStart {
    public static void main(String[] args) {
        Bmi bmi1 = new Bmi("Mathias Hemmingsen", 20, 60, 180);
        System.out.println("The BMI for " + bmi1.getName() + " is " + bmi1.getBmi() + " " + bmi1.getStatus());

        Bmi bmi2 = new Bmi("Mikkel Sørensen", 20, 110, 190);
        System.out.println("The BMI for " + bmi2.getName() + " is " + bmi2.getBmi() + " " + bmi2.getStatus());
    }
}
