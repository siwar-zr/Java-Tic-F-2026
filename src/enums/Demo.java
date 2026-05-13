package enums;

enum Status{
    Running, Pending, Success, Failed;
}
public class Demo {
    public static void main(String[] args) {
        int i = 5;
        Status s = Status.Success;
        Status[] ss = Status.values();
        //System.out.println(s.ordinal());
        //System.out.println(ss);
        for(Status st : ss){
            System.out.println(st + " : " + st.ordinal());
        }
    }
}
