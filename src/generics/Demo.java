package generics;

public class Demo {
    public static void main(String[] args) {
        IntegerPrinter ip = new IntegerPrinter(5);
        Printer<Integer> pi = new Printer<>(5);

        StringPrinter sp = new StringPrinter("Hello");
        Printer<String> ps = new Printer<>("Hello");

        DoublePrinter dp = new DoublePrinter(2.8);
        Printer<Double> pd = new Printer<>(2.8);

    }
}
