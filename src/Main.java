//IS 247 Arianna Richardson
//Make-up Assignment
//Purpose: To demonstrate code to implement Binary search tree structure and the various modes of traversal with inheritance class objects.
//Main
public class Main {
    public static void main(String[] args) {
        //New Binary Tree
        Tree<Temperature> temp = new Tree<>();
       // Inheritance class objects
        Temperature t1 = new Temperature(30, "New York City");
        Temperature t2 = new Temperature(75, "Baltimore");
        Temperature t3 = new Temperature(-40, "Antarctica");
        Temperature t4 = new Temperature(86, "Los Angeles");
        Temperature t5 = new Temperature(97, "Orlando");
   //Duplicate value to test in tree
        Temperature t6 = new Temperature(97, "Orlando");
   //Value to test search method.
        Temperature t7 = new Temperature(96, "Atlanta");

//inserting nodes into tree.
        temp.insertNode(t1);
        temp.insertNode(t2);
        temp.insertNode(t3);
        temp.insertNode(t4);
        temp.insertNode(t5);
        temp.insertNode(t6);
        //Search method (value in tree)
        System.out.println("\n Searching for element in tree:");
        System.out.println("Is node in tree? " +temp.search(t4));
        //Search method (value not in tree)
        System.out.println("Is node in tree? " + temp.search(t7));
        System.out.println("\n Traversals:");
//Preorder Traversal
        System.out.print("Preorder (sorted): \n");
        temp.preorderTraversal();
//Inorder Traversal
        System.out.println("\n Inorder (sorted): \n");
        temp.inorderTraversal();

    //Post-Order Traversal
        System.out.println("\n Post-order (sorted): \n");
        temp.postorderTraversal();
}
    }

