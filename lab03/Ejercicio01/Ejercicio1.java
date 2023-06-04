
import java.util.Stack;


public class Ejercicio1 {
    public static void main(String[] args) {
        
        Stack<int[]> pila1=new Stack<>();
        Stack<int[]> pila2=new Stack<>();
        Stack<int[]> pila3=new Stack<>();
        int [] h1={1,1,1,2,3};
        int [] h2={2,3,4};
        int [] h3={1,4,1,1};
        
        pila1.push(h1);
        pila2.push(h2);
        pila3.push(h3);
        System.out.println(equalStack(pila1.pop(),pila2.pop(),pila3.pop()));
    }
    
    static int equalStack(int[]h1,int[]h2,int[]h3){
        
        int suma1=0,suma2=0,suma3=0,cont1=1,cont2=1,cont3=1;
        
        for (int i = 0; i < h1.length; i++) 
                suma1+=h1[i];      
        for (int i = 0; i < h2.length; i++) 
                suma2+=h1[i];
        for (int i = 0; i < h3.length; i++) 
                suma3+=h1[i];
        
            while(true){
                if(suma1>suma2 && suma1>suma3){
                h1[h1.length-cont1]=0;
                cont1++;
                }
                else if(suma2>suma1 && suma2>suma3){
                h2[h2.length-cont2]=0;
                cont2++;
                }
                else if(suma3>suma1 && suma3>suma1){
                h3[h3.length-cont3]=0;
                cont2++;
                }
                else
                    break;
                
            }
         
       
        return suma1;
    }
    static void suma (){
        
    }
}
