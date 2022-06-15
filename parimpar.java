import java.util.Scanner;

import javax.swing.plaf.synth.SynthMenuBarUI;

public class parimpar {
    public static void main(String[] args) throws Exception{
    
      Scanner ler = new Scanner(System.in);
    
      int num;

      System.out.println("Digite um numero: ");
      num = ler.nextInt();

        System.out.println();

        if((num % 2) == 0)
      System.out.printf("%d é um numero\"par\".\num", num);

    else
        System.out.printf("%d é um numero\"impar\".\num", num);

    }
}
