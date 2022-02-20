package Resporstas;

import javax.swing.JOptionPane;
import java.util.*;
import java.lang.*;
import java.io.*;

public class questao2 {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        String senha = "";
        int z = aleatorio.nextInt(10);
        int l = aleatorio.nextInt(10);
        int h = aleatorio.nextInt(10);
        int x = aleatorio.nextInt(27);
        int v = aleatorio.nextInt(27);
        int b = aleatorio.nextInt(13);
        int q = 0;
        int w = 0;
        int e = 0;
        int r = 0;
       
                String minu[] = {"z","x","c","v","b","n","m","ç","q","w","e","r","t","y","u",
                                "i","o","p","a","s","d","f","g","h","j","k","l"};
		String maiu[] = {"Q","W","E","R","T","Y","U","I","O","P","A","S","D","F",
                                "G","H","J","K","L","Z","X","C","V","B","N","M","Ç"};
		char[] charSearch = {'!','@','#','$','%','^','&','*','(',')','-','+'};
		boolean validacao = false;
		
		while (validacao != true) {
			
			senha = JOptionPane.showInputDialog("Digite a Senha:");			
			
			if (senha.length() <= 5) { // verifica se a senha é maior ou menor que 6
                            int carac = 6 - senha.length();
                            z = aleatorio.nextInt(10);
                            l = aleatorio.nextInt(10);
                            h = aleatorio.nextInt(10);
                            x = aleatorio.nextInt(27);
                            v = aleatorio.nextInt(27);
                            b = aleatorio.nextInt(13);
                            /*Possivel solução mais não consegui achar o jeito certo para funcionar
                            q = 0;
                            w = 0;
                            e = 0;
                            r = 0;
				for (int i = 0; i < senha.length(); i++) { // verifica se contém um número
					char c = senha.charAt(i);
					if (!Character.isDigit(c)) {
                                            q = q + 1;
						if (!Character.isLowerCase(c)) { // verifica se tem minuscula
                                                    w = w + 1;
							if (!Character.isUpperCase(c)) { // verifica se tem maiuscula
                                                            e = e + 1;
								for (int j = 0; j < charSearch.length; j++) { // verifica se há caracteres
									if (charSearch[j] == c) {
                                                                            r = r + 1;
									}
								}
							}
						}
                                            }
                                        if (q == 1 || w == 0 || e == 0 || r == 0){
                                            JOptionPane.showMessageDialog(null ,"Você digitou: " + senha + ",Ela pode se tornar segura adicione: " +minu[v]+maiu[x]+charSearch[b]+ " Caracteres\n"
                                        + "Ex de senha forte " +senha+minu[v]+maiu[x]+charSearch[b]+ "\n"
                                        + "Critérios de validação:\n"
                                        + "Possuir no mínimo 6 caracteres\n"          
					+ "Conter no mínimo 1 letra em minúscula\n"
					+ "Conter no mínimo 1 letra em maiúscula\n"
					+ "Conter no mínimo 1 caractere especial\n"
					+ "Os caracteres especiais são: !@#$%^&*()-+\n");
                                            validacao = false;
                                            break;
                                        }else if (q == 0 || w == 1 || e == 0 || r ==0){
                                             z = aleatorio.nextInt(10);
                                             l = aleatorio.nextInt(10);
                                             h = aleatorio.nextInt(10);
                                            JOptionPane.showMessageDialog(null ,"Você digitou: " + senha + ",Ela pode se tornar segura adicione: " +z+maiu[x]+l+charSearch[b]+h+ " Caracteres\n"
                                        + "Ex de senha forte " +senha+z+maiu[x]+h+charSearch[b]+l+ "\n"
                                        + "Critérios de validação:\n"
                                        + "Possuir no mínimo 6 caracteres\n"
					+ "Conter no mínimo 1 letra em minúscula\n"
					+ "Conter no mínimo 1 letra em maiúscula\n"
					+ "Conter no mínimo 1 caractere especial\n"
					+ "Os caracteres especiais são: !@#$%^&*()-+\n");
                                            validacao = false;
                                            break;
                                        }
                                    }*/ 
                            // Aqui ele informa quantos caractes foram ditados e avisa quantos faltam para fazer uma senha forte
                            //no Ex de senha forte ele vai gerar alguns caracteres diferente a cada tentativa
                            //Também coloca na tela os criterios a serem atendidos 
                            JOptionPane.showMessageDialog(null ,"Você digitou: " + senha + ", ainda faltam: " + carac + " Caracteres\n"
                                        + "Ex de senha forte: " +senha+maiu[x]+z+minu[v]+l+charSearch[b]+h+"\n"
					+ "Critérios de validação:\n"
					+ "Possuir no mínimo 6 caracteres\n"
					+ "Conter no mínimo 1 digito\n"
					+ "Conter no mínimo 1 letra em minúscula\n"
					+ "Conter no mínimo 1 letra em maiúscula\n"
					+ "Conter no mínimo 1 caractere especial\n"
					+ "Os caracteres especiais são: !@#$%^&*()-+\n");
                            
			}else {
                            q = 0;
                            w = 0;
                            e = 0;
                            r = 0;
                                //Aqui se a senha é >= 6 ele vai pecorrer cada caracter verificando se atende os requisitos solicitados 
				for (int i = 0; i < senha.length(); i++) { 
					char c = senha.charAt(i);
					if (!Character.isDigit(c)) {// verifica se contém um número
                                            q = q + 1;
						if (!Character.isLowerCase(c)) { // verifica se tem minuscula
                                                    w = w + 1;
							if (!Character.isUpperCase(c)) { // verifica se tem maiuscula
                                                            e = e + 1;
								for (int j = 0; j < charSearch.length; j++) { 
									if (charSearch[j] == c) {// verifica se há caracteres
                                                                            r = r + 1;
									}
								}
							}
						}
						}
					}//Aqui é feita validação se faltou 1 numero oi letra Maiúscula ou Minúscula e Caracter especial
                                        if (q == 0 || w == 0 || e == 0){
                                            JOptionPane.showMessageDialog(null ,"Critérios de validação:\n"
                                        + "Ex de senha forte:" +maiu[x]+z+minu[v]+l+charSearch[b]+h+"\n"           
					+ "Conter no mínimo 1 letra em minúscula\n"
					+ "Conter no mínimo 1 letra em maiúscula\n"
					+ "Conter no mínimo 1 caractere especial\n"
					+ "Os caracteres especiais são: !@#$%^&*()-+\n");
                                            validacao = false;
                                        }else if (r == 0 || r >= 4){//Aqui fiz pq quando digitado 6 caracter especial ele validava 
                                                                    //acabei não conseguindo resolver isso 100% só mente dasse forma
                                            JOptionPane.showMessageDialog(null ,"Critérios de validação:\n"
                                        + "Ex de senha forte:" +maiu[x]+z+minu[v]+l+charSearch[b]+h+"\n"           
					+ "Conter no mínimo 1 letra em minúscula\n"
					+ "Conter no mínimo 1 letra em maiúscula\n"
					+ "Conter no mínimo 1 caractere especial\n"
					+ "Os caracteres especiais são: !@#$%^&*()-+\n");
                                            validacao = false;
                                        }else {
                                            validacao = true;
                                        }
				}
			}	
	JOptionPane.showMessageDialog(null,"Senha cadastrada com sucesso");
		}
    
}
