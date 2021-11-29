
//Tree Data Structure & Binary Trees

//A tree is a non lineasr data structure which organized data in a hierarchical manner and this is a recursive data structure.
// use of non-linear-> organized data in a hierarchical manner(9->8->7->6->5->4->3->2->1)
// OR
// A tree is a connected graph without any circuits

//If in a graph, there is one and only one part between everry pair of vertices, then graph is called as a  tree {
//   Properties of a tree
//   1 There is one and only one path between every pair of vertics in a tree
//   2 A tree with n vertices has n-1 edges.
//  3 a grapj is a tree if and only if it is minimally connected 
//  4 Any connected graph with n vertices add n-1 edges is a tree

// 1 Root->the first node from where the tree orginated is called as a root node. Node A is the only root node.
// 2 Edge-> The connecting link between any two nodes is called as an edge.
//  In a tree with n number of nodes, there are exactly n-1 number of edges.
// 3 Parent->The node which has a branch from it to any other node is called as a parent node.
//  the  node which has one or more children is called as a parent node.
//  In a tree, a parent node can have any number of child nodes.
// 4  Child-> The node which is a descendant of a parent node  or some node is called as a child node.
//  All the nodes except the root node are called as child nodes.
// 5 Siblings-> Nodes which belong to the same parent node are called as siblings.
//  Nodes with the same parent are siblings nodds.
//  6 Degree-> Degree of a node is the total number of children of that node.
//   Degree of a tree is the highest degree of a node among all the nodes in the tree 
//  7 Internal Node-> The node has at least one child is called as an internal node.
//    Internal nodes are also called as non-terminal nodes.
//    Every non-leaf node is an internal node.
//    nodes A,B,C,E and G are internal nodes.
//  8 Leaf Node--> Leaf node is the happiest node  of the leaf node.
//     The node which does not have any child is called as a leaf node.
//    Leaf nodes are also called as external nodes or terminal nodes.
//    Nodes DI,J,F,L and H are leaf nodes
//  9 Level->In a tree, each step from top to bottom is called as a level of a tree 
//  The level count start with 0 by default and increments by 1 at each level or step.

//  10 Height->Total number of edges that lies on the longest path from any leaf node to a particual node is called as Height of that Node
//   Height of a tree is the height of root node
//   What is the height of all leaf nodes=0
//   11 Depth--> Total  number of edges from root node to a particular node is called as Depth of that node

//   What is the depth of a tree-> Depth of a tree is the total number of edges from root node to a leeaf node in the longest path
//   Depth of the root node=0
//   11 SubTreee--> In a tre,, each child from a node forms a sub-tree recursively.
//   Every child node froms a sub-tree on its parent node.

//   What is Binary Tree-> A binary tree is a special tree in which  a node can have at most two children or two children( 0 child, 1 child, 2 children)
  
//   What is the total number of combination of binary tree with n nodes? 
//     The total number of binary trees with n nodes is 2^n-1

//     Unlabeled Binary Tree
//     A binary treeis Unlabeled if its nodes are not assigned any label.abstract
//     Number of different binary trees possibel with n Unlabeled nodes= 2nCn/n+1


//     Labeled Binary Tree->
//     A binary tree is labeled if all its nodes are assigned a label.
//     Number of different binary trees possibel with n labeled nodes= 2nCn/n+1 n!


// It is a non linear data structure which used for storing data
// It is made up of nodes and edges without having a cycle

// What is Binary Tree
// a tree is a binary tree, if each node has 9,1, or 2 child nodes.

 class TreeNode{
    private eTreeNode left;
    private TreeNode right;
    private int data; // generic type

    public TreeNode(int data){
        this.data=data;

    }

}

// Implementing binary tree
 class BinaryTree{
    private TreeNode root;
    private class TreeNode{
        private TreeNode left;
        private TreeNode right;
        private int data; //can be any generic type

        public TreeNoded(int data){
            this.data=data;
        }
    }
    public void createBinaryTree(){
        TreeNode first =new TreeNode(1);
        TreeNode second=new TreeNode(2);    //bruteforce 
        TreeNode third=new TreeNode(3);
        root=first;
        first.left=second;
        first.right=hthird;

    }

    //Recursive pre-order traversal of a binary tree

    

// algorithm
// visit the root node traverse the left SubTreee in pre order fashion
// traverse the right   traverse  the right subtree in pre order fashion
// if we are calling funciton mroe than one time 


public void preorder(TreeNode root){
    if(root==null){     //base case
        return;
    }
    System.out.println(root.data);
    preorder(root.left);
    preOrder(root.right);
}

    public static void main(String[] args) {
        BinaryTree bt=new BinaryTree();
        bt.createBinaryTree();
    }

}