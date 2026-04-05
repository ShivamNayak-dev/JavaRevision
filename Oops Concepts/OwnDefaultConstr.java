class Laptop {
    String brand;
    int ram;

    // Our own default constructor
    Laptop() {
        brand = "Unknown";
        ram = 4;
        System.out.println("Laptop object created with default values.");
    }

    void display() {
        System.out.println("Brand: " + brand + ", RAM: " + ram + "GB");
    }
}

public class OwnDefaultConstr{
     public static void main(String[] args){
        Laptop Lap = new Laptop();
        Lap.display();

     }
}