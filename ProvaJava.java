/** Donats n números enters, dir si estan ordenats creixentment. */

import java.util.Scanner; 
public class TronchoOrdenats3 {
  public static void main(String[] args){
    Scanner scanner = new Scanner (System.in);
    int numero1 = 0; //memòria
    int numero2 = 0; //numero nou llegit
    int n = scanner.nextInt(); // valor de l'entrada de teclat
    boolean ordenado = true;
    
    
    /* Si n es més gran que  0 */

    if(n>0)
        numero1 = scanner.nextInt();
    /* Mentre i sigui més petita que n s'executa el bucle*/
    
    for(int i = 1; i < n && ordenado; i++){
        numero2 = scanner.nextInt();
        if(numero2 >= numero1){
            numero1 = numero2;
        }else{
            /* Actualitzar ordenat*/
            ordenado = false;
            /* LLegir si queda alguna cosa*/
            scanner.nextLine();
            /* Sortir del bucle*/
            
        }
    }
    System.out.println(ordenado);
    }  
    }
