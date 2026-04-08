package Heritage;

class A extends Object{
    /*public A(){
        super();
        System.out.println("in A");
    }
    public A(int n){
        super();
        System.out.println("in A int");
    }*/
    public void show(){
        System.out.println("in show A");
    }
    public void config(){
        System.out.println("in config A");
    }
}
class B extends A {

    public void show(){
        System.out.println("In B show");
    }

    @Override
    public void config() {
        super.config();
        System.out.println("Plus config B");
    }

    /*public B(){
        //super(5);
        System.out.println("in B");
    }

    public B(int n){
        //super(n);
        this();
        System.out.println("in B int");
    }*/

}

//class C extends A extends B{}


class Calc{
    public int add(int a, int b){
        return a+b;
    }
    public int sub(int a, int b){
        return a-b;
    }
}
public class Demo {
    public static void main(String[] args) {
        /*VeryAdvCalc c1 = new VeryAdvCalc();
        System.out.println(c1.add(4,5));
        System.out.println(c1.sub(8,2));
        System.out.println(c1.multi(3,2));
        System.out.println(c1.div(10,2));
        System.out.println(c1.power(3,2));*/

        //B obj = new B();

        //System.out.println(obj);
        B obj = new B();
        obj.show();
        obj.config();

    }
}
