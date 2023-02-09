
public class Main {

    public static void main(String[] args) {
        BST<Integer> bsti = new BST<Integer>(12);
        bsti.insert(7);
        bsti.insert(19);
        // If printed in order, the below line should produce 7, 12, 19
        System.out.println(bsti);
    }

}
