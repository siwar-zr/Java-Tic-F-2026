
class Hello {
    public static void main(String[]args){
        int num1 = 9;
        byte by = 127;
        short sh = 558;
        long l = 5864000000l;

        float f = 5.8f;
        double d = 5.8;

        char c = 'a';
        c++;
        //System.out.println(c);


        //boolean b = true;

        int num2 = 0b101;
        //System.out.println(num2);

        int num3 = 0x7E;
        //System.out.println(num3);

        int num4 = 100_000_00_00;
        //System.out.println(num4);

        double d1 = 12e10;
        //System.out.println(d1);

        byte b = 127;
        int a = 515;

       //a=b;    //Conversion implicite
       b= (byte) a;      //Conversion explicite --> Casting

        //System.out.println(b); //b = a % range(byte)

        float f1 = 5.6f;
        int x = 1;
        x= (int) f;  //Conversion explicite
        //f=x; //Conversion implicite

        System.out.println(x);




    }
}

