package main.components;

public class ListNode {

    public int val;
    public ListNode next;
    public ListNode() {}
    public ListNode(int val) {this.val = val; }
    public ListNode(int val, ListNode next) {this.val = val; this.next = next;}

    public static boolean isEmpty(ListNode list){
        return list == null;
    }

    public static ListNode addList(int[] listVal){
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

    public static void printList(ListNode list){
        while(!isEmpty(list)){
            System.out.println(list.val);
            list = list.next;
        }
    }


}
