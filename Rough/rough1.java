import java.util.EmptyStackException;

class stack{
    private ListNode top;
    private int length;
    private class ListNode{
        private int data;
        private ListNode next;
        ListNode(int data){
            this.data=data;
            this.data=null;
        }

    }
    public stack(){
    top=null;
    length=0;
    }
    public int length(){
        return length;
    }
    public isEmpty(){
        return length==0;
    }
    public void push(int data){
        ListNode temp=new ListNode(data);
        temp.next=top;
        top=temp;
        length++;
    }
    public int peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return toop.data;
    }
    public int pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        int result=top.data;
        top=top.next;
        length--;
        return result;
    }

    public static void main(String[] args) {
        
    }
}