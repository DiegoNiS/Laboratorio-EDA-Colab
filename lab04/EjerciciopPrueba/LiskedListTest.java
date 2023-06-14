package lab04eda.d;

import java.util.*;

public class LiskedListTest {

    /*public static void main(String[] args) {
        int tamanoMaximo;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca el tamaño máximo del último arreglo: ");
        tamanoMaximo = teclado.nextInt();

        DoublyLinkedList<Integer> lista = new DoublyLinkedList<>();
        for (int n = tamanoMaximo; n >= 1; n--) {
            lista.add(n);
        }

        insertionSort(lista);

        // Imprimir lista ordenada
        System.out.println("Lista ordenada:");
        for (int i = 0; i < lista.size(); i++) {
            System.out.print(lista.get(i).getData() + " ");
        }
    }*/

    public static void insertionSort(DoublyLinkedList<Integer> lista) {
        for (int i = 1; i < lista.size(); i++) {
            int key = lista.get(i).getData();
            int j = i - 1;
            while (j >= 0 && lista.get(j).getData() > key) {
                lista.get(j + 1).setData(lista.get(j).getData());
                j--;
            }
            lista.get(j + 1).setData(key);
        }
    }
    
    //primer ejercicio
    
    public static LinkedList<Integer> generarPeorCaso(int t) {
        LinkedList<Integer> lista = new LinkedList<>();
        for (int i = t; i > 0; i--) {
            lista.add(i);
        }
        return lista;
    }

    public static <T extends Comparable<T>> void insertionSort(LinkedList<T> lista) {
        for (int j = 1; j < lista.size(); j++) {
            T key = lista.get(j).getData();
            int i = j - 1;
            while (i >= 0 && lista.get(i).getData().compareTo(key) > 0) {
                lista.get(i + 1).setData(lista.get(i).getData());
                i--;
            }
            lista.get(i + 1).setData(key);
        }
    }

}
