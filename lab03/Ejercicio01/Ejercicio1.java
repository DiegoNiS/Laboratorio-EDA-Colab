
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
        
        
        
        
        return 0;
    }
}
