import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    private static final int MAX_OCCURENCE = 100;
    public static void main(String[] args) {
        Supplier<Integer> supp = new MRand(MAX_OCCURENCE);

        testSupplier1000000Fois(supp, MAX_OCCURENCE);

        System.out.println();

        ArrayList<Fraction> maListe = new ArrayList<>();
        maListe.add(new Fraction(1,2));
        maListe.add(new Fraction(5,9));
        maListe.add(new Fraction(6,7));
        maListe.add(new Fraction(5,2));
        maListe.add(new Fraction(4,4));
        maListe.add(new Fraction(1,2));
        maListe.add(new Fraction(1,1));
        maListe.add(new Fraction(2,2));
        maListe.add(new Fraction(1,4));
        maListe.forEach((f) -> {
            f.setNumerateur(f.getNumerateur()*2);
        } );

        for(Fraction f : maListe){
            System.out.println(f);
        }

        System.out.println();

        MRand rand = new MRand(10);
        ArrayList<Integer> uneAutreListe = new ArrayList<>();
        for (int i=0; i<100; i++) {
            uneAutreListe.add(rand.get());
        }

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("A");
        arrayList.add("c");
        arrayList.add("d");
        arrayList.add("E");
        arrayList.add("Fg");

        Function<ArrayList<String>, String> concat = new Function<ArrayList<String>, String>() {
            @Override
            public String apply(ArrayList<String> strings) {
                return String.join(" ", strings);
            }
        };
        System.out.println(concat.apply(arrayList));

        Predicate<Integer> predicate = (i) -> i<4;
        System.out.println(uneAutreListe.size());
        uneAutreListe.removeIf(predicate);
        System.out.println(uneAutreListe.size());

        System.out.println();

        for(Integer i : uneAutreListe){
            System.out.println(i);
        }
    }

    private static void testSupplier1000000Fois(Supplier<Integer> supplier, int maxOccurence){

        int[] occurence = new int[maxOccurence];

        for(int i=0;i<1000000;i++){
            occurence[supplier.get()]++;
        }

        for (int i=0;i<occurence.length;i++){
            System.out.println(i + " : " + occurence[i]);
        }
    }
}