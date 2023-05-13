public class Operadores {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int resultado;

        resultado = a + b;
        System.out.println("La suma es: " + resultado);
        resultado = a - b;
        System.out.println("La resta es: " + resultado);
        resultado = a * b;
        System.out.println("La multiplicación es: " + resultado);
        resultado = a / b;
        System.out.println("La división es: " + resultado);
        resultado = a % b;
        System.out.println("El módulo es: " + resultado);

        resultado = 10;
        resultado += 5;
        System.out.println("El resultado de la asignación es: " + resultado);

        boolean esMayor = (a > b);
        System.out.println("¿a es mayor que b? " + esMayor);
        boolean esIgual = (a == b);
        System.out.println("¿a es igual a b? " + esIgual);

        boolean x = true;
        boolean y = false;
        boolean z = (x && y);
        System.out.println("x AND y es: " + z);
        z = (x || y);
        System.out.println("x OR y es: " + z);
        z = !x;
        System.out.println("NOT x es: " + z);
    }
}

