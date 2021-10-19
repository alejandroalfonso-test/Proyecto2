import java.util.Scanner;

public class Proyecto2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroSecreto =(int) (Math.random() * 100 + 1);
        
        System.out.println("Introduzcal numero de 0 a 100 : ");
        int numero = sc.nextInt();
        
        while (numeroSecreto != numero && numero != -1){
            if(numeroSecreto < numero){
                System.out.println("Numero Menor");
            }else {
                System.out.println("Numero Mayor");
            }
            System.out.println("Introduzca otro Numero");
            numero = sc.nextInt();
        }
        if (numeroSecreto == numero){
            System.out.println("En hora Bunea...");
        }else{
            System.out.println("Sera la proxima vez....*)");
        }

    }
    
}

