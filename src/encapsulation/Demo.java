package encapsulation;

import java.util.Scanner;

class Human{
    private int age;
    private String name;

    public Human(int age, String name){
        this.age=age;
        this.name=name;
    }

    public Human(int age) {
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class Demo {
    public static void main(String[] args) {

        Human h1 = new Human(14,"John");
        //System.out.println("Hello");
        //h1.age = 11;
        //h1.setAge(11);
        //h1.name = "John";
        //h1.setName("John");
        //System.out.println(h1.getName() + " : " + h1.getAge());

        Human h2 = new Human(24);
        h2.setName("Mark");

        Scanner sc = new Scanner(System.in);

        System.out.println("Donnez votre age : ");
        int ageH1 = sc.nextInt();
        sc.nextLine();
        System.out.println("Donnez votre nom : ");
        String nameH1 = sc.next();


        Human h3 = new Human(ageH1,nameH1);
        System.out.println(h3.getName() + " : " + h3.getAge());



    }
}
