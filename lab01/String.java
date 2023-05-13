public class String{
    public static void main(String[] args) {
        String saludo = "Hola mundo";
        System.out.println(saludo);
        
        String palabra = "Java";
        System.out.println("La palabra " + palabra + " tiene " + palabra.length() + " caracteres.");
        
        String numero = "123";
        int num = Integer.valueOf(numero);
        System.out.println("El número " + num + " es de tipo int.");
        
        String mensaje = "Hola mundo";
        int indice = mensaje.indexOf("mundo");
        System.out.println("La palabra 'mundo' está en el índice " + indice + " del mensaje.");
    }
}

