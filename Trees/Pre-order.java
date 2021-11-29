

// algorithm
// visit the root node traverse the left SubTreee in pre order fashion
// traverse the right   traverse  the right subtree in pre order fashion

// if we are calling funciton mroe than one time 


public void preorder(TreeNode root){
    if(root==null){ 
        return;
    }
    System.out.println(root.data)
    preorder(root.left);
    preOrder(root.right);
}
