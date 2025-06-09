/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.Atividade.image;

/**
 *
 * @author fabricio
 */
public class Circulo extends Forma3D{
    private double raio;

    public Circulo(double raio){
        this.raio = raio;
    }

    public double obterArea(){
        return Math.PI * raio * raio;
    }

    public String toString(){
        return "Círculo com área: " + obterArea();
    }

    public double getRaio(){
        return raio;
    }

    public void setRaio(double raio){
        this.raio = raio;
    }

    @Override
    public double obterVolume(){
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
