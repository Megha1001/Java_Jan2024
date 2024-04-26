package tree.binarySearchTrees.seflBalancingTrees.designDataStructure.KthSmallest;

/*
Augmented tree : Maintain  lCount of nodes in the left subtree
    1. Compare (lCount+1) with K
        -> If same, return root
        -> if greater, recur for left subtree with same K
        -> if smaller, recur for right subtree with K as (k-lCount-1)
 */
public class EfficientApproach {
}
