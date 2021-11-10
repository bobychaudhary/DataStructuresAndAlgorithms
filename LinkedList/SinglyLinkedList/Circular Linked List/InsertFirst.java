class CircularLinkedList{
    private ListNode last;
    private int length;

    private class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
        }
}
public CircularLinkedList(){
    last = null;
    length = 0;
}

public int length(){
    return length;
}
public boolean isEmpty(){
    return length == 0;
    }
    public void createCircularLinkedList(){ //brute force method to create a circular linked list
        ListNode first=new ListNode(1);
        ListNode second=new ListNode(5);
        ListNode third=new ListNode(10);
        ListNode fourth=new ListNode(15);
        
        first.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=first;
        last=fourth;
    }

    // To traverse the circular linked list or to display the elements of the list
    public void display(){

    if(last==null){
        return;
    }
    ListNode first=last.next;
    while(first!=last){
        System.out.print(first.data+"->");
        first=first.next;
    }
    System.out.println(first.data+" ");
}


        public void insertFirst(int data){
            ListNode temp=new ListNode(data);
            if(last==null){
                last=temp;
            }
            else{
                temp.next=last.next;
            }
            last.next=temp;
            length++;
        }

    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();
        cll.createCircularLinkedList();
        cll.insertFirst(33);
        cll.display();
    }
}
