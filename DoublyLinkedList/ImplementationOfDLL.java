public class ImplementationOfDLL {
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
}