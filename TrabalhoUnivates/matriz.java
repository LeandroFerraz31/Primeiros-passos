package TrabalhoUnivates;

public class matriz {
     public static void main (String[] args)
  {
    //Declara uma matriz de 3 linhas e 3 colunas
    int matriz[][] = new int[10][10];
    int contador = 1; //contador
    
    //Imprime a matriz
    for(int i=0; i<10; i++)
    {
      for(int j=0; j<10; j++)
      {
        matriz[i][j] = contador;
        System.out.print(matriz[i][j]+ " ");
         
      }
      System.out.println();//Pula uma linha
    }
  }
}


