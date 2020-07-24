package main.java.com.lahuta.error;

public class MemoryError {
    public void printMemoryError() {
        int[] killMemory = new int[999_999_999];
        for (int i : killMemory) {
            System.out.println(i);
        }
    }
}