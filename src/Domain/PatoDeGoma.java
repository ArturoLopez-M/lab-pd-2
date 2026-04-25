package Domain;

public class PatoDeGoma extends Pato implements Cuaqueable, Volable{

     @Override
    public void mostrar(){
        System.out.println("Yo soy un Patito de Goma");
    }  
    
    @Override
    public void cuaquear(){
        System.out.println("Chir Chir");
     
}
     @Override
    public void volar(){
        System.out.println("INCAPAZ DE VOLAR");
    }
}
