class Laptop{
    String Brand;
    int Ram;
    boolean Avaliable;
}

public class DefaultConstructors{
    public static void main(String[] args){
        Laptop l = new Laptop();

        System.out.println(l.Brand);
        System.out.println(l.Ram);
        System.out.println(l.Avaliable);
    }
}