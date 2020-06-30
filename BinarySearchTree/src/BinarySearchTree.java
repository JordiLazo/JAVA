public class BinarySearchTree<E extends Comparable<E>> {

    private BinaryTreeNode<E> root;

    public boolean isEmpty() {
        return root == null;
    }
    public BinaryTreeNode<E> getRoot(){
        return root;
    }
    public boolean isRoot (BinaryTreeNode<E> node){
        return root == node;
    }
    public boolean isLeaf (BinaryTreeNode<E> node){
        return node.getLeft() == null && node.getRight() == null;
    }

    public boolean isInternal (BinaryTreeNode<E> node){
        return !isLeaf(node);
    }

    //add recursivo
    public BinaryTreeNode<E> add(BinaryTreeNode<E> source, E element){
        BinaryTreeNode<E> node = null;
        if(root == null){
            node = new BinaryTreeNode<>(element);
            root = node;
        }else if (source == null){
            System.out.println("Source is null");
        }else {
            if(source.getElement().compareTo(element) > 0){
                if(source.getLeft() !=null ){
                    node = add(source.getLeft(), element);
                }else {
                    node = new BinaryTreeNode<>(element);
                    node.setFather(source);
                    source.setLeft(node);
                }
            }else{ // si no pasa a la derecha
                if(source.getRight() !=null ){
                    node = add(source.getRight(), element);
                }else {
                    node = new BinaryTreeNode<>(element);
                    node.setFather(source);
                    source.setRight(node);
                }
            }
        }
        return node;
    }

    public void preOrder (BinaryTreeNode<E> node){
        System.out.println(node.getElement().toString());

        if(node.getLeft()!=null){
            preOrder(node.getLeft());
        }
        if(node.getRight()!=null){
            preOrder(node.getRight());
        }
    }

    public static void main(String[] args) {
        BinarySearchTree<Integer> tree = new BinarySearchTree<>();

        tree.add(tree.getRoot(),8);
        tree.add(tree.getRoot(),4);
        tree.add(tree.getRoot(),10);
        tree.add(tree.getRoot(),12);
        tree.add(tree.getRoot(),1);
        tree.add(tree.getRoot(),9);
        tree.add(tree.getRoot(),5);

        tree.preOrder(tree.getRoot());
    }

}
