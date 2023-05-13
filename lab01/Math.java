public class Math {
    public static void main(String[] args) {
        double a = 3.4;
        double b = 5.7;
        double c = Math.max(a, b);
        System.out.println("El número mayor es: " + c);
        
        int d = -10;
        int e = Math.abs(d);
        System.out.println("El valor absoluto de " + d + " es: " + e);
        
        double f = 3.7;
        double g = Math.ceil(f);
        System.out.println("El techo de " + f + " es: " + g);
    }
}

