/* Llegir els noms de les  màquines i imprimir-los*/
/** Per cada màquina imprimir els numeros de productes que les seves vendes siguin inferiors a 40 unitats */
/* Per cada màquina imprimir el màxim de productes que ha venut*/
/* Mostrar quin és el producte que mes s'ha venut
aaaa
*/
import java.util.*; 
public class ProvaJava {
public static void main(String[] args) {
    /* Portar l'scanner*/
        Scanner teclat = new Scanner (System.in);
    /* Declarar variables*/
    String maquina;
    String maquinamaxima = "";
    int productemaxfinal = 0;
/* Variable de quantes unitats s'han venut del producte més venut*/
    int maximunitats = 0;
/* Variable del producte més venut de la màquina*/
    int maximproducte = 0;
    /* Llegir el text de l'entrada, bucle*/

        while(teclat.hasNext()){
        maquina = teclat.next();
        System.out.println(maquina);
        System.out.print("Menys venuts: ");
        
        /* Passar per els 6 productes*/
        for(int x = 1; x <= 6; x++){
            int vendes = teclat.nextInt();
            /** si vendes és menor de 40 imprimir  Producte -- amb -- unitats */
            if(vendes < 40){
                System.out.print("Producte "+ x + " amb "+ vendes + " unitats. ");
            }
            /* Si les vendes son superiors a maximunitats actualitzar la variable i actualitzar el valor maximproducte a x*/
            if(vendes > maximunitats){
            maximproducte = x;
            maximunitats = vendes;
            }
               /* Saber quina és la màquina que més ha venut*/
                if(maximunitats > productemaxfinal){
                maquinamaxima = maquina;
                productemaxfinal = maximunitats;

                 }
        }
        System.out.println("");
        /* Imprimir el prodcte més venut de cada màquina*/
        System.out.println("Mes venut: " + " Producte " + maximproducte + " amb "+ maximunitats  + " unitats. ");
        /* Saber quina és la màquina que més ha venut*/
        
        }
        System.out.println("El par màquina / producte de majors vendes és: " + maquinamaxima + "/" + maximunitats + " unitats");



}
}