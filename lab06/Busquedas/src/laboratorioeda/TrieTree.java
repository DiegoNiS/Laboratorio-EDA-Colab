package laboratorioeda;

public class TrieTree {

    private TNode<Integer> root;

    public TrieTree(TNode<Integer> root) {
        this.root = root;
    }

    public boolean add(String word) {
        try {
            char[] letters = word.toCharArray();
            TNode<Integer> node = root;
            for (int i = 0; i < letters.length; i++) {
                TNode<Integer> thenode = new TNode<Integer>((int) letters[i]);
                if (node.getChildren() != null) {
                    if (node.getChildren().search((int) letters[0]) == null) {
                        node.getChildren().insert(thenode);
                    }
                } else {
                    node.setChildren(new TNode<Integer>((int) letters[i]));
                }

            }
        } finally {
            return false;
        }
    }

    public boolean search(String word) {
        return true;
    }

    public boolean replace(String lword, String nword) {
        return true;
    }

    public boolean exist(String word) {
        return true;
    }
}
