import javax.imageio.plugins.bmp.BMPImageWriteParam;

public class Bmi {

        private String name;
        private int age;
        private double weight;
        private double height;
        private static final double KILOGRAMS_PER_POUND = 0.45359237;
        private static final double METERS_PER_INCH = 0.0254;

        public Bmi(String name, int age, double weight, double height) {
            this.name = name;
            this.height = height;
            this.age = age;
            this.weight = weight;
        }
        public Bmi(double weight, String name, double height){
            this(name, 20, weight, height);
        }

        public double getBmi() {
            double bmi = weight * KILOGRAMS_PER_POUND / ((height*METERS_PER_INCH)*(height*METERS_PER_INCH));
            return Math.round(bmi*100)/100;
        }
        public String getStatus(){
            double bmi = getBmi();
            if (bmi < 18.5)
                return "underweight";
            else if (bmi < 25)
                return "normal";
            else if (bmi <30)
                return "overweight";
            else
                return "obese";

        }

    public String getName(){
            return name;
        }
    public int getAge(){
            return age;
        }

    public double getWeight() {
        return weight;
    }
    public double getHeight(){
            return height;
    }
}

