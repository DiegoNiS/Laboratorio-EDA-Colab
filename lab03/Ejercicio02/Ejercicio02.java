import Exceptions.ExceptionIsEmpty;
// Clase principal Ejercicio02: Casos de PRUEBA
public class Ejercicio02 {
    public static void main (String[]args){
        try{ // para top() y pop(): ExceptionIsEmpty
            Pila<Integer> pila1 = new Pila<Integer>();
            System.out.println("Pila1: "+ pila1);
            System.out.println("Agregando elementos");
            pila1.push(23);
            pila1.push(100);
            pila1.push(99);
            pila1.push(55);
            pila1.push(100);
            System.out.println("Pila1: "+pila1);
            System.out.println("Agregando mas elementos");
            pila1.push(-70);
            pila1.push(-5);
            System.out.println("Pila1: "+ pila1);
            System.out.println("Peek: "+ pila1.peek());
            System.out.println("Pop: "+pila1.pop());
            System.out.println("Pila1: "+pila1);
            System.out.println("Peek: "+ pila1.peek());
            System.out.println("Pop: "+pila1.pop());
            System.out.println("Pila1: "+pila1);
            System.out.println("Search(99): "+pila1.search(99));
            System.out.println("Search(100): "+pila1.search(100));
            System.out.println("Search(-70): "+pila1.search(-70));
            pila1.pop(); pila1.pop(); pila1.pop(); 
            pila1.pop(); pila1.pop(); pila1.pop(); // ver la excepcion
        }catch(ExceptionIsEmpty ep){
            System.out.println(ep);
        }
    }
}
