public class Demo {

    public static void main(String[] args) {

        //int num1 = 7;
        //int num2 = 5;

        //float result = num1 / num2;
        //num1 = num1 + 1;
        //num1 += 1;
        //num1 -= 2;
        //num1 *=2 ;


        //int result = num1++;
        //++num1;
        //System.out.println(result);
        //System.out.println(num1);

        //int x =6;
        //int y =7;
        //int a =5;
        //int b = 9;
        //boolean result = x > y || a < b || a > 1;

        //System.out.println(result);

//        int x = 8;
//        int y = 7;
//        int z = 9;
//
//        if(x > y && x > z)    // x --> 11 - 20
//            System.out.println(x);
//        else if(y > z)
//            System.out.println(y);
//        else
//            System.out.println(z);

        //int n = 4;
        //int result = 0;

//        if(n%2 == 0)
//            result = 10;
//        else
//            result = 20;
        // opérateur ternaire: condition ? value if true : value if false
        //result = n%2 == 0 ? 10 : 20;

        //System.out.println(result);

        int n = 2;

//        if (n == 1)
//        System.out.println("Sunday");
//        else if (n == 2)
//        System.out.println("Monday");
//        else if (n == 3)
//        System.out.println("Tuesday");
//        else if (n == 4)
//        System.out.println("Wednesday");
//        else if (n == 5)
//        System.out.println("Thursday");
//        else if (n == 6)
//        System.out.println("Friday");
//        else
//        System.out.println("Saturday");

        switch(n){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Enter a valid number");
        }

    }
}
