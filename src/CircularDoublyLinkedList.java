import java.util.Scanner;

public class CircularDoublyLinkedList<E> implements List<E> {
    private Node<E> head;
    Node<E> current;
    @Override
    public boolean isEmpty(){
        return this.head == null;
    }
    public CircularDoublyLinkedList(){
        this.head = null;
    }

    @Override
    public int size(){
        int count = 1;
        Node<E> viajero=this.head;
        while(viajero.getNext()!=this.head){
            viajero = viajero.getNext();
            count++;
        }
        return count;
    }
    @Override
    public boolean contains(E e){
        if(e==null) return false;
        Node<E> node = new Node<>(e);
        Node<E> viajero = this.head;
        while(viajero.getNext()!=this.head){
            if(viajero.getContent()==node.getContent()) return true;
            viajero = viajero.getNext();
        }
        return false;



    }
    @Override
    public boolean addFirst(E e) {
        if(e == null) {
            return false;
        }
        Node<E> nuevo  = new Node(e);
        if(isEmpty()){
            this.head = nuevo;
            nuevo.setNext(nuevo);
            nuevo.setAfter(nuevo);
        }
        else{

            Node<E> ultimo = this.head.getAfter();

            nuevo.setNext(this.head);
            nuevo.setAfter(ultimo);
            this.head.setAfter(nuevo);
            ultimo.setNext(nuevo);
            this.head = nuevo;
            this.current = this.head;
        }

        return true;
    }
    @Override
    public boolean add(E e) {

        if(e == null) return false;
        Node<E> nuevo = new Node(e);
        if(isEmpty()){
            this.head = nuevo;
            nuevo.setNext(nuevo);
            nuevo.setAfter(nuevo);

        }else{
            Node<E> ultimo = this.head.getAfter();
            nuevo.setNext(this.head);
            nuevo.setAfter(ultimo);

            this.head.setAfter(nuevo);
            ultimo.setNext(nuevo);
        }
        this.current = nuevo;
        return true;
    }

    public E removeFirst(E e){

    }

    @Override
    public String toString(){
        String s =  "";
        if(isEmpty()){
            System.out.println("hola");
            return s;
        }


        else{
            Node<E> viajero=this.head;
            do {
                s +=viajero.getContent()+ "-->";
                viajero = viajero.getNext();
            }while(viajero!=this.head);

            return s + this.head.getContent() ;
        }

    }
    @Override
    public E obtenersiguiente(){   //1--> 4 ---> 5
        if (isEmpty()) {
            System.out.println("Esta vacia");
            return null;
        } else {
            //E e = this.head.getContent();
            this.head = this.head.getNext();
            this.current= this.head;
            return this.head.getContent();
        }
    }
    @Override
    public E obtenerAnterior(){
        if (this.head == null) {
            System.out.println("Esta vacia");
            return null;
        } else {
            //E e = this.head.getContent();
            this.head = this.head.getAfter();
            this.current = this.head;
            return this.head.getContent();
        }
    }

    @Override
    public E getCurrent() {
        return this.current.getContent();
    }

    @Override
    public void  setCurrent(E e ) {
        this.current.setContent(e);
    }
    @Override
    public E getFirst(){
        return this.head.getContent();
    }
    public Node<E> getNodeFirst(){
        return this.head;
    }

}
