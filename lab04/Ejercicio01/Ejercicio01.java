// package Ejercicio01;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import com.panayotis.gnuplot.JavaPlot;
public class Ejercicio01 {
    // Metodo principal (main): indica que puede saltar una exception 
    public static void main(String[]args) throws IOException{
        int tamano;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el tamaño maximo del ultimo arreglo: ");
        tamano = teclado.nextInt();
        ArrayList<LinkedList<Integer>> casos = new ArrayList<LinkedList<Integer>>();
        String archivoInsercion = "insercion.txt";
        PrintWriter oS = new PrintWriter(archivoInsercion);
        // Generan peores casos y se agregan al ArrayList
        for(int n = 1; n <= tamano ; n++){
            casos.add(generarPeorCaso(n));
        }
        
        Iterator<LinkedList<Integer>> puntero = casos.iterator();
        while(puntero.hasNext()){
            oS.println(String.valueOf(insertionSort(puntero.next())));
        }
        oS.close();
        
        JavaPlot p = new JavaPlot();
        p.addPlot("\""+archivoInsercion+ "\" with lines");
        p.plot();
    }
    //Metodo generarPeorCaso: genera peores casos de ordenamiento en un LinkedList
    public static LinkedList<Integer> generarPeorCaso(int t){
        LinkedList<Integer> aux = new LinkedList<Integer>();
        for(int i = 0; i < t; i++){
            aux.add(t-i);
        }
        return aux;
    }
    //Metodo insertionSort: ordena LinkedList de menor a mayor
    public static long insertionSort(LinkedList<Integer> list){
        int key;
        int i;
        long nano_startTime =System.nanoTime();
        for(int j = 1; j<list.size(); j = j+1){
            key =(int)(list.get(j).getDato());
            i = j-1;
            while(i>-1&&(int)(list.get(i).getDato())>key){
                list.get(i+1).setDato(list.get(i).getDato());
                i = i-1;
            }
            list.get(i+1).setDato(key);
            //System.out.println(list);
        }
        long nano_endTime = System.nanoTime();
        return nano_endTime - nano_startTime;
    }
}
