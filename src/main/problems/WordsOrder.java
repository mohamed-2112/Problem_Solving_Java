package main.problems;

public class WordsOrder {


    public static void main(String[] args) {
        String input = "tiger|tuna|antelope|rat|elephant|tiger";
        checkAndPrintReordering(input);
    }

    private static void checkAndPrintReordering(String input) {
        String[] words = input.split("\\|");
        boolean[] used = new boolean[words.length];
        String[] reordered = new String[words.length];

        for (int i = 0; i < words.length; i++) {
            // Attempt to start the reordering from each word
            if (findOrder(words, used, reordered, 0, words[i])) {
                System.out.println("Possible: " + String.join("|", reordered));
                return;
            }
        }

        System.out.println("Not possible");
    }

    private static boolean findOrder(String[] words, boolean[] used, String[] reordered, int index, String currentWord) {
        reordered[index] = currentWord;
        used[index] = true;

        if (index == words.length - 1) {
            return true; // Reordering complete
        }

        char lastChar = currentWord.charAt(currentWord.length() - 1);
        for (int i = 0; i < words.length; i++) {
            if (!used[i] && words[i].charAt(0) == lastChar) {
                if (findOrder(words, used, reordered, index + 1, words[i])) {
                    return true;
                }
            }
        }

        // Backtrack if no further ordering is possible
        used[index] = false;
        return false;
    }

}
