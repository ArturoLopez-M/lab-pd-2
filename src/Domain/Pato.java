package Domain;

public abstract class Pato {
   Volable volable;
   Cuaqueable cuaqueable;
   
   public abstract void mostrar();
   
   
   public void RealizarVuelo(){
       volable.volar();
   }
   
   public void RealizarCuaqueo(){
       cuaqueable.cuaquear();
   } 
   
    public void nadar(){
        System.out.println("TODOS LOS PATOS NADAN");            
    }

    public void setCuaqueable(Cuaqueable cu) {
        this.cuaqueable = cu;
    }

    public void setVolable(Volable vl) {
        this.volable = vl;
    }

    
    }
    

