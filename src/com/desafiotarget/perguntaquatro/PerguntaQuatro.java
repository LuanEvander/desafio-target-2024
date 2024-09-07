package com.desafiotarget.perguntaquatro;

public class PerguntaQuatro {
    public static void main(String[] args) {
        // Faturamento por estado
        double faturamentoSP = 67836.43;
        double faturamentoRJ = 36678.66;
        double faturamentoMG = 29229.88;
        double faturamentoES = 27165.48;
        double faturamentoOutros = 19849.53;

        // Cálculo do valor total de faturamento
        double totalFaturamento = faturamentoSP + faturamentoRJ + faturamentoMG + faturamentoES + faturamentoOutros;

        // Cálculo do percentual de representação de cada estado
        double percentualSP = (faturamentoSP / totalFaturamento) * 100;
        double percentualRJ = (faturamentoRJ / totalFaturamento) * 100;
        double percentualMG = (faturamentoMG / totalFaturamento) * 100;
        double percentualES = (faturamentoES / totalFaturamento) * 100;
        double percentualOutros = (faturamentoOutros / totalFaturamento) * 100;

        // Impressão dos resultados
        System.out.printf("Percentual de representação do faturamento em SP: %.2f%%\n", percentualSP);
        System.out.printf("Percentual de representação do faturamento em RJ: %.2f%%\n", percentualRJ);
        System.out.printf("Percentual de representação do faturamento em MG: %.2f%%\n", percentualMG);
        System.out.printf("Percentual de representação do faturamento em ES: %.2f%%\n", percentualES);
        System.out.printf("Percentual de representação do faturamento em Outros: %.2f%%\n", percentualOutros);
    }
}
