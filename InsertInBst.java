import java.util.*;
class InsertInBst
{
    Node insert(Node root, int key)
    {
        if(root==null)
            return new Node(key);
        if(root.data < key)
        {
            root.right = insert(root.right, key);
        }
        else if(root.data > key)
        {
            root.left = insert(root.left, key);
        }
        return root;
    }
}