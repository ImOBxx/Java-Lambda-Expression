import java.util.Arrays;
import java.util.List;

public class ListIntegersOddEven {

    public static void main(String[] args) {
        List<Integer> il = Arrays.asList(1, 2, 3, 4, 5);
        
        System.out.println("\n");
        System.out.println("Even Numbers: ");
        System.out.println("\n");
        il.stream()
          .filter(x -> x % 2 == 0) 
             
          .forEach(System.out::println);  
        
        System.out.println("\n");
        System.out.println("Odd Numbers: ");
        System.out.println("\n");
        il.stream()
        .filter(x -> x % 2 != 0)
        .forEach(System.out::println);
    }


}

