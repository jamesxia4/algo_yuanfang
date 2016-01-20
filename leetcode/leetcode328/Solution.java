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
         * ����д���д�,����[1,2,3,4]�õ�[1,3,4] ������ͷ�ˣ���ֹ������
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
            while(ptr!=originalTail){  //����ְ�head����Null,�����������ж�head�����
                //����ptr!=originalTail����д��x.val!=x.val Testcase����1b
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