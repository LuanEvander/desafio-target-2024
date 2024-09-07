package com.desafiotarget.perguntacinco;

import java.util.Scanner;

public class PerguntaCinco {
    // Função para inverter os caracteres de uma string
    public static String inverterString(String original) {
        char[] caracteres = original.toCharArray(); // Converte a string em um array de caracteres
        int comprimento = caracteres.length;
        char[] invertido = new char[comprimento]; // Array para armazenar a string invertida

        // Itera sobre os caracteres da string original
        for (int i = 0; i < comprimento; i++) {
            invertido[i] = caracteres[comprimento - 1 - i]; // Atribui o caractere invertido
        }

        // Converte o array de caracteres invertido de volta para uma string
        return new String(invertido);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicita ao usuário para informar a string a ser invertida
        System.out.print("Informe a string a ser invertida: ");
        String entrada = scanner.nextLine();
        
        // Inverte a string usando a função inverterString
        String resultado = inverterString(entrada);
        
        // Exibe o resultado
        System.out.println("String invertida: " + resultado);
        
        scanner.close();
    }
}
