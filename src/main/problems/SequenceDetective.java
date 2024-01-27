package main.problems;

import java.util.Scanner;

public class SequenceDetective {

        // Directions: Right, Down, Diagonal Down-Right, Diagonal Down-Left,
        // Left, Up, Diagonal Up-Left, Diagonal Up-Right
        private static final int[][] DIRECTIONS = {
                {0, 1}, {1, 0}, {1, 1}, {1, -1}, {0, -1}, {-1, 0}, {-1, -1}, {-1, 1}
        };


        public void searchSequence(int[][] grid, int[] sequence) {
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[i].length; j++) {
                    for (int[] dir : DIRECTIONS) {
                        if (checkDirection(grid, sequence, i, j, dir)) {
                            printOccurrence(sequence, i, j, dir);
                        }
                    }
                }
            }
        }

        private boolean checkDirection(int[][] grid, int[] sequence, int x, int y, int[] dir) {
            for (int k = 0; k < sequence.length; k++) {
                int newX = x + k * dir[0];
                int newY = y + k * dir[1];
                if (newX < 0 || newY < 0 || newX >= grid.length || newY >= grid[0].length || grid[newX][newY] != sequence[k]) {
                    return false;
                }
            }
            return true;
        }

        private void printOccurrence(int[] sequence, int x, int y, int[] dir) {
            System.out.print("[");
            for (int k = 0; k < sequence.length; k++) {
                int newX = x + k * dir[0];
                int newY = y + k * dir[1];
                System.out.print("[" + newX + "," + newY + "]");
                if (k < sequence.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }



}
