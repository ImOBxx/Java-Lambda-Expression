
public class PIValue {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        MyInterface reference;
        reference = () -> 3.1499987667;
        
        System.out.printf("PI value is : %.4f\n", reference.getPiValue());
    }

}

interface MyInterface {
    double getPiValue();
}
