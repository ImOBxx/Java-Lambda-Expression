import java.util.Arrays; // Ensure this import is at the top

class Point {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class SortArray {

    public static void main(String[] args) {
        Point[] arr = { // Corrected syntax for array declaration
            new Point(10, 20),
            new Point(5, 30),
            new Point(30, 40)
        }; // Added a semicolon here

        Arrays.sort(arr, (p1, p2) -> p1.x - p2.x); // Lambda for sorting by x coordinate

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].x + " " + arr[i].y);
        }
    }
}
