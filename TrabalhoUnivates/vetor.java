package TrabalhoUnivates;

public class vetor {
    public static void main(String[] args) {
        //inicio a entrada do vetor com 15 posições.
    {
        int [] n = new int [15];
        //preenche posição do vetor
        for(int i = 0; i < n.length; i++)
        //Oresultado tera vetores impressos na ordem e reversa.
        {
          System.out.print(i + 1);
          System.out.print(",\s");
        }
        {
          System.out.println("\nVetor impresso na ordem.");
        }
        System.out.println("\n");
        for(int i = (n.length ); i > 0; i--)
        {

          System.out.print(i);
          System.out.print(",\s");
        }
        System.out.println("\nVetor impresso na ordem inversa.");
      
      }


        
        }
    }


