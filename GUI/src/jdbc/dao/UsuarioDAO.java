package jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import jdbc.model.Cliente;
import jdbc.model.Usuario;

public class UsuarioDAO {
    private Connection conn;
    public UsuarioDAO() {
        conn = new ConnectionFactory().getConnection();
    }
    
    public boolean consultar(String login, String senha){
        Usuario usu = new Usuario();

        String sql = "select * from usuario where login = ? and senha = ?";
        PreparedStatement comando;
        ResultSet resultado;
        try {
            comando = conn.prepareStatement(sql);
            comando.setString(1, login);
            comando.setString(2, senha);
            resultado = comando.executeQuery();
            if (resultado.next()) {
                return true;
            }
            return false;
        }
        catch(Exception ex){
            throw new RuntimeException(ex.getMessage());
        }
    }
}
