package Generic;

public class Pareja<E> {
    private E primero;

    public Pareja(){
        primero = null;
    }
    public void setPrimero(E nuevoValor){
        primero=nuevoValor;
    }
    public E getPrimero(){
        return primero;
    }
    public static void imprimirTrabajador(Pareja<? extends Empleado> p){
        Empleado primero = p.getPrimero();
        System.out.println(primero);
    }



}
