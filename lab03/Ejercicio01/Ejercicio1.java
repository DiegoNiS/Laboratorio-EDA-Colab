
import java.util.Stack;

public class Ejercicio1 {
    public static void main(String[] args) {
        
        //CREANDO LAS PILAS
        Stack<int[]> pila1=new Stack<>();
        Stack<int[]> pila2=new Stack<>();
        Stack<int[]> pila3=new Stack<>();
        //CREANDO LOS ARRAYS
        int [] h1={1,1,1,2,3};
        int [] h2={2,3,4};
        int [] h3={1,4,1,1};
        
        //PUSH PARA INTRODUCIR EL ARRAY EN LA PILA
        pila1.push(h1);
        pila2.push(h2);
        pila3.push(h3);
        //IMPRIMIENDO
        System.out.println("La todas las pilas tienen la altura de: ");
        System.out.println(equalStack(pila1.pop(),pila2.pop(),pila3.pop()));
    }
    
    static int equalStack(int[]h1,int[]h2,int[]h3){
        
        //EL CONTADOR TIENE LA FINALIDAD DE BUSCAR EL ESPACIO 
        //EN EL ARRAY PARA CONVERTIRLO A 0
        int suma1,suma2,suma3,cont1=1,cont2=1,cont3=1;
        suma1=suma(h1);
        suma2=suma(h2);
        suma3=suma(h3);
        System.out.println(suma3);
        while(true){
            //CADA IF TIENE LA FUINCION DE COMPARAR CON LOS OTROS ARRAYS
            if(suma1>suma2 || suma1>suma3){
                h1[h1.length-cont1]=0;
                suma1=suma(h1);
                cont1++;
            }
            else if(suma2>suma1 || suma2>suma3){
                h2[h2.length-cont2]=0;
                suma2=suma(h2);
                cont2++;
            }
            else if(suma3>suma1 || suma3>suma2){
                h3[h3.length-cont3]=0;
                suma3=suma(h3);
                cont3++;
            }
            //SI LOS TRES ARRAYS SON IGUALES, SE ROMPE EL BUCLE
            else
                break;    
        }
        return suma1;
    }
    //METODO PARA SUMAR EL ARRAY
    static int suma (int[]h){
        
        int suma=0;
        for (int i = 0; i < h.length; i++)
            suma+=h[i];
        return suma;
    }
}
