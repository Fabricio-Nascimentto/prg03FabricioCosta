/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.Atividade.image;

/**
 *
 * @author fabricio
 */
public class Esfera extends Forma3D{
    private double raio;

    public Esfera(double raio){
        this.raio = raio;
    }

    public double obterArea(){
        return 4 * Math.PI * raio * raio;
    }

    public double obterVolume(){
        return (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);
    }

    @Override
    public String toString(){
        return "Esfera com área: " + obterArea() + " e volume: " + obterVolume();
    }
}
