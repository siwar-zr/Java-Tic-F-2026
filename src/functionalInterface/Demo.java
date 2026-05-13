package functionalInterface;

//Une interface fonctionnelle est une interface qui contient une et une seule methode abstraite

@FunctionalInterface
interface A{
    //void show(int i, int j);
    int add (int i, int j);
}

/*class B implements A{
    @Override
    public void show() {
        System.out.println("In B show");
    }
}*/

public class Demo {
    public static void main(String[] args) {
        //A obj = new B();
        //obj.show();

        //A obj = () -> System.out.println("In functional A show");
        //A obj = i -> System.out.println("In functional A show : "+i);
        //A obj = (i,j) -> System.out.println("In functional A show : "+ (i+j) );
        //obj.show(5,1);
        A obj = (i,j) -> i+j;
        System.out.println(obj.add(5,2));

    }
}
