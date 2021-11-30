import LinkedList.SinglyLinkedList.SinglyLinkedlist;

class removeDuplicate extends SinglyLinkedlist{
    public ListNode removeDuplicate(){
    Listnode current=head;
    while(current!=null && current.next!=null){
        if(current.data=current.next.data){
            current.next=current.next.next;
        }
        else{
            current=current.next;
        }
        return current;
    }
    }
}