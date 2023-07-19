public class Node {
    private Map<Character, Node> children;
    private boolean isEndOfWord;

    public Node() {
        this.children = new HashMap<>();
        this.isEndOfWord = false;
    }

    public Map<Character, Node> getChildren() {
        return children;
    }

    public void setChildren(Map<Character, Node> children) {
        this.children = children;
    }

    public boolean isIsEndOfWord() {
        return isEndOfWord;
    }

    public void setIsEndOfWord(boolean isEndOfWord) {
        this.isEndOfWord = isEndOfWord;
    }
    
      
}
