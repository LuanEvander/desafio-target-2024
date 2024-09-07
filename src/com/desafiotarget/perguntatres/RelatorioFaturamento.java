package com.desafiotarget.perguntatres;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RelatorioFaturamento {
    public RelatorioFaturamento() {
    }

    List<Faturamento> leArquivoDados() {
        String CAMINHO_ARQUIVO = "src/com/desafiotarget/utils/dados.json";

        List<Faturamento> faturamentos = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(CAMINHO_ARQUIVO))) {
            StringBuilder sb = new StringBuilder();

            String linha;

            while ((linha = br.readLine()) != null) {
                sb.append(linha);
            }

            String jsonString = sb.toString();
            jsonString = jsonString.substring(1, jsonString.length() - 1); // Remove colchetes externos
            String[] entries = jsonString.split("(?<=\\}),\\s*(?=\\{)"); // Divide as entradas

            for (String entry : entries) {
                entry = entry.replaceAll("[{}]", ""); // Remove chaves internas
                String[] keyValuePairs = entry.split(",\\s*");
                int dia = Integer.parseInt(keyValuePairs[0].split(":")[1].trim());
                double valor = Double.parseDouble(keyValuePairs[1].split(":")[1].trim());

                faturamentos.add(new Faturamento(dia, valor));
            }

            return faturamentos;

        } catch (FileNotFoundException e) {
            System.err.println("Arquivo não encontrado.");
        } catch (IOException e) {
            System.err.println("Erro de leitura do arquivo.");

        }
        return new ArrayList<>();
    }

    public String relatorioFaturamento(List<Faturamento> faturamentos) {
        if (faturamentos.isEmpty()) {
            return "Nenhum faturamento encontrado.";
        }

        double menorValor = Double.MAX_VALUE;
        double maiorValor = Double.MIN_VALUE;
        double somaValores = 0;
        int diasComFaturamento = 0;

        for (Faturamento f : faturamentos) {
            if (f.getValor() > 0) {
                if (f.getValor() < menorValor) {
                    menorValor = f.getValor();
                }
                if (f.getValor() > maiorValor) {
                    maiorValor = f.getValor();
                }
                somaValores += f.getValor();
                diasComFaturamento++;
            }
        }

        double mediaMensal = diasComFaturamento > 0 ? somaValores / diasComFaturamento : 0;

        int diasAcimaMedia = 0;
        for (Faturamento f : faturamentos) {
            if (f.getValor() > mediaMensal) {
                diasAcimaMedia++;
            }
        }

        return String.format(
                "Menor faturamento: R$ %.2f\nMaior faturamento: R$ %.2f\nMédia mensal: R$ %.2f\nDias com faturamento: %d\nDias acima da média: %d",
                menorValor, maiorValor, mediaMensal, diasComFaturamento, diasAcimaMedia);
    }
}
