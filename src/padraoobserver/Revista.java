/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padraoobserver;

import java.util.Observable;

public class Revista extends Observable {
    private int edicao;

    public int getEdicao() {
        return this.edicao;
    }

    public void setEdicao(int novaEdicao) {
        this.edicao = novaEdicao;
        setChanged();
        notifyObservers();
    }
}
