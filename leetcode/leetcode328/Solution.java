/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution{
    public ListNode oddEvenList(ListNode head){
        ListNode ptr=head;
        ListNode tail=null;
        ListNode temp=null;
        ListNode prev=null;
        int count=0;
        /**
         * 以下写法有错,尝试[1,2,3,4]得到[1,3,4] 迭代过头了，终止条件错
         */
        /*
        while(ptr!=null){
            ++count;
            if(count%2==1){
                tail=ptr;
            }
            ptr=ptr.next;
        }
        System.out.println("tail:"+tail.val);
        System.out.println("<=============");

        ptr=head;
        for(int i=0;i<count;i++){
            if(i%2==0) {
                prev=ptr;
                ptr=ptr.next;
                continue;
            } else{
                //Remove
                temp=ptr;
                prev.next=ptr.next;
                prev=ptr;
                ptr=ptr.next;
                System.out.println("temp:"+temp.val);
                
                //Insert
                ListNode temp1=tail.next;
                System.out.println("tail->next:"+temp1.val);
                tail.next=temp;
                temp.next=temp1;
                System.out.println("==temp.next:"+temp.next.val);
                tail=tail.next;
                System.out.println("==tail->next:"+tail.val);
            }
            ListNode tempPtr=head;
            while(tempPtr!=null){
                System.out.print(tempPtr.val+" ");
                tempPtr=tempPtr.next;
            }
            System.out.println("=============>");
        }*/
        
        while(ptr!=null){
            ++count;
            if(count%2!=0){
                tail=ptr;
            }
            ptr=ptr.next;
        }

        ptr=head;
        ListNode originalTail=tail;
        int i=0;
        if(head!=null){
            while(ptr!=originalTail){  //操你爸爸head还有Null,不能在这里判断head的情况
                //这里ptr!=originalTail不能写成x.val!=x.val Testcase阴的1b
                if(i%2==0) {
                    prev=ptr;
                    ptr=ptr.next;
                    ++i;
                    continue;
                } else{
                    //Remove
                    temp=ptr;
                    prev.next=ptr.next;
                    prev=ptr;
                    ptr=ptr.next;
                    
                    //Insert
                    ListNode temp1=tail.next;
                    tail.next=temp;
                    temp.next=temp1;
                    tail=tail.next;
                    ++i;
                }
            }
        }
        return head;
    }
}