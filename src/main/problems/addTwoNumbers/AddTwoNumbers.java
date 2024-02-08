package main.problems.addTwoNumbers;
import main.components.ListNode;

import java.util.List;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        ListNode current = result;
        int carray = 0;
        int tempsum ;
        while (!(l1 ==null) && !(l2==null)){
            tempsum=(l1.val + l2.val + carray);
            if (tempsum < 10) {
                current.val = tempsum;
                carray = 0;
            }else{
                current.val =tempsum%10;
                carray = 1;
            }
            l1 = l1.next;
            l2 = l2.next;
            if (!(l1 ==null) && !(l2==null)){
                current.next = new ListNode();
                current = current.next;

            }
        }

        current.next = (l2==null) ? l1 : l2 ;

        while (!(current.next == null)){
            current = current.next;

            if (current.val+carray < 10) {
                current.val = current.val+ carray;
                carray = 0;
            }else{
                current.val = (current.val + carray) %10;
                carray = 1;
            }


        }
        if(carray ==1){
            current.next = new ListNode();
            current = current.next;
            current.val = 1;
        }

        return result;
    }
}
