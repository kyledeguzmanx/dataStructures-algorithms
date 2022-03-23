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
    
        ListNode head = new ListNode();
        ListNode one = list1;
        ListNode two = list2;

        //establish head;
        if(one.val < two.val){
            head = one.val;     
        }
        else{
            head = two.val;
        }
        
        while(one.next != null & two.next != null){
            ListNode newNode = new ListNode();
            
        }
    }
}
