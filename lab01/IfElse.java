public class IfElse {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        if (x > y) {
            System.out.println("x es mayor que y");
        } else if (x < y) {
            System.out.println("x es menor que y");
        } else {
            System.out.println("x es igual a y");
        }
        
        String cadena1 = "Hola";
        String cadena2 = "hola";
        if (cadena1.equals(cadena2)) {
            System.out.println("Las cadenas son iguales");
        } else {
            System.out.println("Las cadenas son diferentes");
        }
        
        double a = 2.5;
        double b = 3.0;
        double c = 1.0;
        if (a > b && a > c) {
            System.out.println("a es el número más grande");
        } else if (b > a && b > c) {
            System.out.println("b es el número más grande");
        } else {
            System.out.println("c es el número más grande");
        }
    }
}

