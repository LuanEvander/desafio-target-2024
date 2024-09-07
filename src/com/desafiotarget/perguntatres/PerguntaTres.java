package com.desafiotarget.perguntatres;

import java.util.List;

public class PerguntaTres {
    public static void main(String[] args) {
        RelatorioFaturamento relatorioFaturamento = new RelatorioFaturamento();

        List<Faturamento> faturamentos = relatorioFaturamento.leArquivoDados();
        System.out.println(relatorioFaturamento.relatorioFaturamento(faturamentos));
    }
}
