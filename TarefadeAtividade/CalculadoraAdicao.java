package TarefadeAtividade;

import java.util.Scanner;

public class CalculadoraAdicao {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        // Imprime as opções.
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        int opcao; 
        
        //Pede do usuário a operação que ele deseja realizar.
        System.out.println("Escolha Uma das Opções: ");
        opcao = ler.nextInt();
        
        // Apartir da opção do usuário o programa executa um dos métodos.
        // O método While retorna para o menu de opções.
        while  (opcao != 0) {
        switch (opcao) {
           
            case 1: metodoAdicao();
                
                break;

            case 2: metodoSubtacao();

                break;

            case 3: metodoMultiplicacao();

                break;

            case 4: metodoDivisao();
            break;
        
            default: System.out.println("Opção inválida");
            break;
        }
               
        System.out.println("Escolha Outra Opção ou 0 para Sair:");
            opcao = ler.nextInt(); 
          
    }
    }
        
    
    //Método de Adição.
    public static void metodoAdicao()
    {
        Scanner ler = new Scanner(System.in);
        System.out.println("1 - Adição");
    int num1; 
    int num2; 
    System.out.println("Digite o primeiro número:");
    num1=ler.nextInt();
    System.out.println("Digite o segundo número:");
    num2=ler.nextInt();
    System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
    
    
    }
    //Método de Subtração.
    public static void metodoSubtacao()
    {
        Scanner ler = new Scanner(System.in);
        System.out.println("2 - Subtração");
    int num1; 
    int num2; 
    System.out.println("Digite o primeiro número:");
    num1=ler.nextInt();
    System.out.println("Digite o segundo número:");
    num2=ler.nextInt();
    System.out.println(num1 + " - " + num2 + "=" + (num1-num2));
    
    
    }
    //Método de Multiplicação.
    public static void metodoMultiplicacao()
    {
        Scanner ler = new Scanner(System.in);
        System.out.println("3 - Multiplicação");
    int num1; 
    int num2; 
    System.out.println("Digite o primeiro número:");
    num1=ler.nextInt();
    System.out.println("Digite o segundo número:");
    num2=ler.nextInt();
    System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
    
    
    }
    //Método de Divisão.
    public static void metodoDivisao()
    {
        Scanner ler = new Scanner(System.in);
        System.out.println("4 - Divisão");
    int num1; 
    int num2; 
    System.out.println("Digite o primeiro número:");
    num1=ler.nextInt();
    System.out.println("Digite o segundo número:");
    num2=ler.nextInt();
    System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
    
    
    }
       
}
