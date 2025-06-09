/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.Atividade10.image;

public class Sessao {
    private long id;
    private Usuario usuario;
    private String token;

    // Construtor da classe que inicializa todos os atributos
    public Sessao(long id, Usuario usuario, String token){
        this.id = id;
        this.usuario = usuario;
        this.token = token;
    }

    // Métodos getters e setters 
    public long getId(){ return id;}
    public void setId(long id){ this.id = id;}

    public Usuario getUsuario(){ return usuario; }
    public void setUsuario(Usuario usuario){ this.usuario = usuario;}

    public String getToken(){return token;}
    public void setToken(String token){ this.token = token;}

    // Sobrescreve o método toString()
    @Override
    public String toString(){
        return "Sessao{id=" + id + ", usuario=" + usuario.getNomeUsuario() + ", token='" + token + "'}";
    }
}
