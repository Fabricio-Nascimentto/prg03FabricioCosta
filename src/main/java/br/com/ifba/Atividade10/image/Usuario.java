/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.Atividade10.image;

import java.time.LocalDateTime;

public class Usuario {
    private long id;
    private PerfilUsuario perfil;
    private String nomeUsuario;
    private String email;
    private String senha;
    private LocalDateTime ultimoLogin;
    private boolean ativo;

    // Construtor da classe que inicializa todos os atributos
    public Usuario(long id, PerfilUsuario perfil, String nomeUsuario, String email, String senha, LocalDateTime ultimoLogin, boolean ativo) {
        this.id = id;
        this.perfil = perfil;
        this.nomeUsuario = nomeUsuario;
        this.email = email;
        this.senha = senha;
        this.ultimoLogin = ultimoLogin;
        this.ativo = ativo;
    }

    // Métodos getters e setters 
    public long getId() { return id; }
    public void setId(long id) { this.id = id;}

    public PerfilUsuario getPerfil() {return perfil; }
    public void setPerfil(PerfilUsuario perfil){ this.perfil = perfil;}

    public String getNomeUsuario() { return nomeUsuario; }
    public void setNomeUsuario(String nomeUsuario){ this.nomeUsuario = nomeUsuario;}

    public String getEmail(){return email;}
    public void setEmail(String email) { this.email = email;}

    public String getSenha() { return senha;}
    public void setSenha(String senha) { this.senha = senha;}

    public LocalDateTime getUltimoLogin() { return ultimoLogin; }
    public void setUltimoLogin(LocalDateTime ultimoLogin) { this.ultimoLogin = ultimoLogin; }

    public boolean isAtivo() { return ativo; }
    public void setAtivo(boolean ativo) { this.ativo = ativo; }

    // Sobrescreve o método toString()
    @Override
    public String toString() {
        return "Usuario{id=" + id + ", nomeUsuario='" + nomeUsuario + "', email='" + email + "', perfil=" + perfil + ", ativo=" + ativo + '}';
    }
}
