package MainPackage;

import Domain.PatoReal;
import Domain.PatoDeGoma;
import Domain.PatoSenuelo;
import Domain.PatoCabezaRoja;

public class MainProject {

    public static void main(String[] args) {
        PatoReal        preal = new PatoReal();
        PatoDeGoma      pgoma = new PatoDeGoma();
        PatoSenuelo     psenu = new PatoSenuelo();
        PatoCabezaRoja  proja = new PatoCabezaRoja();
        
    /////////////////PatoReal/////////////////    
        preal.mostrar();
        preal.RealizarCuaqueo();
        preal.RealizarVuelo();
        preal.nadar();
        System.out.println();
        
    /////////////////PatoDeGoma/////////////////     
        pgoma.mostrar();
        pgoma.RealizarCuaqueo();
        pgoma.RealizarVuelo();
        pgoma.nadar();
        System.out.println();
        
    /////////////////PatoSeñuelo/////////////////
        psenu.mostrar();
        psenu.RealizarCuaqueo();
        psenu.RealizarVuelo();
        psenu.nadar();
        System.out.println();
        
    /////////////////PatoCabezaRoja////////////////
        proja.mostrar();
        proja.RealizarCuaqueo();
        proja.RealizarVuelo();
        proja.nadar();
        System.out.println();
    }

}
