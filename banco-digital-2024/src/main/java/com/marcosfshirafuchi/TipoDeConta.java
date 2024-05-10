package com.marcosfshirafuchi;

public enum TipoDeConta {
    CONTA_CORRENTE("Conta Corrente"),
    CONTA_POUPANÇA("Conta Poupança");

    private String  tipoDeConta;
    TipoDeConta(String tipoDeConta) {
        this.tipoDeConta = tipoDeConta;
    }

    public String getTipoDeConta(){
        return this.tipoDeConta;
    }
}
