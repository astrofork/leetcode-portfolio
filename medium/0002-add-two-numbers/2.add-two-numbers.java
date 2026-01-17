// @leet imports start
import java.util.*;

import jdk.internal.classfile.components.ClassPrinter.ListNode;

import java.math.*;
// @leet imports end

// @leet start
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

      ListNode result = new ListNode(0);
      ListNode start = result;
      
      int carry = 0;

      while(l1 != null || l2 != null){
        int sum = 0;

        if(l1 != null){
          sum += l1.val;
          l1 = l1.next;
        }

        if(l2 != null){
          sum += l2.val;
          l2 = l2.next;
        }

        if(carry == 1){
          sum = sum + 1;
          carry = 0;
        }

        if(sum > 9){
          carry = 1;
          sum = sum % 10;
        }

        result.next = new ListNode(sum);
        result = result.next;

      }
      if(carry > 0){
        result.next = new ListNode(carry);
      }

      return start.next;




    }
}
// @leet end
