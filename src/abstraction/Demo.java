package abstraction;

//Une methode sans body => abstract
//Une methode abstraite doit etre contenue dans une classe abstraite
//Une classe abstraite ne peut pas etre instanciée
//Une classe abstraite peut contenir des methodes abstraites et/ou concretes
//Une classe peut etre abstraite mais ne contient aucune methode abstraite => just pour ne pas instancier
//Une classe qui hérite d'une classe abstraite doit soit implémenter les methodes abstraites de la classe mere ou déclarée abstraite

abstract class Car{
    public abstract void drive();
    public void playMusic(){
        System.out.println("Music playing..");
    }
}

abstract class BMW extends Car{
    public abstract void fly();

}

class AdvBMW extends BMW{
    @Override
    public void drive() {
        System.out.println("Driving BMW");
    }

    @Override
    public void fly() {
        System.out.println("flying...");
    }
}
public class Demo {
    public static void main(String[] args) {

        BMW obj = new AdvBMW();
        obj.playMusic();
        obj.drive();
        obj.fly();

    }
}
