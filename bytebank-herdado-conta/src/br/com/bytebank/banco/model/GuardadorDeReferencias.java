package br.com.bytebank.banco.model;

public class GuardadorDeReferencias {

    private Object[] referencias;
    private int posicaoArray;

    public GuardadorDeReferencias(){
        this.referencias = new Object[10];
        this.posicaoArray =  0;
    }

    public void adiciona(Object ref){
        referencias[this.posicaoArray] = ref;
        this.posicaoArray++;
    }

    public int getPosicaoArray() {

        return this.posicaoArray;
    }

    public Object getReferencias(int posicao) {
        return this.referencias[posicao];
    }
}
