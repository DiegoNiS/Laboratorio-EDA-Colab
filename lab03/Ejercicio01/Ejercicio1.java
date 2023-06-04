
import java.util.List;
import java.util.Stack;

public class Ejercicio1 {
    public static void main(String[] args) {
        
        //CREANDO LAS PILAS
        Stack<Integer> pila1=new Stack<>();
        Stack<Integer> pila2=new Stack<>();
        Stack<Integer> pila3=new Stack<>();
        //CREANDO LOS ARRAYS
        pila1.push(1);
        pila1.push(1);
        pila1.push(1);
        pila1.push(2);
        pila1.push(3);
        
        pila2.push(2);
        pila2.push(3);
        pila2.push(4);
        
        pila3.push(1);
        pila3.push(4);
        pila3.push(1);
        pila3.push(1);
        
        //IMPRIMIENDO
        
        System.out.println(equalStack(pila1,pila2,pila3));
    }
    
    static int equalStack(Stack <Integer> h1,Stack <Integer> h2,Stack <Integer> h3){
        
        //EL CONTADOR TIENE LA FINALIDAD DE BUSCAR EL ESPACIO 
        //EN EL ARRAY PARA CONVERTIRLO A 0
        int suma1,suma2,suma3;
        suma1=suma(h1);
        suma2=suma(h2);
        suma3=suma(h3);
        System.out.println("Altura de la pila 1: "+suma1);
        System.out.println("Altura de la pila 2: "+suma2);
        System.out.println("Altura de la pila 3: "+suma3);
        while(true){
            //CADA IF TIENE LA FUINCION DE COMPARAR CON LOS OTROS ARRAYS
            if(suma1>suma2 || suma1>suma3){
                h1.pop();
                suma1=suma(h1); 
            }
            else if(suma2>suma1 || suma2>suma3){
                h2.pop();
                suma2=suma(h2);
            }
            else if(suma3>suma1 || suma3>suma2){
                h3.pop();
                suma3=suma(h3);
            }
            //SI LOS TRES ARRAYS SON IGUALES, SE ROMPE EL BUCLE
            else
                break;  

        }
        System.out.println("La altura de todas las pilas es de: ");
        return suma1;
    }
    //METODO PARA SUMAR 
    static int suma (List <Integer> h){
        
        int suma=0;
        for(int altura:h)
            suma+=altura;
        return suma;
    }
}
