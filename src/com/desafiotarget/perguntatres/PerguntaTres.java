package com.desafiotarget.perguntatres;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PerguntaTres {
    public static void main(String[] args) {
        RelatorioFaturamento relatorioFaturamento = new RelatorioFaturamento();

        List<Faturamento> faturamentos = relatorioFaturamento.leArquivoDados();
        System.out.println(relatorioFaturamento.relatorioFaturamento(faturamentos));
    }
}
