/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padraoobserver;

public class PadraoObserver {

    public static void main(String[] args) {
        int novaEdição = 3;
        Revista revista = new Revista();
        Assinante assinante1 = new Assinante(revista);
        Assinante assinante2 = new Assinante(revista);
        
        assinante1.setNome("Plutocio");
        assinante2.setNome("Josefina");
        
        revista.setEdicao(novaEdição);
    }
    
}
