public class Jefatura extends Empleado implements Jefes{
    private double incentivo;
    //Constructor
    public Jefatura(String nom,double sue, int agno, int mes, int dia){
        super(nom,sue,agno,mes,dia);
    }

    public void estableceIncentivos(double b){
        this.incentivo = b;
    }

    //Interfaz de Jefes
    @Override
    public String tomar_decisiones(String decision){
        return "Un miembro de la direccion ha tomado la decision de: "+decision;
    }

    //Interfaz de Jefes
    @Override
    public String motivar(String motivacion){
        if(motivacion == "si"){
            return "El empleado ha sido motivado";
        }if (motivacion == "no"){
            return "El empleado NO ha sido motivado";
        }
        else {
            return "Motivacion incorrecta";
        }
    }
    @Override
    public double establece_bonus(double gratificacion) {
        double prima = 2000;
        return Trabajadores.bonus_base+gratificacion+prima;
    }

    public double dameSueldo(){
        double sueldoJefe = super.dameSueldo();
        return sueldoJefe+incentivo;
    }
}
