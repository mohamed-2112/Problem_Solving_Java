package main.problems.mergeTwoSortedLists;

import main.components.ListNode;

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode mergedList = new ListNode();
        ListNode current = mergedList;
        while(!isEmpty(list1) && !isEmpty(list2)){
            if(list1.val < list2.val){
                current.next = list1;
                list1 = list1.next;
            }else{
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }
        current.next = (!isEmpty(list1)) ? list1: list2;
        return mergedList.next;
    }

    private int getLength(ListNode list){
        int size =0;
        ListNode temp = list;
        while(!isEmpty(temp)){
            size++;
            temp = temp.next;

        }
        return size;
    }

    private boolean isEmpty(ListNode list){
        return list == null;
    }

    private void addAtEnd(ListNode list, int val){
        ListNode temp = list;
        int size = new MergeTwoSortedLists().getLength(list);
        while(size>1){
            temp = temp.next;
            size --;
        }
        temp.next = new ListNode(val);
    }


    public ListNode addList(int[] listVal){
        ListNode fullList = new ListNode();
        ListNode temp = fullList;
        for (int i=0; i< listVal.length ; i++){
            temp.val = listVal[i];
            if (i <listVal.length-1){
                temp.next = new ListNode();
                temp = temp.next;
            }
        }
        return fullList;
    }

    public void printList(ListNode list){
        while(!isEmpty(list)){
            System.out.println(list.val);
            list = list.next;
        }
    }


}
