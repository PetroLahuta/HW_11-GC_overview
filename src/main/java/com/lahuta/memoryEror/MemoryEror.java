package main.java.com.lahuta.memoryEror;

public class MemoryEror {
    public static void printMemoryEror(){
        int[] killMemory = new int[999999999];
        for (int i : killMemory) {
            System.out.println(i);
        }
    }
}