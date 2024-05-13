package main.problems;

public class FindTheIndex {
    public int strStr(String haystack, String needle) {
        int index = haystack.indexOf(needle);
        System.out.println("index is: " + index);
        return index;

    }
}
