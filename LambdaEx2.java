import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

class GFG {
    // Made static to be accessible from the static main method in LambdaEx2
    static void printCond(Collection<Integer> c, Predicate<Integer> p) {
        for (Integer x : c) {
            if (p.test(x)) {
                System.out.println(x + " ");
            }
        }
    }
}

public class LambdaEx2 {
    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>(Arrays.asList(10, 5, 20, 7, 30));
        GFG.printCond(al, new MyPredicateEven()); // Call from GFG class
    }

    // Inner class within LambdaEx2 to keep all related in one file
    static class MyPredicateEven implements Predicate<Integer> {
        @Override
        public boolean test(Integer x) {
            return (x % 2 == 0);
        }
    }
}
