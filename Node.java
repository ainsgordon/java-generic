public class Node<T> {
    private T t;
    private Node next;

    public Node() {
        next = null;
    }

    public Node(T t) {
        this.t = t;
        next = null;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "t=" + t +
                ", next=" + next +
                '}';
    }
}
