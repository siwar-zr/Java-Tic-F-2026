public class Chaine {

    public static void main(String[] args) {
        //String name = new String("John");
//        String name = "John";
//        name = name + " Doe";
//        System.out.println("Hello "+name);
//        System.out.println(name.charAt(2));
//        System.out.println(name.concat(" Doe"));
//
//        String s1 = "john";
//        String s2 = "john";
//
//        System.out.println(s1 == s2);

        StringBuffer sb = new StringBuffer("Hello Hello John Doe");
        System.out.println(sb.capacity());
        //sb.append(" Doe");
        //sb.deleteCharAt(4);
        //sb.insert(0, "Hello ");
        sb.setLength(15);
        System.out.println(sb);
        System.out.println(sb.capacity());
        //String str = sb.toString();


    }
}
