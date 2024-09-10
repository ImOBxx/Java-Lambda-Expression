import java.util.Arrays;
import java.util.List;

public class SortList {

    public static void main(String[] args) {
        List<String> colors = Arrays.asList("red", "green", "blue", "black", "pink");
        
        System.out.println("Original Strings:");
        for (String str : colors) {
            System.out.println(str + ' ');
        }
        
        // Sorting the list using a lambda expression
        colors.sort((str1, str2) -> str1.compareToIgnoreCase(str2));
        
        System.out.println("\nSorted Strings:");
        for (String str : colors) {
            System.out.println(str + ' ');
        }
    }
}
