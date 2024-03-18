
//class TreeNode definition
public class TreeNode<T extends Comparable<T>> {
    // package access members
    TreeNode<T> leftNode; // left node
    T data; // node value
    TreeNode<T> rightNode; // right node

    // constructor initializes data and makes this a leaf node
    public TreeNode(T nodeData) {
        data = nodeData;
        leftNode = rightNode = null; // node has no children
    }

    // locate insertion point and insert new node; ignore duplicate values
    public void insert(T insertValue) {

        // insert in left subtree
        if (insertValue.compareTo(data) < 0) {
            if (leftNode == null) {
                leftNode = new TreeNode<>(insertValue);

            } else {
                leftNode.insert(insertValue);

            }

        }
        // insert in right subtree
        else if (insertValue.compareTo(data) > 0) {
            if (rightNode == null) {
                rightNode = new TreeNode<>(insertValue);

            } else {
                rightNode.insert(insertValue);
            }

        }

    }

}


//class Tree definition
class Tree<T extends Comparable<T>> {
    private TreeNode<T> root;

    // constructor initializes an empty Tree of integers
    public Tree() {
        root = null;
    }

    // insert a new node in the binary search tree
    public void insertNode(T insertValue) {

        if (root == null) {

            root = new TreeNode<>(insertValue); // create root node


        } else {
            root.insert(insertValue); // call the insert method
        }

    }

    // begin preorder traversal
    public void preorderTraversal() {
        preorderHelper(root);
    }


    // recursive method to perform preorder traversal
    private void preorderHelper(TreeNode<T> node) {
        if (node == null)
            return;

        System.out.printf("%s ", node.data + "\n");
        preorderHelper(node.leftNode);
        preorderHelper(node.rightNode);

    }


    // begin inorder traversal
    public void inorderTraversal() {
        inorderHelper(root);
    }

    // recursive method to perform inorder traversal
    private void inorderHelper(TreeNode<T> node) {
        if (node == null) {
            return;
        }
        inorderHelper(node.leftNode); // traverse left subtree
        System.out.printf("%s ", node.data + "\n"); // output node data
        inorderHelper(node.rightNode); // traverse right subtree
    }

    //Searches for element in tree, returns true or false for object in structure.
    public boolean search(T insertValue) {
        // from root of tree
        TreeNode<T> n = root;
        while (n != null) {
            //searches through right
            if (insertValue.compareTo(n.data) > 0) {
                n = n.rightNode;
            }//searches through left
            else if (insertValue.compareTo(n.data) < 0) {
                n = n.leftNode;
            } else
                //element is in tree
                return true;
        }//element is not in tree
        return false;
    }


    // begin postorder traversal
    public void postorderTraversal() {
        postorderHelper(root);
    }

    // recursive method to perform postorder traversal
    private void postorderHelper(TreeNode<T> node) {
        if (node == null)
            return;
        postorderHelper(node.leftNode);
        postorderHelper(node.rightNode);
        System.out.printf("%s ", node.data+ "\n");
    }


}





