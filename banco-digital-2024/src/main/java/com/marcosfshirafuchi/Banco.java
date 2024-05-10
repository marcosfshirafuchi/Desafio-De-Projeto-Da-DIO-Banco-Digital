package com.marcosfshirafuchi;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class Banco {
    private String nome;
    private List<Conta> contas;


    public void impressaoContasDoBanco(){
        System.out.println("Impressão das contas dos clientes do banco " + getNome() +":");
        for (Conta c : contas){
            System.out.println("Nome: " +c.cliente.getNome());
            System.out.println("Tipo de Conta: " +c.cliente.getTipoConta());
            System.out.println("Agência: " +c.agencia);
            System.out.println("Número da Conta: " +c.numero);
            System.out.printf("Saldo da conta: %.2f\n",c.saldo);
            // c.imprimirInfosComuns();
            System.out.println();
        }
    }
}
