package DoublyLinkedList;

import java.util.NoSuchElementException;

public class DeleteFirst {
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

    public ListNode deleteFirst(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        ListNode temp=head;
        if(head==tail){
            tail=null;
        }
        else{
            head.next.previous=null;
        }
        head=head.next;
        temp.next=null;
        return temp;
    }
    public static void main(String[] args) {
        
    }
    
}
