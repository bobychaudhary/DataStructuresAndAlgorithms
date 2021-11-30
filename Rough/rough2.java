class SinglyLinkedList{
    private ListNode head;
    static class ListNode{
        private int  data;
        public ListNode next;
        public ListNode(int data){
            this.data=data;
            this.next=null;
        }
    }

    //to count the elements of singlylinkedlist

    public int count(){
        if(head==null){
            return 0;
        }
        int count=0;
        ListNode current=head;
        while(current!=null){
            count++;
            current=current.next;
        }
        return count;
    }

    //to insert element in the beginning
    public void insertFirst( int vlaue){
        ListNode newNode=new ListNode(value);
        newNode.next=head;
        head=newNode;
    }

    //to insert element in the last
    public void insertLast(int value){
        ListNode newNode=new ListNode(value);
            if(head==null){
            }
            ListNode current=head;
            while(current.next=null){
                current=current.next;
            }
            current=current.next;
        }
        // to display the elements of linked list
        public void display(){
            ListNode current=head;
            while(current!=null){
                System.out.print(current.data+"->");
                current=current.data;

            }
            System.out.println("null");
        }
    }
