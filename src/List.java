public interface List<E> {
    boolean add(E e); //Agrefga a lo ultimo
    boolean isEmpty();
    boolean addFirst(E e);
    int size();
    boolean contains(E e);
    E obtenersiguiente(); // 1 -> 4 -> 5
    E obtenerAnterior();
    E getCurrent();
    void setCurrent(E e);
    E getFirst();

    //setActual reempleza el elemento actual con uno nuevo
}
