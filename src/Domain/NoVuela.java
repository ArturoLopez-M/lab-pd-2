package Domain;


public class NoVuela implements Volable{

    @Override
    public void volar() {
        System.out.println("INCAPAZ DE VOLAR");
    }
    
}
