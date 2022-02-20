package Resporstas;

import java.util.Scanner;

public class questao1 {
    public static void main(String[] args) {
        
        Scanner scan = new  Scanner (System.in);
        System.out.println("Indique um número inteiro positivo:");
        int n = scan.nextInt();
        System.out.println("n = " + n);
        String out = "*"; 
        for(int linha = 0; linha <= n; linha++) {
            for(int coluna = n; coluna > 0; coluna--){
                if(coluna > linha) {
                	System.out.print(" ");
                } else {
                	System.out.print("*");
                }
            }
            System.out.println();
        }
	}
    
}
