/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        if(list1 == null && list2 == null) 
            return null;  //null checking
        if(list1 == null)
            return list2;
        if(list2 == null) 
            return list1;
    
        ListNode head = new ListNode();

        //establish head;
        if(list1.val < list2.val){
            head = list1;
            list1 = list1.next;
            
        }
        else{
            head = list2;
            list2 = list2.next;
        }
        
        head.next = mergeTwoLists(list1, list2);
        return head;
    }
}
/*
we use recursion to break a problem into smaller problems. First we set the head. Then we set the next child through recursion
*/
