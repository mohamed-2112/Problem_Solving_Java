package main.problems.linkedlistlap;

public class LinkedListDemo {

    public static void main(String[] args) {
        LinkedList[] lists = new LinkedList[8]; // Create an array to hold 8 LinkedLists

        // Initialize and populate the LinkedLists
        for (int i = 0; i < lists.length; i++) {
            lists[i] = new LinkedList();
            // Populate each list with example data, including duplicates
            lists[i].add(1);
            lists[i].add(2);
            if (i != 1 && i != 2) { // Adding duplicates except for lists 1 and 2 for demonstration
                lists[i].add(2); // Duplicate
            }
            lists[i].add(2);
            lists[i].add(3);
            lists[i].add(4);
            if (i != 1 && i != 2) { // Adding duplicates except for lists 1 and 2 for demonstration
                lists[i].add(4); // Duplicate
            }
            lists[i].add(5);
        }

        for (LinkedList list : lists) {
            list.printList();
        }

        lists[0].removeDuplicates();
        System.out.println("The first list after removing the duplicates: ");
        lists[0].printList();

        lists[1].add(6); // Only adding this to the second list
        lists[2].add(6); // Only adding this to the third list

        boolean areMirrors = lists[1].isMirror(lists[2]);
        System.out.println("Are the second and third lists mirrors of each other? " + areMirrors);



        System.out.println("The third and fourth list after merging using N pattern: ");

        lists[3].mergeInNPattern(lists[4]);

        lists[3].printList(); // Should print: 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> NULL
        lists[4].printList();

        // Populate the sixth and seventh lists with equal lengths
        lists[5] = new LinkedList();
        lists[6] = new LinkedList();

        int[] sixthListElements = {1, 2, 3, 4, 5, 6};
        int[] seventhListElements = {7, 8, 9, 10, 11, 12};
        for (int i = 0; i < sixthListElements.length; i++) {
            lists[5].add(sixthListElements[i]);
            lists[6].add(seventhListElements[i]);
        }
        System.out.println("Before applying W pattern:");
        System.out.print("Sixth List: ");
        lists[5].printList();
        System.out.print("Seventh List: ");
        lists[6].printList();
        lists[5].swapWPattern(lists[6]);

        System.out.println("\nAfter applying W pattern:");
        System.out.print("Sixth List: ");
        lists[5].printList();
        System.out.print("Seventh List: ");
        lists[6].printList();

        // Restore the original order of the lists
        lists[5].getOriginal(lists[6]);

        System.out.println("\nAfter restoring to original:");
        System.out.print("Sixth List: ");
        lists[5].printList();
        System.out.print("Seventh List: ");
        lists[6].printList();


        lists[7] = new LinkedList();
        int[] elements = {2, 1, 5, 6, 4, 8, 2, 4, 5, 3, 2, 4, 5, 2, 2};
        for (int elem : elements) {
            lists[7].add(elem);
        }

        System.out.println("Original list:");
        lists[7].printList();

        // Apply listBreaker
        lists[7].listBreaker(2);

        System.out.println("After applying listBreaker with v = 2:");
        lists[7].printList();
    }
}
