class insertFirst{
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
        public  insertFirst(){
            this.head=null;
            this.tail=null;
            this.length=0;
    }
        public boolean isEmpty(){
            return this.length==0;

       }}
      public void insertFirst(int value){
          ListNode newNode =new ListNode(value);
          if(isEmpty()){
              tail=newNode;
          }
          else{
              head.previous=newNode;
          }
          newNode.next=head;
          head=newNode;
          length++;
      }
    
    public static void main(String[] args) {
        insertFirst object=new insertFirst();
        object.insertFirst(10); 
        object.insertFirst(20);
    }
}