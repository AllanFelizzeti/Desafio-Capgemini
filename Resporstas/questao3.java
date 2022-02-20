package Resporstas;

import javax.swing.JOptionPane;

public class questao3 {
    public static void main(String[] args) {
        String palavra = JOptionPane.showInputDialog("Digite o Anagrama:");
        String palavraStr =  Integer.toString(anagramas(palavra));
        JOptionPane.showMessageDialog(null, palavraStr);
        System.out.println(anagramas(palavra));
    }

static int anagramas(String palavra) {
        int anagramas = 0;
        int cont = 0;
        // Converte o anagrama em um array de char
        char[] array = palavra.toCharArray();
                    // Vai percorrer o anagrama procurando letras iguais
        for (int i = 0; i < array.length; i++) {
            String pos1 = Character.toString(array[i]);
            char posicao1 = pos1.charAt(0);
            cont = 0;
            for (int j = 0; j < array.length; j++) {
                String pos2 = Character.toString(array[j]);
                char posicao2 = pos2.charAt(0);
                // Se o char da posição 1 for igual ao char da posição 2 então adiciona ao contador
                if (posicao1 == posicao2) {
                cont++;
                }
                // Se o contador for maior ou igual a 2, o que significa que a letra foi encontrada mais de uma vez, então o anagrama recebe +1
                if(cont >= 2) {
                    anagramas++;
                    cont = 0;
                    // Se o i +1 for diferente do j, o que significa que há letras entre as letras iguais, então há +1 anagrama 
                    if (i + 1 != j) {
                        anagramas++;
                    }
                }
                
            }
        }
        // Retorna os anagramas dividido por 2, a divisão por dois é necessária pois as letras iguais são contadas duas vezes
        return anagramas/2;
    }
}
