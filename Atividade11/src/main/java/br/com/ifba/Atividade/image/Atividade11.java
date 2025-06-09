/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.ifba.Atividade.image;

/**
 *
 * @author fabricio
 */
public class Atividade11 {

        public static void main(String[] args) {
        Forma[] formas = new Forma[4];
        formas[0] = new Circulo(5);
        formas[1] = new Cubo(3);
        formas[2] = new Quadrado(4);
        formas[3] = new Esfera(1.5);

        for (Forma f : formas){
            System.out.println(f.toString());
        }
    }
}
