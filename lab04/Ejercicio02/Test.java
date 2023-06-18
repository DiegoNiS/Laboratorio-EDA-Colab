import com.panayotis.gnuplot.JavaPlot;
import java.io.*;
import java.util.*;

public class Test {
    public static void main(String[] args) throws IOException {
        int tamano = 500; // Tamaño máximo del último arreglo
        String archivoInsercion = "insercion.txt";
        PrintWriter oS = new PrintWriter(archivoInsercion);

        // Generar peores casos
        ArrayList<DoubleLinkedList<Integer>> casos = new ArrayList<>();
        for (int n = 1; n <= tamano; n++) {
            casos.add(generarPeorCaso(n));
        }

        // Ejecutar el algoritmo de ordenamiento en los peores casos
        for (DoubleLinkedList<Integer> caso : casos) {
            oS.println(String.valueOf(insertionSort(caso)));
            //insertionSort(caso);
        }
        oS.close();
        // plot "/Users/richarteq/eclipse-workspace/Algoritmica/insercion.txt" with lines
        JavaPlot p = new JavaPlot();
        p.addPlot("\"" + archivoInsercion + "\" with lines");
        p.plot();

//        // Imprimir los resultados
//        for (DoubleLinkedList<Integer> caso : casos) {
//            for (Integer data : caso) {
//                System.out.print(data + " ");
//            }
//            System.out.println();
//        }
    }

    public static long insertionSort(DoubleLinkedList<Integer> list) {
        if (list.size() <= 1) {
            return 0;
        }

        Node<Integer> current = list.getHead().getNextNode();
        long nano_startTime = System.nanoTime();

        while (current != null) {
            Integer key = current.getData();
            Node<Integer> previous = current.getPreviousNode();

            while (previous != null && previous.getData() > key) {
                previous.getNextNode().setData(previous.getData());
                previous = previous.getPreviousNode();
            }

            if (previous == null) {
                list.getHead().setData(key);
            } else {
                previous.getNextNode().setData(key);
            }

            current = current.getNextNode();
        }

        long nano_endTime = System.nanoTime();
        return nano_endTime - nano_startTime;
    }

    public static DoubleLinkedList<Integer> generarPeorCaso(int t) {
        DoubleLinkedList<Integer> lista = new DoubleLinkedList<>();
        for (int i = t; i >= 1; i--) {
            lista.add(i);
        }
        return lista;
    }
}
