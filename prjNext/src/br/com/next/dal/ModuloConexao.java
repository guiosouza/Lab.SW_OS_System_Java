/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.next.dal;

// Para o módulo de conexão com MySQL
import java.sql.*;

/**
 *
 * @author Guillherme
 */
public class ModuloConexao {

    // Método responsável por estabelecer a conexão com o banco
    // Connection vem do import java.sql
    public static Connection conector() {
        Connection conexao = null; // framwork Connection
        // chama o driver do tipo do banco:
        String driver = "com.mysql.cj.jdbc.Driver"; // ou: "com.mysql.jdbc.Driver";
        // armazenando informações referente ao banco
        String url = "jdbc:mysql://localhost:3306/dbnext?characterEncoding=utf-8";
        String user = "dba";
        String password = "1234567";
        // Estabelecendo a conexão com o banco
        // Caso ocorra alguns erros:
        try {
            Class.forName(driver); // executar o driver
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (Exception e) {
            // Linha abaixo para verificar erro
            // System.out.println(e);
            return null;
        } 
    }
}
