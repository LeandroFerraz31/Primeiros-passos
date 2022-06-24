package TrabalhoUnivates;

import java.util.Scanner;


public class parimpar {
  
    public static void main(String[] argss){
        //inicio a entrada do vetor com 10 posições.
        Scanner ent = new Scanner(System.in);
        int v[] = new int[11];
        //preenche posição do vetor
        for(int i = 1; i <v.length; i++){
            System.out.println("Digite o Vetor " + i + "º ");
            v[i] = ent.nextInt();
            }
            //As variaveis terão o o par e impar como primeiros valores do vetor
            int par = v[0];
            int impar = v[0];

            for(int i = 0; i <v.length; i++){
            
            if(v[i] % 2 == 0){
                par++;
            }
          
            //se o vetor iniciar de 2 casas depois de 0 e par... se iniciar de 1 em 1 e impar
             if(v[i]  % 2 == 1){
                impar++;
            }
            
        }
        System.out.println(" ");
        System.out.println(" Foram digitados  "  + par +  "  Numeros Pares\n " ); 
        System.out.println(" ");
         System.out.println(" Foram digitados   "  + impar + "  Numeros Impares ");
        
    }
}