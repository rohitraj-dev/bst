import java.util.*;

import org.w3c.dom.Node;
class MorrisInorder
{
    ArrayList<Integer> inOrder(Node root)
    {
        ArrayList<Integer> ans = new ArrayList<>();
        Node curr = root;
        while(curr != null)
        {
            if(curr.left != null)
            {
                Node pred = curr.left;
                while(pred.right != null && pred.right != curr)
                    pred = pred.right;
                if(pred.right == null)
                {
                    pred.right = curr;
                    curr = curr.right;
                }
                else
                {
                    pred.right = null;
                    ans.add(curr.data);
                    curr = curr.right;
                }
            }
            else
            {
                ans.add(curr.data);
                curr = curr.right;
            }
        }
        return ans;
    }
}