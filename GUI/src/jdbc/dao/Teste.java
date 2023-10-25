package jdbc.dao;
import java.sql.Connection;
import jdbc.model.Cliente;

/**
 *
 * @author edson
 */
public class Teste {
    public static void main(String[] args) {
        /*ConnectionFactory c = new ConnectionFactory();
        Connection conn = c.getConnection();
        System.out.println("deu certo");
        */
        ClienteDAO cDao = new ClienteDAO();
        System.out.println(cDao.consultar(9).getNome());
        
    }
}
