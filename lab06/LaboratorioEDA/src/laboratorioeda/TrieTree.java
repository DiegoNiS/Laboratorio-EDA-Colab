package laboratorioeda;

public class TrieTree {

    private TNode<Integer> root;

    public TrieTree(TNode<Integer> root) {
        this.root = root;
    }

    public TNode<Integer> add(String word, LinkedList<Integer> pos) {
        try {
            TNode<Integer> node = add(word);
            node.insertPosition(pos);
        } finally {
            return null;
        }
    }
    public TNode<Integer> add(String word, int pos) {
        try {
            TNode<Integer> node= add(word);
            node.insertPosition(pos);
        } finally {
            return null;
        }
    }
    
    public TNode<Integer> add(String word){
        try {
            char[] letters = word.toCharArray();
            TNode<Integer> node = root;
            TNode<Integer> thenode;
            for (int i = 0; i < letters.length; i++) {
                thenode = new TNode<Integer>((int) letters[i]);
                if (node.getChildren() != null) {
                    TNode<Integer> busca =node.getChildren().search((int) letters[i]);
                    if (busca == null) {
                        node.getChildren().insert(thenode);
                    }else{
                        thenode = busca;
                    }
                } else {
                    node.setChildren(thenode);
                }
                node = thenode;
            }
            return node;
        } finally {
            return null;
        }
    }


    public TNode<Integer> search(String word) {
        char[] caracts = word.toCharArray();
        TNode<Integer> node = root;
        TNode<Integer> temp = root;
        for(int i = 0; i < caracts.length; i++){
            temp = node.getChildren().search((int) caracts[i]);
            if(temp == null){
                return temp;
            }
            node = temp;
        }
        return temp;
    }

    public boolean replace(String lword, String nword) {
        TNode<Integer> word = search(lword);
        if(word != null){
            LinkedList<Integer> positions = word.getPositions();
            //delete word
            add
        }else{
            return false;
        }
    }
}
