public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        CircularDoublyLinkedList<Integer> cdll = new CircularDoublyLinkedList<>();

        cdll.add(4);
        cdll.add(3);
        cdll.add(10);
        cdll.addFirst(20);
        cdll.add(99);
        cdll.add(23);
        System.out.println(cdll);
        System.out.println("Size:"+cdll.size());
        System.out.println("Contains 99:"+cdll.contains(99));
        System.out.println("isEmpty?"+cdll.isEmpty());
        /*
            20-->4-->3-->10-->99-->23-->20
            Size:6
            Contains 99:true
            isEmpty?false

        * */

    }
}