package abstraction;

//class - class : extends
//class - interface : implements
//interface - interface : extends


//Lorsqu'on implemente plusieurs interfaces on doit redefinir les methodes de toutes les interfaces implémentées
interface A{
    int age = 40;  //final static
    String area = "Tunis";
    void show(); //public abstract par défaut
    void config();
}

interface X{
    void run();
}

interface Y extends X{

}
class B implements A, Y{
    @Override
    public void show() {
        System.out.println("in show");
    }

    @Override
    public void config() {
        System.out.println("in config");
    }

    @Override
    public void run() {
        System.out.println("running");
    }

}
public class Demo2 {
    public static void main(String[] args) {

        A obj;
        obj = new B();
        obj.show();
        obj.config();

        //A.area = "Ariana";
        //System.out.println(A.area);

        Y obj2 = new B();
        obj2.run();

        B obj3 = new B();
        obj3.config();
        obj3.show();
        obj3.run();

    }
}
