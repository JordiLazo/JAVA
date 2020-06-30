public class Furgoneta extends Coche {

        private int capacidad_carga;
        private int plazas_extra;

        public Furgoneta (int plazas_extra, int capacidad_carga){
            super(); // llama al constructor de la clase de padre
            this.capacidad_carga = capacidad_carga;
            this.plazas_extra = plazas_extra;


        }

        public String getFurgoneta(){
            return "La capacidad de carga es:"+ capacidad_carga+ "y las plazas extras son: "+plazas_extra;
        }
        public void setFurgoneta(){

        }

    }

