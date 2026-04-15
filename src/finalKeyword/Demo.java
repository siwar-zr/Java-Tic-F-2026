package finalKeyword;

//final - variable (constante) / method (pas de override) / class (pas d'heritage)
final class A {
    final int age = 9;
    public final void show(){
        System.out.println("in A");
    }
}

/*class B extends A{
    @Override
    public void show() {
        super.show();
    }
}*/
public class Demo {
    public static void main(String[] args) {

        A obj = new A();
        //obj.age = 10;

    }
}
