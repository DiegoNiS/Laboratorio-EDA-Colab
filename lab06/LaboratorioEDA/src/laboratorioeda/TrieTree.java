package laboratorioeda;

public class TrieTree {

    private TNode<Integer> root;

    public TrieTree(TNode<Integer> root) {
        this.root = root;
    }

    public boolean add(String word, LinkedList<Integer> pos) {
        try {
            TNode<Integer> node = add(word);
            node.insertPosition(pos);
            return true;
        } finally {
            return false;
        }
    }

    public boolean add(String word, int pos) {
        System.out.println("agregado");
        try {
            TNode<Integer> node = add(word);
            node.insertPosition(pos);
            return true;
        } finally {
            return false;
        }
    }

    public TNode<Integer> add(String word) {
        char[] letters = word.toCharArray();
        TNode<Integer> node = root;
        TNode<Integer> thenode;
        for (int i = 0; i < letters.length; i++) {
            thenode = new TNode<Integer>((int) letters[i]);
            if (node.getChildren() != null) {
                TNode<Integer> busca = node.getChildren().search((int) letters[i]);
                if (busca == null) {
                    node.getChildren().insert(thenode);
                } else {
                    thenode = busca;
                }
            } else {
                node.setChildren(thenode);
            }
            node = thenode;
        }
        return node;
    }

    public TNode<Integer> search(String word) {
        char[] caracts = word.toCharArray();
        TNode<Integer> node = root;
        TNode<Integer> temp = root;
        for (int i = 0; i < caracts.length; i++) {
            temp = node.getChildren().search((int) caracts[i]);
            if (temp == null) {
                return temp;
            }
            node = temp;
        }
        return temp;
    }

    public boolean replace(String lword, String nword, String[] texto) {
        TNode<Integer> word = search(lword);
        if (word != null) {
            LinkedList<Integer> positions = word.getPositions();
            //delete word
            add(nword, positions);
            LNode<Integer> pos = positions.getHead();
            while (pos != null) {
                texto[pos.getData()] = nword;
                pos = pos.getNext();
            }
            return true;
        } else {
            return false;
        }
    }
//    public int permitibledelete(String word){
//        char[] letras = word.toCharArray();
//        int nivelpermitible = 0;
//        TNode<Integer> node = root;
//        for(int i = 0; i < letras.length; i++){
//            if()
//            if(node.getChildren()!= null && (node.getChildren().isWordEnd() || hasSiblings(node.getChildren()))){
//                nivelpermitible = i;
//            }
//        }
//        return nivelpermitible;
//    }

    private boolean hasSiblings(TNode<Integer> node) {
        return node.getLeft() != null || node.getRight() != null;
    }
}
