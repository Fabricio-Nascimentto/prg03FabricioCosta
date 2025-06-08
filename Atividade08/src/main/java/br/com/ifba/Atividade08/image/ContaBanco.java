/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.Atividade08.image;

/**
 *
 * @author fabricio
 */
public class ContaBanco {
    // Atributos
    private int numConta;
    private String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    // Construtor
    public ContaBanco() {
        this.status = false;
        this.saldo = 0.0;
    }

    // Métodos getters e setters
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        if (tipo.equals("cc") || tipo.equals("cp")) {
            this.tipo = tipo;
        } else {
            System.out.println("Tipo de conta inválido.");
        }
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    // Métodos principais
    public void abrirConta(String tipo) {
        if (!this.status) {
            this.setTipo(tipo);
            this.setStatus(true);

            if (tipo.equals("cp")) {
                this.setSaldo(150.0);
            } else if (tipo.equals("cc")) {
                this.setSaldo(50.0);
            }

            System.out.println("Conta aberta com sucesso.");
        } else {
            System.out.println("A conta já está aberta.");
        }
    }
    
    //funcao para fecha conta
    public void fecharConta() {
        if (this.saldo != 0) {
            System.out.println("Erro! A conta deve estar com saldo 0 para ser fechada.");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso.");
        }
    }
    // funcao para depositar
    public void depositar(double valor) {
        if (this.status) {
            this.setSaldo(this.getSaldo() + valor);
            System.out.println("Depósito realizado com sucesso.");
        } else {
            System.out.println("Erro! Conta inativa.");
        }
    }
    
    //funcao para sacar 
    public void sacar(double valor) {
        if (this.status) {
            if (this.saldo >= valor) {
                this.setSaldo(this.getSaldo() - valor);
                System.out.println("Saque realizado com sucesso.");
            } else {
                System.out.println("Erro! Saldo insuficiente.");
            }
        } else {
            System.out.println("Erro! Conta inativa.");
        }
    }
    // essa função conbra o valor da mensalidade dos tipos de conta
    public void pagarMensal() {
        double valorMensal = 0;

        if (this.tipo.equals("cc")) {
            valorMensal = 12;
        } else if (this.tipo.equals("cp")) {
            valorMensal = 20;
        }

        if (this.status) {
            if (this.saldo >= valorMensal) {
                this.saldo -= valorMensal;
                System.out.println("Mensalidade paga com sucesso.");
            } else {
                System.out.println("Erro! Saldo insuficiente para pagar mensalidade.");
            }
        } else {
            System.out.println("Erro! Conta inativa.");
        }
    }

    // Mostrar estado atual da conta
    public void estadoAtual() {
        System.out.println("-----------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + (this.getStatus() ? "Ativa" : "Fechada"));
    }
}


