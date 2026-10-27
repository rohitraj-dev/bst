import java.util.*;
class DeleteNodeBST
{
    Node deleteNode(Node root, int target)
    {
        if(root == null)
            return null;
        if(root.data > target)
            root.left = deleteNode(root.left, target);
        else if(root.data < target)
            root.right = deleteNode(root.right, target);
        else 
        {
            if(root.left == null && root.right == null)
                return null;
            if(root.left == null)
                return root.right;
            if(root.right == null)
                return root.left;
            Node succ = root.right;
            while(succ.left!=null)
                succ = succ.left;
            root.right = deleteNode(root.right, succ.data);
            succ.left = root.left;
            succ.right = root.right;
            return succ;
        }
        return root;
    }
}