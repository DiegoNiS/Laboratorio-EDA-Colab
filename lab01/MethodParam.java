public class MethodParam{
    public static void main(String[] args) {
        sayHello("John");
        sayHello("Mary");
        sayHello("Peter");
    }

    public static void sayHello(String name) {
        System.out.println("Hello " + name + "!");
    }
}

