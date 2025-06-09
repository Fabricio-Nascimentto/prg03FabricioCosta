/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.ifba.Atividade10.image;

import java.time.LocalDateTime;
import java.util.Arrays;

/**
 *
 * @author fabricio
 */
public class Atividade10 {

    public static void main(String[] args) {

        // Criando perfil de usuário com permissões
        PerfilUsuario adminPerfil = new PerfilUsuario(1L,"Administrador",Arrays.asList("Criar_Usuario", "Editar_Usuario", "Deletar_Usuario", "Ver_logs"));

        // Criando usuários e associando ao perfil
        Usuario usuario1 = new Usuario(01L,adminPerfil,"jonatas.admin","jonatas@ifba.edu.br","senha123",LocalDateTime.now().minusDays(1),true);

        Usuario usuario2 = new Usuario(102L,adminPerfil,"leandro.admin","leandro@ifba.edu.br","senha456",LocalDateTime.now().minusHours(5),true);

        // Criando sessões para os usuários
        Sessao sessao1 = new Sessao(201L, usuario1, "token-abc-123");
        Sessao sessao2 = new Sessao(202L, usuario2, "token-def-456");

        // Criando logs de auditoria
        LogAuditoria log1 = new LogAuditoria(301L,usuario1,"LOGIN",LocalDateTime.now().minusMinutes(30),"192.168.0.10");

        LogAuditoria log2 = new LogAuditoria(302L,usuario2,"ALTEROU SENHA",LocalDateTime.now().minusMinutes(10),"192.168.0.11");

        // Exibindo tudo
        System.out.println("---- PERFIL DE USUÁRIO ----");
        System.out.println(adminPerfil);

        System.out.println("\n---- USUÁRIOS ----");
        System.out.println(usuario1);
        System.out.println(usuario2);

        System.out.println("\n---- SESSÕES ----");
        System.out.println(sessao1);
        System.out.println(sessao2);

        System.out.println("\n---- LOGS DE AUDITORIA ----");
        System.out.println(log1);
        System.out.println(log2);
    }
}
