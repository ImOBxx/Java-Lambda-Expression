import java.util.Arrays;
import java.util.List;

public class MRef2 {

    public static void main(String[] args) {
        List<Integer> al = Arrays.asList(10, 20, 7, 8);
        al.forEach(MRef2::printSquare); // Using MRef2 class for the method reference
    }

    public static void printSquare(Integer x) {
        System.out.println(x * x); // Prints the square of the integer
    }
}
