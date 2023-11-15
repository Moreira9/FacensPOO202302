package servico;

import jdbc.dao.UsuarioDAO;
import jdbc.model.Usuario;

public class UsuarioService {
    UsuarioDAO usuario;
    
    public UsuarioService() {
        usuario = new UsuarioDAO();
    }
    
    
    
    public boolean consultar(String login, String senha){
        return usuario.consultar(login, senha);
    }
}
