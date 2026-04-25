package Domain;

public class PatoDeGoma extends Pato{
    public PatoDeGoma(){
        volable = new NoVuela();
        cuaqueable = new Chirreo();
    }
     @Override
    public void mostrar(){
        System.out.println("Yo soy un Patito de Goma");
    }  
}
