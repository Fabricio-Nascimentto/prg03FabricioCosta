/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.Atividade.image;

/**
 *
 * @author fabricio
 */
public class Quadrado extends Forma2D{
    private double lado;

    public Quadrado(double lado){
        this.lado = lado;
    }

    public double obterArea(){
        return lado * lado;
    }

    @Override
    public String toString(){
        return "Quadrado com área: " + obterArea();
    }
}
