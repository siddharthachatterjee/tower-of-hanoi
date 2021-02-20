package com.company;

import java.util.*;

public class Main {
    static void move(int n, char source, char target, char auxiliary) {
        if (n > 0) {
            move(n - 1, source, auxiliary, target);
            System.out.println("Move disk " + n + " from " + source + " to " + target);
            move(n - 1, auxiliary, target, source);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        move(n, 'A', 'C', 'B');
    }
}
