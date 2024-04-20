import java.util.LinkedList;
import java.util.Queue;
public class BinaryTreesA {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.right = this.left = null;
        }
    }
    static class BinaryTrees {
        static int idx = -1;
        public static Node BuildTree(int nodes[]){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left =  BuildTree(nodes);
            newNode.right = BuildTree(nodes);

            return newNode;
        }
        public static void preorder(Node root){//Preorder sequence of Root - Time Complexity : O(n)
            if(root == null){
//                System.out.print(-1 + "\t"); --> Inorder to get the Same Nodes Array
                return;
            }
            System.out.print(root.data + "\t");
            preorder(root.left);//Printing the Left Subtree of root by recursively calling the same fucn
            preorder(root.right);//Printing the Right Subtree of root by recursively calling the same fucn

        }
        public static void inorder(Node root){
            if(root == null){
                return;
            }
            inorder(root.left);
            System.out.print(root.data + "\t");
            inorder(root.right);
        }
        public static void postorder(Node root){
            if(root == null){
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data +  "\t");
        }
        //Level Order Traversal --> Iterative Method
        public static void LevelOrder(Node root){
            if(root == null){
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);//To Show the Next line

            while(!q.isEmpty()){
                Node currNode = q.remove();
                if(currNode == null){
                    System.out.println();//The Next Line.
                    if(q.isEmpty()){
                        break;
                    }else{
                        q.add(null);//So that we can use it to next line
                    }
                }else{
                    System.out.print(currNode.data + "\t");
                    if(currNode.left != null){
                        q.add(currNode.left);
                    }
                    if(currNode.right != null){
                        q.add(currNode.right);
                    }
                }

            }

        }
    }

    public static void main(String[] arg){
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTrees tree = new BinaryTrees();
        Node root = tree.BuildTree(nodes);
        System.out.print("Preorder:");
        tree.preorder(root);

        System.out.print("\nInorder:");
        tree.inorder(root);

        System.out.print("\nPostorder:");
        tree.postorder(root);

        System.out.print("\nLevel Order Traversal:\n");
        tree.LevelOrder(root);

         /*
                                                50
                                               /  \
                                              48   70
                                             /  \    \
                                            30  32    90
                                           / \    \     \
                                          20  35   65    98
                                         / \      / \   / \
                                        15  25   67 69 94 99
                                                  /
                                                 66

        */

        Node root2 = new Node(50);
        root2.left = new Node(48);
        root2.right = new Node(70);
        root2.left.left = new Node(30);
        root2.left.right = new Node(32);
        root2.left.right.left = new Node(31);
        root2.left.right.right = new Node(35);
        root2.left.left.left = new Node(20);
        root2.left.left.left.left = new Node(15);
        root2.left.left.left.right = new Node(25);
        root2.right.left = new Node(65);
        root2.right.left.right = new Node(67);
        root2.right.left.right.left = new Node(66);
        root2.right.left.right.right = new Node(69);
        root2.right.right = new Node(90);
        root2.right.right.right = new Node(98);
        root2.right.right.right.left = new Node(94);
        root2.right.right.right.right = new Node(99);



        System.out.print("The Inorder of given tree: ");
        BinaryTrees.inorder(root2);
        System.out.println("The Inorder of given tree: ");
        BinaryTrees.preorder(root2);
        System.out.println("The Inorder of given tree: ");
        BinaryTrees.postorder(root2);



    }
}
