public class Height {
    static class Node{
        int data;
        Node right;
        Node left;

        Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }
    public static int height(Node root){
        if(root == null){
            return 0;
        }
        int lH,rH;
        lH = height(root.left);
        rH = height(root.right);
        return Math.max(lH,rH) + 1;
        //If you Don't Write + 1, the value returned will be 0 bcoz in base case value
        // returned is 0(For each time lH & RH is called) & in backtracking we do lH + rH that is basically 0 + 0.

    }
    public static int nodes(Node root){

        if(root == null){
            return 0;
        }
        int leftCount,rightCount;

        leftCount = nodes(root.left);
        rightCount = nodes(root.right);

        return leftCount + rightCount + 1;//bcoz lC & rC reaches Each node hence Their sum + 1 == total, Nodes

    }
    public static int NodesSum(Node root){
        if(root == null){
            return 0;
        }
                                                            //             int sum = root.data;
        int leftSum =  NodesSum(root.left);                 //            sum +=  NodesSum(root.left);
                                                            //
        int rightSum = NodesSum(root.right);                //            sum += NodesSum(root.right);
                                                            //
        return leftSum + rightSum + root.data;              //            return sum;
                                                            //            return 0;
                                                            //        }

    }
    public static int diameter2(Node root){//Time Complexity : O(n ^ 2) --> At each node both height(O(n)) &--
         //Approach 1 --> Inefficient!!!  // --dia(O(n)) are being calculated hence total :O(n^2)
        if(root == null){
            return 0;
        }

        int L_Dia = diameter2(root.left);//Diameter of left subtree
        int R_Dia = diameter2(root.right);//Diameter of right subtree
        int L_Height = height(root.left);//As the name suggests, Daaa!!!
        int R_Height = height(root.right);
        int self_Dia = L_Height + R_Height + 1;//Path that includes the root node in the diameter

        return Math.max(self_Dia, Math.max(L_Dia,R_Dia));//Final Diameter
    }
    static class Info{
        int dia;// Diameter
        int ht;// Height

        Info(int dia, int ht){// No separate Function call for height, diam & ht both calculated in one fucn. call
            this.dia = dia;
            this.ht = ht;
        }
    }
    public static Info diameter(Node root){//O(n)
        if (root == null){
            return new Info(0,0);
        }
        Info LeftInfo = diameter(root.left);
        Info RightInfo = diameter(root.right);

        int diam = Math.max(LeftInfo.ht + RightInfo.ht + 1, Math.max(LeftInfo.dia, RightInfo.dia));
        int ht = Math.max(LeftInfo.ht, RightInfo.ht) + 1;

        return new Info(diam,ht);

    }
    public static boolean isIdentical(Node node, Node subRoot){
        //We will check identity by checking for Non-identical conditions
        if(node == null && subRoot == null){
            return true;
        }else if(node == null || subRoot == null || subRoot.data != node.data){
            return false;
        }

        if(!isIdentical(node.left,subRoot.left)){
            return false;
        }
        if(!isIdentical(node.right,subRoot.right)){
            return false;
        }
        return true; //if all the above conditions and not true, it means that the subtree is identical

    }
    public static boolean isSubTree(Node root, Node subRoot){
        if(root == null){
            return false;
        }
        if(root.data == subRoot.data){
            if(isIdentical(root, subRoot)){
                return true;
            }
        }
        // if root != subRoot, then we check for if root.left == subRoot or not
        // Same for right
        return isSubTree(root.left, subRoot) || isSubTree(root.right, subRoot);//Returns the true ans from both
    }
    public static void KLevel(Node root,int level,int k){//Print Every Node at Kth level
        if(root == null){
            return;
        }
        if(level == k){// Time Complexity : O(n)
            System.out.print(root.data + "\t");
            return;//No need to go further to child node if the level matches
        }
        KLevel(root.left,level + 1,k);
        KLevel(root.right, level + 1, k);

    }

    public static void ClosestAncestor(Node n1,Node n2){//Given two node, find it's closest common ancestor!

    }
    public static void main(String[] arg){
        /*
                                            1
                                         /     \
                                        2       3
                                       / \     / \
                                      4   5   6   7
                                     /
                                    8
        */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.left.left = new Node(8);
        root.right.left = new Node(6);
        root.right.right = new Node(7);


        int h = height(root);
        System.out.println("The Height Of tree is: " + h);
        System.out.println("Number of Nodes in a Tree are: " + nodes(root));
        //To Find
        System.out.println("The Total Sum of Each node: " + NodesSum(root));
        System.out.println("The Diameter of the Tree: " + diameter2(root));
        System.out.println("The Diameter of the Tree (Optimized): " + diameter(root).dia + " & height: " + diameter(root).ht);

        /*

                                            2
                                          /   \
                                         4     5
                                        /
                                       8

        */

        //To Check if the given tree is a subtree of the above tree
        Node subRoot = new Node(2);
        subRoot.left = new Node(4);
//        subRoot.left.left = new Node(8);
        subRoot.right = new Node(5);

        if(isSubTree(root, subRoot)){
            System.out.println("subRoot is a sub-tree of tree root!!");
        }else{
            System.out.println("SubRoot is not a sub-tree of tree root");
        }

        //Printing Nodes at kth level
        int k = 3;
        KLevel(root,1,k);
    }

}
