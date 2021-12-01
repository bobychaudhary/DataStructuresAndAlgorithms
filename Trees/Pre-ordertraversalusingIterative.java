class PreOrder{
    int data;
    TreeNode left;
    TreeNode right;
    

if(root==null){
    return;
}
Stack<TreeNode> stack=new Stack<>();
stack.push(root);
while(!stack.isEmpty()){
    TreeNode temp=stack.pop();
    System.out.print(temp.data+" ");
    if(temp.right!=null){
        stack.push(temp.right);
    }
    if(temp.left!=null){
        stack.push(temp.left);
    }
}
}