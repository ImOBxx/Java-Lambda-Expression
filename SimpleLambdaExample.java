
public class SimpleLambdaExample {
    interface Greeting {
        void sayHello(String name);
    }

    public static void main(String[] args) {
        // Use a lambda expression to define the sayHello method of the Greeting interface
        Greeting greeting = (name) -> System.out.println("Hello, " + name);

        // Call the sayHello method using the lambda expression
        greeting.sayHello("John");
        greeting.sayHello("Jane");
    }
}
