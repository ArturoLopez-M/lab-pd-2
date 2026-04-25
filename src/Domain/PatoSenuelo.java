package Domain;

public class PatoSenuelo extends Pato{
   public PatoSenuelo(){
       volable = new NoVuela();
       cuaqueable = new CuaqueoMudo();
   }     
    @Override
    public void mostrar(){
        System.out.println("Yo soy un Pato Señuelo");
    }
}
