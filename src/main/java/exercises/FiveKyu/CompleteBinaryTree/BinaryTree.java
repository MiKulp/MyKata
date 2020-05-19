package exercises.FiveKyu.CompleteBinaryTree;

public class BinaryTree {
    Node root;

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        int[] arr = {1, 2, 2, 6, 7, 5};
        tree.root = tree.insert(arr, tree.root, 0);
        tree.inOrder(tree.root);
    }

    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.left = null;

        }
    }


    public Node insert(int[] arr, Node root, int i) {

        if (i < arr.length) {
            Node temp = new Node(arr[i]);
            root = temp;
            root.left = insert(arr, root.left, 2 * i + 1);
            root.right = insert(arr, root.right, 2 * i + 2);

        }
        return root;
    }

    public void inOrder(Node root) {

        if (root != null) {
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }

    }
}

