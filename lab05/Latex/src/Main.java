//package Ejercicio5;
import org.graphstream.graph.Graph;
import org.graphstream.graph.Node;
import org.graphstream.graph.implementations.SingleGraph;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws RuntimeException{
        AVLTree<Integer> avlTree = new AVLTree<>();
        
        // INPUT
        Scanner entrada=new Scanner (System.in);
        String frase;
        System.out.print("Ingrese una frase: ");
        
        
        frase=entrada.next();
        
        for (int i = 0; i < frase.length(); i++) {
            int aux=frase.charAt(i);
            avlTree.insert(aux);    // Prueba del metodo insert()
        }
        // Pruebas de los metodos search(), getMin(), getMax(), parent(), son(), remove().
        avlTree.printInOrder();
        
        System.out.println("Search 65: " + avlTree.search(65));
        System.out.println("Search 70: " + avlTree.search(70));

        System.out.println("Min: " + avlTree.getMin());
        System.out.println("Max: " + avlTree.getMax());

        System.out.println("Parent of 65: " + avlTree.parent(65));
        System.out.println("Parent of 79: " + avlTree.parent(79));

        System.out.println("Sons of 68: " + Arrays.toString(avlTree.sons(68)));
        
        avlTree.remove(79);
        
        avlTree.printInOrder();
        
        // GRAFICA con GraphStream
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
