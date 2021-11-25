//It is a linear data structure used for storing the data in the form of linked list. 
//stack is an ordered list in which insertion & deletion are done at one end, called top.

// The last element inserted is the first one to be deleted called as "LIFO"
//why stack and queue are important==>commonly used for tree traversal 

//There are two operations only stack can perform -> push and pop
class Stack{
    private ListNode top;
    private int length;

    private class ListNode{
       private int data;    //can be a generic type
        private ListNode next;  //reference to next ListNode in list
        ListNode(int data){
            this.data = data;
            this.data=null;
        }
    }
    public Stack(){
        top=null;
        length=0;
    }
    public int length(){
        return length;
    }
    public boolean isEmpty(){
        return length==0;
    }
    public void push(int data){
        ListNode temp = new ListNode(data);
        temp.next = top;
        top = temp;
        length++;
         }
        public int peek(){
            if(isEmpty()){
                throw new EmptyStackException();
            }
            return top.data;
        }
   
    public int pop(){
       if(isEmpty()){
           throw new EmptyStackException();
        int result = top.data;
        top = top.next;
        length--;
        return result;
    }
}
    public static void main(String[] args) {
        Stack stack=new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());

        
    }
}