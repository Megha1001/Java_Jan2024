package tree.binarySearchTrees.seflBalancingTrees.FixBSTWithTwoNodeSwap;

/*
Approach :
Idea : Inorder traversal of BST is sorted

1. Maintain three references -> prev, first, second
2. while traversing BST in inorder fashion
    -> if prev!=null && prev.key > curr --> violation --> first!=null=> first=prev, second = curr; //there is a reason behind setting second as curr. check with example
3. After the traversal we would have values of first and second then swap the keys of these references
 */
public class EfficientSolution {

    public static void main(String[] args) {

    }
    
}