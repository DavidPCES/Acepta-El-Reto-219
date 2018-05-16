
package aceptaelreto.pkg219;

import java.util.Scanner;

/**
 *
 * @author Septimus
 */
public class AceptaElReto219 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Scanner sc= new Scanner(System.in);
        int numveces=sc.nextInt();
        
      
       for(int i=0;i<numveces;i++)
       {
          int contador=0;
          int decimo=sc.nextInt();
          for(int j=1;j<=decimo;j++)
          { 
              int numeros=sc.nextInt();
              if(numeros%2==0)
              {
                contador=contador+1;  
              }
              
          }
           System.out.println(""+contador);
       }
        
        
    }
    
}
