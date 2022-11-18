import java.util.ArrayList;

public class Driver {
    public static void main(String[] args) {
        Node<Integer> num = new Node<Integer>();
        num.setT(5);
        Node<String> string = new Node<String>();
        string.setT("Daenerys");
        Node<Double> dub = new Node<Double>(4.37);
        ArrayList<Node> nodes = new ArrayList<>();
        nodes.add(new Node<Integer>(6));
        nodes.add(new Node<String>("Drogon"));
        nodes.add(new Node<Double>(36.72));
        System.out.println(num.toString());
        System.out.println(string.toString());
        System.out.println(dub.toString());
        for(Node node: nodes) {
            System.out.println(node.toString());
        }

        Node<Integer> num2 = new Node<Integer>(15);
        num2.setNext(new Node<String>("Stef"));

        System.out.println(num2.toString());
        System.out.println(num2.getNext());

    }
}
