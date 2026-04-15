package access2;

import access1.A;
class C extends A{
    public void show(){
        System.out.println(age);
    }
}

public class Demo {
    public static void main(String[] args) {
        A obj = new A();
        //System.out.println(obj.age);

    }
}
