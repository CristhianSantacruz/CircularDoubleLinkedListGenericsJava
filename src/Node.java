public class Node<E> {
    private E content;
    private Node<E> next;
    private Node<E> after;

    public Node(E content){
        this.content = content;
        this.next = null;
        this.after = null;
    }

    public Node<E> getAfter() {
        return after;
    }

    public void setAfter(Node<E> after) {
        this.after = after;
    }
    public Node(E content,Node<E> next){
        this.content = content;
        this.next = next;
    }
    public void setContent(E content){this.content=content;}
    public void setNext(Node<E> next){this.next = next;}
    public E getContent() {
        return content;
    }

    public Node<E> getNext() {
        return next;
    }
}
