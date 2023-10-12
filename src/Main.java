import java.util.function.Supplier;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Supplier<Integer> supp = new MRand(100);

        testSupplier1000000Fois(supp);
    }

    private static void testSupplier1000000Fois(Supplier<Integer> supplier){

        int total = 0;
        for(int i=0;i<1000000;i++){
            Integer num = supplier.get();
            System.out.println(num);
            total += num;
        }
        System.out.println(total/1000000);
    }
}