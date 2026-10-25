import java.util.*;
class Bst_Gst
{
    static int sum;
    public static void revInorder(Node root)
    {
        if(root == null)
        {
            return;
        }
        revInorder(root.right);
        int val = root.data;
        root.data = sum;
        sum += val;
        revInorder(root.left);
    }
    public static void transformTree(Node root)
    {
        sum = 0;
        revInorder(root);
    }
}