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

class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp=new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int  j=0;j<=n;j++){
                if(i==0 || j==0){
                    dp[i][j]=1;
                }
                else{
                    dp[i][j]=dp[i-1][j]+dp[i][j-1];
                }
            }
        }
        return dp[m-1][n-1];
    }
}
        
        
        
        