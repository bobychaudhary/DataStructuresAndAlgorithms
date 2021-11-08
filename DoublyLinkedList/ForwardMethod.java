package DoublyLinkedList;

public class ForwardMethod {
private ListNode head;
    private ListNode tail;
    private int length;
    private class ListNode{
        private int data;
        private ListNode next;
        private ListNode previous;
        public ListNode (int data){
            this.data=data;
        }
        public ListNode ImplementsDLL(){
            this.head=null;
            this.tail=null;
            this.length=0;
        }

        public boolean isEmpty(){
            return this.length==0;

        }
    }

    public void forward(){
        if(head==null){
            return;
        }
        ListNode temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        
    }
    
}
