package ControleDeAcesso;


import java.util.Scanner;

public class ControleDeAcesso {
    public static void main(String args[]) {
    Scanner ler = new Scanner(System.in);
    String nome = "Jo?o";
    int senha = 10121985;
    int diaNascimento = 10;
    int mesNascimento = 12;
    int anoNascimento = 1985;
    int dataNascimento = diaNascimento + mesNascimento + anoNascimento;
    int senhaDigitada;
    
    System.out.printf("Digite sua senha num�rica de 8 d�gitos:");
     senhaDigitada = ler.nextInt();
    if(senha == senhaDigitada){
        System.out.println("Seu acesso foi liberado.");

    if(senha == dataNascimento){
    System.out.println("Senha insegura. Por favor, troque sua senha.");
    }

}else{
   System.out.println("Sua senha est� incorreta");

}
}
}
