
class Mobile {
    String brand;
    int price;
    static String type;

    public void show(){
        System.out.println(brand + " : " + price + " : " + type);
    }

    public static void show1(Mobile obj){
        System.out.println(obj.brand + " : " + obj.price + " : " + type);
    }
}


public class Main {
    public static void main(String[] args) {

        Mobile obj1 = new Mobile();
        obj1.brand="Apple";
        obj1.price=1900;
        //obj1.type="Smartphone";


        Mobile obj2 = new Mobile();
        obj2.brand="Samsung";
        obj2.price=2500;
        //obj2.type="Smartphone";

        Mobile.type="Phone";

        obj1.show();
        obj2.show();

        Mobile.show1(obj1);
        //Une méthode static ne doit pas contenir des attributs non static


    }
}