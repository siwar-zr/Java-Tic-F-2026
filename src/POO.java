
//class Computer{
//
//    public void playMusic(){
//        System.out.println("Music playing...");
//    }
//
//    public String getMePen(int cost){
//        if (cost >= 5){
//            return "Pen";
//        }
//        return "Nothing";
//
//    }
//}

class Calculator{

    int num = 5;

    //Method Overloading / Surcharge
    public int add(int n1, int n2, int n3){
        System.out.println(num);
        return n1+n2+n3;
    }
    public int add(int a, int b){
        //System.out.println(n1);
        return a+b;
    }
    public double add(double n1, int n2){
        return n1+n2;
    }
//    public double add(int n1, int n2){
//        return n1+n2;
//    }
}

public class POO {

    public static void main(String[] args) {

//    Computer obj = new Computer();
//    obj.playMusic();
//    String str = obj.getMePen(6);
//    System.out.println(str);

        int data = 10;
        Calculator calc = new Calculator();
        Calculator calc1 = new Calculator();
        int r1 = calc.add(3,4,2);
//        int r2= calc.add(5,6);
        //System.out.println(r1);
        calc.num = 8;
        System.out.println(calc.num);
        System.out.println(calc1.num);
    }

}
