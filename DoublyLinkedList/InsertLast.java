public class InsertLast extends ImplementationOfDLL {
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
        public ListNode InsertLast(){
            this.head=null;
            this.tail=null;
            this.length=0;
        }

        public boolean isEmpty(){
            return this.length==0;

        }
    }
    public void InsertLast(int value){
        ListNode newNode=new ListNode(value);
        if(isEmpty()){
            head=newNode;
        }
        else{
            tail.next=newNode;
            newNode.previous=tail;
        }
        tail=newNode;
        length++;

    }
    public static void main(String[] args) {
        InsertLast object=new InsertLast();
        object.InsertLast(1);
        object.InsertLast(2);
        object.InsertLast(3);
    }
    }
