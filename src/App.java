import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double download,velocidade,resultado;

       Scanner teclado = new Scanner(System.in);

       System.out.print("Qual o tamanho do arquivo para o download em MB?: ");
         download = teclado.nextDouble();
         System.out.print("Qual a sua velocidade de internet em MBPS: ");
         velocidade = teclado.nextDouble();
         teclado.close();

         resultado = (download * velocidade /8) /60;
         System.out.printf("o tempo aproximado de download do arquivo usando este link eh: %.1f minutos",resultado);

    }
}
