package DoublyLinkedList;

public class BackwardMethod {
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
    public void backward(){
        if(head==null){
            return;
        }
        ListNode temp=tail;
        while(tail!=null){
            System.out.println(tail.data+"-->");
            tail=tail.previous;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        
    }
}
