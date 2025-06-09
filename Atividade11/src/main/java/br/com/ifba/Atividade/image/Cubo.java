/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.Atividade.image;

/**
 *
 * @author fabricio
 */
public class Cubo extends Forma3D{
    private double lado;

    public Cubo(double lado){
        this.lado = lado;
    }

    public double obterArea(){
        return 6 * lado * lado;
    }

    public double obterVolume(){
        return lado * lado * lado;
    }

    public String toString(){
        return "Cubo com área: " + obterArea() + " e volume: " + obterVolume();
    }

    public double getLado(){
        return lado;
    }

    public void setLado(double lado){
        this.lado = lado;
    }
    
    
}
