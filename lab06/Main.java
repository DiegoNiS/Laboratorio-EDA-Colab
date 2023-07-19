public class Main {
    public static void main(String[] args) {
        Trie trie = new Trie();

        // Insertar palabras en la Trie
        String[] words = {"primeraPalabra", "segundaPalabra", "terceraPalabra", "cuartaPalabra","quintaPalabra"};
        for (String word : words) {
            trie.insert(word);
        }
        
        System.out.println("-------------||Palabras en la Trie:||---------------");
        trie.printAllWords(trie.root, new StringBuilder());
        System.out.println("---------||Buscar palabras en la Trie||----------");
        // Buscar palabras en la Trie
        System.out.println(trie.search("primeraPalabra")); 
        System.out.println(trie.search("quintaPalabra"));   
        System.out.println(trie.search("tercerapalabra"));  
        
        System.out.println("-----------||Reemplazar palabras en la Trie||--------------");
        // Reemplazar palabras en la Trie
        trie.replace("primeraPalabra", "primerReemplazo");
        trie.replace("terceraPalabra", "tercerReemplazo");

         
        System.out.println("---------||Buscar palabras en la Trie segundo intento||------------");
        System.out.println(trie.search("primeraPalabra")); 
        System.out.println(trie.search("primerReemplazo"));
        System.out.println(trie.search("terceraPalabra"));  
        System.out.println(trie.search("quintoReemplazo"));   
        
        System.out.println("---------||imprimir todas las palabras||------------");
        // Imprimir todas las palabras en la Trie
        System.out.println("---------||Palabras en la Trie:||-------------");
        trie.printAllWords(trie.root, new StringBuilder());
    }
    
}
