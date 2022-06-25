package TrabalhoUnivates;

public class somamatriz {
  public static void main(String[]args){
    //Declaração das matriz
    int matriz [] [] = new int [8] [8];
    //Preenche as matriz
    for(int i = 0; i < 8; i++){
      System.out.println();
      for(int j = 0; j < 8; j++){
        //resultado da uma serie de numeros em ordem orizontal e vertical.
        System.out.print(matriz[i][j] = i+j);
       //Abaixo foi colocado expressão de espaço vazio para dar dinamica ao resultado.
        System.out.print("|  \s");
      }
      
    }
    }
    }

