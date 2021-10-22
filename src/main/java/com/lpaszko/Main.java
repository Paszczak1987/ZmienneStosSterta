package com.lpaszko;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        StackHeap.stack(input);
        StackHeap.heap(input);

        input.close();
    }
}
