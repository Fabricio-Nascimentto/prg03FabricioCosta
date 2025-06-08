/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.ifba.Atividade08.image;

/**
 *
 * @author fabricio
 */
public class Atividade08 {

    public static void main(String[] args) {
        ContaBanco c1 = new ContaBanco();
        c1.setNumConta(1111);
        c1.setDono("Jonatas");
        c1.abrirConta("cc");

        ContaBanco c2 = new ContaBanco();
        c2.setNumConta(2222);
        c2.setDono("Leandro");
        c2.abrirConta("cp");
        
        ContaBanco c3 = new ContaBanco();
        c3.setNumConta(3333);
        c3.setDono("James");
        c3.abrirConta("cc");

        c1.depositar(100);
        c2.depositar(500);

        c1.sacar(50);
        c2.sacar(200);

        c1.pagarMensal();
        c2.pagarMensal();

        c1.estadoAtual();
        c2.estadoAtual();

        c1.sacar(c1.getSaldo());
        c1.fecharConta();

        c1.estadoAtual();
    }
}
