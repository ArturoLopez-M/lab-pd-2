
package Domain;

public class PatoCabezaRoja extends Pato implements Volable,Cuaqueable{
    
    
    @Override
    public void mostrar(){
        System.out.println("Yo soy un real PATO CABEZA ROJA");
    }
    
    @Override
    public void volar(){
    System.out.println("Puedo volar con mis alas");
}
    
    @Override
    public void cuaquear(){
        System.out.println("");
    
}
    
}
