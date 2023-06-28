//package Ejercicio5;
public class AVLTree<E extends Comparable<E>> {
    private NodeAvl<E> root;

    public AVLTree() {
        root = null;
    }

    public NodeAvl<E> getRoot() {
        return root;
    }

    public void insert(E data) {
        root = insertNode(root, data);
    }

    private NodeAvl<E> insertNode(NodeAvl<E> node, E data) {
        if (node == null) {
            return new NodeAvl<>(data);
        }

        if (data.compareTo(node.getData()) < 0) {
            node.setLeft(insertNode(node.getLeft(), data));
        } else if (data.compareTo(node.getData()) > 0) {
            node.setRight(insertNode(node.getRight(), data));
        } else {
            // Duplicate values are not allowed in AVL trees
            return node;
        }

        // Update the balance factor of the node
        node.setBf(calculateBalanceFactor(node));

        // Perform rotations if necessary to maintain AVL balance
        node = balanceNode(node);

        return node;
    }

    public boolean search(E data) {
        return searchNode(root, data);
    }

    private boolean searchNode(NodeAvl<E> node, E data) {
        if (node == null) {
            return false;
        }

        if (data.compareTo(node.getData()) < 0) {
            return searchNode(node.getLeft(), data);
        } else if (data.compareTo(node.getData()) > 0) {
            return searchNode(node.getRight(), data);
        } else {
            return true;
        }
    }

    public E getMin() {
        if (root == null) {
            return null;
        }

        NodeAvl<E> current = root;
        while (current.getLeft() != null) {
            current = current.getLeft();
        }
        return current.getData();
    }

    public E getMax() {
        if (root == null) {
            return null;
        }

        NodeAvl<E> current = root;
        while (current.getRight() != null) {
            current = current.getRight();
        }
        return current.getData();
    }

    public E parent(E data) {
        NodeAvl<E> parentNode = findParent(root, data);
        if (parentNode != null) {
            return parentNode.getData();
        }
        return null;
    }

    private NodeAvl<E> findParent(NodeAvl<E> node, E data) {
        if (node == null) {
            return null;
        }

        if ((node.getLeft() != null && node.getLeft().getData().equals(data))
                || (node.getRight() != null && node.getRight().getData().equals(data))) {
            return node;
        }

        if (data.compareTo(node.getData()) < 0) {
            return findParent(node.getLeft(), data);
        } else if (data.compareTo(node.getData()) > 0) {
            return findParent(node.getRight(), data);
        }

        return null;
    }

    public E[] sons(E data) {
        NodeAvl<E> parentNode = findNode(root, data);
        if (parentNode != null) {
            E[] sons = (E[]) new Comparable[2];
            sons[0] = parentNode.getLeft() != null ? parentNode.getLeft().getData() : null;
            sons[1] = parentNode.getRight() != null ? parentNode.getRight().getData() : null;
            return sons;
        }
        return null;
    }

    private NodeAvl<E> findNode(NodeAvl<E> node, E data) {
        if (node == null) {
            return null;
        }

        if (data.compareTo(node.getData()) < 0) {
            return findNode(node.getLeft(), data);
        } else if (data.compareTo(node.getData()) > 0) {
            return findNode(node.getRight(), data);
        } else {
            return node;
        }
    }

    public void remove(E data) {
        root = removeNode(root, data);
    }

    private NodeAvl<E> removeNode(NodeAvl<E> node, E data) {
        if (node == null) {
            return null;
        }

        if (data.compareTo(node.getData()) < 0) {
            node.setLeft(removeNode(node.getLeft(), data));
        } else if (data.compareTo(node.getData()) > 0) {
            node.setRight(removeNode(node.getRight(), data));
        } else {
            // Node to be removed found
            if (node.getLeft() == null && node.getRight() == null) {
                // Node is a leaf
                return null;
            } else if (node.getLeft() == null) {
                // Node has only a right child
                return node.getRight();
            } else if (node.getRight() == null) {
                // Node has only a left child
                return node.getLeft();
            } else {
                // Node has both left and right children
                // Find the successor (minimum value in the right subtree)
                NodeAvl<E> successor = findMinNode(node.getRight());
                node.setData(successor.getData());
                node.setRight(removeNode(node.getRight(), successor.getData()));
            }
        }

        // Update the balance factor of the node
        node.setBf(calculateBalanceFactor(node));

        // Perform rotations if necessary to maintain AVL balance
        node = balanceNode(node);

        return node;
    }

    private NodeAvl<E> findMinNode(NodeAvl<E> node) {
        if (node.getLeft() == null) {
            return node;
        }
        return findMinNode(node.getLeft());
    }

    private int calculateBalanceFactor(NodeAvl<E> node) {
        int leftHeight = getHeight(node.getLeft());
        int rightHeight = getHeight(node.getRight());
        return rightHeight - leftHeight;
    }

    private int getHeight(NodeAvl<E> node) {
        if (node == null) {
            return -1;
        }
        return Math.max(getHeight(node.getLeft()), getHeight(node.getRight())) + 1;
    }

    private NodeAvl<E> balanceNode(NodeAvl<E> node) {
        if (node.getBf() < -1) {
            // Left rotation needed
            if (node.getLeft().getBf() > 0) {
                node.setLeft(leftRotate(node.getLeft()));
            }
            return rightRotate(node);
        } else if (node.getBf() > 1) {
            // Right rotation needed
            if (node.getRight().getBf() < 0) {
                node.setRight(rightRotate(node.getRight()));
            }
            return leftRotate(node);
        }
        return node;
    }

    private NodeAvl<E> leftRotate(NodeAvl<E> node) {
        NodeAvl<E> newRoot = node.getRight();
        node.setRight(newRoot.getLeft());
        newRoot.setLeft(node);
        node.setBf(calculateBalanceFactor(node));
        newRoot.setBf(calculateBalanceFactor(newRoot));
        return newRoot;
    }

    private NodeAvl<E> rightRotate(NodeAvl<E> node) {
        NodeAvl<E> newRoot = node.getLeft();
        node.setLeft(newRoot.getRight());
        newRoot.setRight(node);
        node.setBf(calculateBalanceFactor(node));
        newRoot.setBf(calculateBalanceFactor(newRoot));
        return newRoot;
    }

    public void printInOrder() {
        printInOrder(root);
        System.out.println();
    }

    private void printInOrder(NodeAvl<E> node) {
        if (node != null) {
            printInOrder(node.getLeft());
            System.out.print(node.getData() + " ");
            printInOrder(node.getRight());
        }
    }
    
}
