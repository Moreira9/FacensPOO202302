package servico;

import com.mysql.cj.xdevapi.Client;
import java.util.ArrayList;
import jdbc.dao.ClienteDAO;
import jdbc.model.Cliente;

public class ClienteService {
    private ClienteDAO cliDao;

    public ClienteService() {
        cliDao = new ClienteDAO();
    }
    public ArrayList<Cliente> consultar(){
        return cliDao.consultar();
    }
    public Cliente consultar(int id){
        return cliDao.consultar(id);
    }
    public Cliente inserir(Cliente cliente){
        return cliDao.cadastrar(cliente);
        /*
        Cliente c = new Cliente();
        c.setNome("Edson");
        return c;
        */
    }
    public boolean alterar(int id, Cliente cli){
        return cliDao.alterar(cli, id);
    }
    public boolean excluir(int id){
        return cliDao.excluir(id);
    }
}
