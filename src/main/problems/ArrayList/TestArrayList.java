package main.problems.ArrayList;

public class TestArrayList {
    public static void main(String[] args) {
        CustomArrayList<String> myList = new CustomArrayList<>();

        // Add elements
        myList.add("Element 1");
        myList.add("Element 2");
        myList.add("Element 3");
        System.out.println("After adding elements:");
        printList(myList);

        // Insert elements
        myList.insert(1, "Inserted Element");
        System.out.println("\nAfter inserting an element at index 1:");
        printList(myList);

        // Remove elements
        String removedElement = myList.remove(1);
        System.out.println("\nAfter removing the element at index 2 (" + removedElement + "):");
        printList(myList);

        // Get and print a specific element
        String elementAtIndex1 = myList.get(1);
        System.out.println("\nElement at index 1: " + elementAtIndex1);

        // Add more elements to demonstrate dynamic resizing
        myList.add("Element 4");
        myList.add("Element 5");
        System.out.println("\nAfter adding more elements:");
        printList(myList);
    }

    private static void printList(CustomArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Index " + i + ": " + list.get(i));
        }
    }
}
