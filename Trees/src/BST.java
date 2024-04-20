import java.util.ArrayList;

public class BST {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }
    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data + "\t");
        inorder(root.right);
    }

    public static boolean search(Node root,int key){
        if(root == null){
            return false;
        }
         if(key == root.data){
             return true;
         }
         if(key > root.data){

             return search(root.right, key);

         }
         else{
            return search(root.left, key);
         }
    }

    public static Node insert(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        if(root.data > val){
            root.left = insert(root.left,val);
        }
        if(root.data < val){
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static Node delete(Node root, int val){
        if(root.data < val){
            root.right = delete(root.right, val);
        }
        else if(root.data > val){
            root.left = delete(root.left, val);
        }
        else{//Voila Case --> Found The val that we were looking for!

            //case 1 : Leaf Node
            if(root.left ==  null  && root.right == null){
                return null;
            }
            //Case 2 : Single Child Node
            if(root.right == null){
                return root.left;
            }
            else if(root.left == null){
                return root.right;
            }

            //Case 3 : Node with two child
            Node InSuccor = inordersuccessor(root.right);
            root.data = InSuccor.data;
            root.right = delete(root.right,InSuccor.data);
        }
        return root;
    }

    public static Node inordersuccessor(Node root) {
        while(root.left != null){
            root = root.left;
        }
        return root;
    }

    public static void main(String[] arg){
      int values[] = {1, 3, 5, 8, 0, 9, 12, 4, 2 ,15};
      Node root = null;

      for(int i=0; i< values.length; i++){
          root = insert(root,values[i]);
      }

      inorder(root);
      delete(root,12);
      System.out.println();
      inorder(root);

      int key = 8;
      if(search(root, key)){
          System.out.println("\nThe Key is Found");
      }else{
          System.out.println("\nThe Was not Found");
      }
    }

}
