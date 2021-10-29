package LinkedList.SinglyLinkedList;
public class Delete extends SinglyLinkedlist {

    // delete first element
    public ListNode deleteFirst(){
        if(head==null){
            return null;
        }
        ListNode current=head;
        head=head.next;
        current.next=null;
        return current;
    }

    //delete last element
    public ListNode deletLast(){
        if(head==null || head.next==null){ return head; }
        ListNode current=head;
        ListNode previous=null;
        while(current.next!=null){
            previous=current;
            current=current.next;
        }
        previous.next=null;
        return current;
    }

    //take value from user and add the element at the given position
    public void insert(int position, int value){
        ListNode newNode=new ListNode(value);
        if(position==1){
            newNode.next=head;
            head=newNode;
        }
        else{
            ListNode previous=head;
            int count=1;
            while(count<position-1){
                previous=previous.next;
                count++;
            }
            ListNode current=previous.next;
            newNode.next=current;
            previous.next=newNode;
        }
    }
    

    //to delete a node form given position

    public void delete(int position){
        if(position==1){
            head=head.next;
        }
        else{
            ListNode previous=head;
            int count=1;
            while(count<position-1){
                previous=previous.next;

                count++;
            }
            ListNode current=previous.next;
            previous.next=current.next;

        }

    }
    

    public static void main(String[] args) {
        Delete obj=new Delete();
        obj.deleteFirst();
        obj.deletLast();
        
    }
    
}

