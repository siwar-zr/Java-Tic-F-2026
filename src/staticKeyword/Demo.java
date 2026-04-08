package staticKeyword;

class Mobile{
    String brand;
    int price;
    static String type;

    public void show(){
        System.out.println(brand + " : " + price + " : " + type);
    }

    public static void show1(Mobile m){
        System.out.println(m.brand + " : " + m.price + " : " + type);
    }
}
public class Demo {
    public static void main(String[] args) {

        Mobile obj = new Mobile();
        obj.brand="Apple";
        obj.price=1500;
        //obj.type="Smartphone";


        Mobile obj2 = new Mobile();
        obj2.brand="Samsung";
        obj2.price=2000;
        //obj2.type="Smartphone";

        //obj.type = "Phone";

        Mobile obj3 = new Mobile();
        obj3.brand="Huawei";
        obj3.price=1000;
        //obj3.type="NewPhone";

        Mobile.type="Smartphone";
        obj.show();
        obj2.show();
        obj3.show();

        Mobile.show1(obj);



    }
}
