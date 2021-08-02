package clases;
import java.util.Scanner;

public abstract class ClasePadre_Abstracta {
    protected double transacciones, retiro, deposito;
    private static double saldo;
    Scanner entrada = new Scanner(System.in);

    public void Operaciones(){
        int bandera = 0;
        int seleccion = 0;

        do{
            do{
                System.out.println("Por favor, seleccione una opción: ");
                System.out.println("    1. Consulta saldo.");
                System.out.println("    2. Retiro de efectivo.");
                System.out.println("    3. Deposito de efectivo.");
                System.out.println("    4. Salir.");
                seleccion = entrada.nextInt();

                if(seleccion >=1 && seleccion <= 4){
                    bandera = 1;
                } else {
                    System.out.println("------------------------------------------");
                    System.out.println("Opción no disponible, vuelva a intentarlo");
                    System.out.println("-------------------------------------------");
                }
            } while (bandera == 0);
            if(seleccion == 1){
                ClasePadre_Abstracta mensajero = new ClaseHija_Consulta();
                mensajero.Transacciones();
            }else if(seleccion == 2){
                ClasePadre_Abstracta mensajero = new ClaseHija_Retiro();
                mensajero.Transacciones();
            }else if(seleccion == 3){
                ClasePadre_Abstracta mensajero = new ClaseHija_Deposito();
                mensajero.Transacciones();
            }else if(seleccion == 4){
                System.out.println("-------------------------");
                System.out.println("¡Gracias! vuelva pronto.");
                System.out.println("-------------------------");
                bandera = 2;
            }
        } while (bandera != 2);
    }
    public void Retiro(){
        retiro = entrada.nextDouble();
    }
    public void Deposito(){
        deposito = entrada.nextDouble();
    }
    public abstract void Transacciones();

    //getter & setter
    public double getSaldo(){
        return saldo;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
}
