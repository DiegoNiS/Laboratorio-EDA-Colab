public class Trie {
    Node root;

    public Trie() {
        root = new Node();
    }

    public void insert(String word) {
        Node node = root;
        for (char ch : word.toCharArray()) {
            node.getChildren().putIfAbsent(ch, new Node());
            node = node.getChildren().get(ch);
        }
        node.setIsEndOfWord(true);
    }

    public boolean search(String word) {
        Node node = root;
        for (char ch : word.toCharArray()) {
            if (!node.getChildren().containsKey(ch)) {
                return false;
            }
            node = node.getChildren().get(ch);
        }
        return node.isIsEndOfWord();
    }

    public boolean replace(String oldWord, String newWord) {
        if (!search(oldWord)) {
            return false;
        }

        Node node = root;
        for (char ch : oldWord.toCharArray()) {
            node = node.getChildren().get(ch);
        }
        node.setIsEndOfWord(false);

        node = root;
        for (char ch : newWord.toCharArray()) {
            node.getChildren().putIfAbsent(ch, new Node());
            node = node.getChildren().get(ch);
        }
        node.setIsEndOfWord(true);

        return true;
    }

    // Método auxiliar para imprimir todas las palabras en la Trie
    public void printAllWords(Node node, StringBuilder currentWord) {
        if (node.isIsEndOfWord()) {
            System.out.println(currentWord.toString());
        }

        for (Map.Entry<Character, Node> entry : node.getChildren().entrySet()) {
            char ch = entry.getKey();
            currentWord.append(ch);
            printAllWords(entry.getValue(), currentWord);
            currentWord.deleteCharAt(currentWord.length() - 1);
        }
    }
}
