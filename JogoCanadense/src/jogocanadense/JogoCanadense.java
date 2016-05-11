/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogocanadense;

import java.util.Scanner;

/**
 *
 * @author linolica1
 */
public class JogoCanadense {
    private String palavra;
    public JogoCanadense(String palavra) {
        this.palavra = palavra;
    }

    public String getPalavra() {
        return palavra;
    }

    public long getContagem() {
        long soma = 0;
        if (palavra == null) {
            System.out.println("Palavra não pode ser nula");
        }
        int potencia = 0;
        for (int i = palavra.length() - 1; i >= 0; i--) {
            if (palavra.substring(i, i + 1).equalsIgnoreCase("b")) {
                soma += Math.pow(2, potencia++);
            }
        }
        return soma;

    }

    public static void main(String[] ar) {
        Scanner scan = new Scanner(System.in);
        int contagem = 1;
        while (scan.hasNext()) {
            JogoCanadense jogo = new JogoCanadense(scan.next());
            System.out.println("Palavra " + contagem);
            System.out.println(jogo.getContagem());
            contagem++;
            System.out.println("");
        }
    }

}
