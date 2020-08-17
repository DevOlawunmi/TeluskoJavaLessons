package chapter2;

public class CarsRunner {
    public static void main(String[] args) {
        Cars myCar = new Cars("Jaguar", 2020, "blue");
        System.out.println("My car is a " +myCar.carColour +" "+ myCar.modelYear+" "+ myCar.modelName);
    }
}
