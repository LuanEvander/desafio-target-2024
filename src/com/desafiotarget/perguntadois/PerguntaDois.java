package com.desafiotarget.perguntadois;

import java.util.Scanner;

public class PerguntaDois {
    public static boolean pertenceAoFibonacci(int num) {
        if (num < 0) {
            return false;
        }

        int a = 0;
        int b = 1;

        if (num == a || num == b) {
            return true;
        }

        while (b <= num) {
            int temp = a + b;
            a = b;
            b = temp;

            if (b == num) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("\nDigite um número inteiro: ");
        int num = scanner.nextInt();

        if (pertenceAoFibonacci(num)) {
            System.out.println("O número " + num + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + num + " não pertence à sequência de Fibonacci.");
        }
    }
}
