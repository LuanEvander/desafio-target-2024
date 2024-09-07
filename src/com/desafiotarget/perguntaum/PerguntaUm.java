package com.desafiotarget.perguntaum;

public class PerguntaUm {
    public static void main(String[] args) {
        System.out.println("A soma dos números de 0 a 13 é: " + imprimeSoma());
    }

    public static int imprimeSoma() { // Método estático pois pertence à classe e não ao objeto
        int indice = 13;
        int soma = 0;
        int k = 0;
        
        while (k < indice) {
            k = k + 1;
            soma = soma + k;
        }

        return soma;
    }
}
