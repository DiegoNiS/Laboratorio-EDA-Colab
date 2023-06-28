//package Ejercicio5;
import org.graphstream.graph.Graph;
import org.graphstream.graph.Node;
import org.graphstream.graph.implementations.SingleGraph;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws RuntimeException{
        AVLTree<Integer> avlTree = new AVLTree<>();
        /* 
        <--PRUEBAS DEL ARBOL AVL-->
        
        avlTree.insert(10);
        avlTree.insert(20);
        avlTree.insert(30);
        avlTree.insert(40);
        avlTree.insert(50);
        avlTree.insert(60);
        avlTree.insert(70);
        avlTree.printInOrder();

        System.out.println("Search 30: " + avlTree.search(30));
        System.out.println("Search 60: " + avlTree.search(60));

        System.out.println("Min: " + avlTree.getMin());
        System.out.println("Max: " + avlTree.getMax());

        System.out.println("Parent of 40: " + avlTree.parent(40));
        System.out.println("Parent of 10: " + avlTree.parent(10));

        System.out.println("Sons of 20: " + Arrays.toString(avlTree.sons(20)));

        avlTree.remove(30);
        avlTree.printInOrder();
        
        */
        
        //Frase
        Scanner entrada=new Scanner (System.in);
        String frase;
        System.out.print("Ingrese una frase: ");
        
        
        frase=entrada.next();
        
        for (int i = 0; i < frase.length(); i++) {
            int aux=frase.charAt(i);
            avlTree.insert(aux);
        }
        avlTree.printInOrder();
        
        // GRAFICA con GraphStream 1.3
        Graph graph = new SingleGraph("ArbolAVL");
        
        //Graficar los Nodos, apartir de la raiz
        graficarNodos(graph, avlTree.getRoot(), null);
        
        // Estilos
        graph.setAttribute("ui.stylesheet", "node { size: 30px; fill-color: blue; text-size: 20px; text-color: black; text-style: bold; }");

        graph.display();
    }
    public static void graficarNodos(Graph graph, NodeAvl<Integer> nodo, String padre){
        
        String nombreNodo = nodo.toString();        //nombre del Nodo
        int lengthNombre = nombreNodo.length();     
        String textoNodo = nodo.toString();         //Texto del Nodo
        
        // if para nombres de nodo repetidos
        if(graph.getNode(nombreNodo)!= null){
            int i = 2;
            while(graph.getNode(nombreNodo)!= null){
                i++;
                nombreNodo = nombreNodo.substring(0,lengthNombre);
                nombreNodo = nombreNodo +"-"+i;
            }
        }
        
        //Creacion de Nodo
        Node aux = graph.addNode(nombreNodo);
        graph.getNode(nombreNodo).setAttribute("ui.label", textoNodo);
        
        //Aristas con los padres si no son nulos, el root no tiene padre
        if(padre != null){
            graph.addEdge(padre+"-"+nombreNodo, padre, nombreNodo);
        }
        
        // Graficar los hijos si existen
        if(nodo.getLeft() != null){
            graficarNodos(graph, nodo.getLeft(), nombreNodo);
        }

        if(nodo.getRight() != null){
            graficarNodos(graph, nodo.getRight(), nombreNodo);
        }
    }
    
}
