package main.problems.linkedlistlap;

public class LinkedList {
    Node head;

    int size;
    // Method to add elements to the list
    public LinkedList(){
        size = 0;
    }
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    // Method to remove the first occurrence of any duplicate element
    public void removeDuplicates() {
        Node current = head;
        while (current != null && current.next != null) {
            Node temp = current;
            while (temp.next != null) {
                if (current.data == temp.next.data) {
                    temp.next = temp.next.next;
                    size--;
                } else {
                    temp = temp.next;
                }
            }
            current = current.next;
        }
    }

    // Method to print the list
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("NULL");
    }

    public boolean isEmpty() {
        return head == null;
    }

    // Method to get data at a specific index
    public int getAt(int index) {
        Node current = head;
        int count = 0;
        while (current != null) {
            if (count == index) {
                return current.data;
            }
            count++;
            current = current.next;
        }
        throw new IndexOutOfBoundsException("Index: " + index);
    }

    // Method to remove an element with specific data
    public void remove(int data) {
        if (head == null) return;

        if (head.data == data) {
            head = head.next;
            size--;
            return;
        }

        Node current = head;
        while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next;
                size--;
                return;
            }
            current = current.next;
        }
    }


    public boolean isMirror(LinkedList otherList) {
        // Creating a copy of this list
        LinkedList copyList = new LinkedList();
        Node current = this.head;
        while (current != null) {
            copyList.add(current.data);
            current = current.next;
        }

        // Iterating through otherList and removing matching elements from copyList
        current = otherList.head;
        while (current != null) {
            copyList.remove(current.data);
            current = current.next;
        }

        // If copyList is empty, the lists are mirrors of each other
        return copyList.isEmpty();
    }

    public void mergeInNPattern(LinkedList otherList) {
        Node currentThis = this.head;
        Node currentOther = otherList.head;

        while (currentThis != null && currentOther != null) {
            // Save next pointers
            Node nextThis = currentThis.next;
            Node nextOther = currentOther.next;

            currentThis.next = currentOther;
            currentOther.next = nextThis; // It's okay if nextThis is null

            currentThis = nextThis; // Move to the next original node in the first list
            currentOther = nextOther; // Move to the next node in the second list
        }
        if (currentThis == null && currentOther != null) {
            // Find the last node of the first list
            Node last = this.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = currentOther;
        }
        otherList.head = null;
    }


    public int length() {
        return size;
    }

    private Node getNodeAt(int index) {
        Node current = head;
        int count = 0;
        while (current != null) {
            if (count == index) {
                return current;
            }
            count++;
            current = current.next;
        }
        return null; // Index out of bounds
    }





    public void swapWPattern(LinkedList otherList) {
        if (this.length() != otherList.length()) {
            System.out.println("Lists are not of the same length.");
            return;
        }

        int length = this.length();
        for (int i = 1; i < length; i += 2) { // Start from index 1 and increment by 2 for every second node
            Node prevThis = this.getNodeAt(i - 1); // Node before the one to swap in this list
            Node prevOther = otherList.getNodeAt(i - 1); // Node before the one to swap in the other list

            if (prevThis != null && prevThis.next != null && prevOther != null && prevOther.next != null) {
                Node tempThis = prevThis.next; // Node to swap from this list
                Node tempOther = prevOther.next; // Node to swap from the other list

                // Swapping nodes
                prevThis.next = tempOther;
                prevOther.next = tempThis;

                // Swapping next links of swapped nodes
                Node tempNext = tempThis.next;
                tempThis.next = tempOther.next;
                tempOther.next = tempNext;
            }
        }
    }


    public void getOriginal(LinkedList otherList) {
        this.swapWPattern(otherList); // Simply call swapWPattern again
    }


    public void listBreaker(int v) {
        boolean isFirstVFound = false;
        Node current = head;
        Node prev = null;


    }





    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }



}
