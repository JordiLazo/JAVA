public class BinaryTreeNode <E extends Comparable<E>> {
    private E element;
    private BinaryTreeNode<E> father;
    private BinaryTreeNode<E> left;
    private BinaryTreeNode<E> right;

    public BinaryTreeNode(E element) {
        this.element = element;
    }

    public BinaryTreeNode(E element, BinaryTreeNode<E> father, BinaryTreeNode<E> left, BinaryTreeNode<E> right) {
        this.element = element;
        this.father = father;
        this.left = left;
        this.right = right;
    }

    public BinaryTreeNode(E element, BinaryTreeNode<E> father) {
        this.element = element;
        this.father = father;
    }

    public BinaryTreeNode(E element, BinaryTreeNode<E> left, BinaryTreeNode<E> right) {
        this.element = element;
        this.left = left;
        this.right = right;
    }

    public E getElement() {
        return element;
    }

    public void setElement(E element) {
        this.element = element;
    }

    public BinaryTreeNode<E> getFather() {
        return father;
    }

    public void setFather(BinaryTreeNode<E> father) {
        this.father = father;
    }

    public BinaryTreeNode<E> getLeft() {
        return left;
    }

    public void setLeft(BinaryTreeNode<E> left) {
        this.left = left;
    }

    public BinaryTreeNode<E> getRight() {
        return right;
    }

    public void setRight(BinaryTreeNode<E> right) {
        this.right = right;
    }
}
