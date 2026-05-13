package exceptions;

class ZeroException extends Exception{
    public ZeroException(String msg){
        super(msg);
    }
}

//Error:
//1) Compile time Error
//2) Runtime Error => Exception Handling
//3) Logical Error

public class Demo {
    public static void main(String[] args) {
        //System.out.Println("Bonjour");
        //System.out.println();
        int i = 20;
        int j = 0;
        String str = null;

        //int[] nums = new int[5];
        System.out.println(" i : " + i);
        try{
            j = 18/i; // ligne critique
            //System.out.println(str.length());
            //System.out.println(nums[1]);
            //System.out.println(nums[5]);
            if (j == 0)
                throw new ZeroException("J cannot be 0");
            //throw sert à déclencher une exception
        } catch (ZeroException ae){
            j = 18;
            System.out.println(ae.getMessage());
        } /*catch (ArrayIndexOutOfBoundsException be){
            System.out.println("Stay in ur limit : " + be.getMessage());
        } catch (Exception e){
            System.out.println("Something went wrong : " + e);
        }*/

        System.out.println("Bonjour");
        System.out.println(" j : " + j);

        //Checked Exception
        /*try{
            Class.forName("Calc");
        } catch (Exception e){

        }*/
    }
}
