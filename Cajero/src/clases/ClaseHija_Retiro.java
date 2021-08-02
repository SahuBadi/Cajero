package clases;

public class ClaseHija_Retiro extends ClasePadre_Abstracta {
    @Override
    public void Transacciones(){
        System.out.println("¿Cúanto desea retirar?: ");
        Retiro();
        if(retiro <= getSaldo()){}
    }
}
