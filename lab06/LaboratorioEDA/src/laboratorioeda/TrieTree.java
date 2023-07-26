package laboratorioeda;

public class TrieTree {

    private TNode<Integer> root;

    public TrieTree(TNode<Integer> root) {
        this.root = root;
    }

    public boolean add(String word, int pos) {
        try {
            boolean wasinserted = false;
            char[] letters = word.toCharArray();
            TNode<Integer> node = root;
            TNode<Integer> thenode;
            for (int i = 0; i < letters.length; i++) {
                thenode = new TNode<Integer>((int) letters[i]);
                if (node.getChildren() != null) {
                    TNode<Integer> busca =node.getChildren().search((int) letters[i]);
                    if (busca == null) {
                        node.getChildren().insert(thenode);
                        wasinserted = true;
                    }else{
                        thenode = busca;
                        wasinserted = false;
                    }
                } else {
                    node.setChildren(thenode);
                    wasinserted = true;
                }
                node = thenode;
            }
            if(wasinserted){
                node.ins
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
