package jdbc.dao;

import java.util.ArrayList;
import jdbc.model.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ClienteDAO implements IDao {

    private Connection conn;

    public ClienteDAO() {
        conn = new ConnectionFactory().getConnection();
    }

    @Override
    public ArrayList<Cliente> consultar() {
        ArrayList<Cliente> lstClientes = new ArrayList<>();
        String sql = "select * from Cliente";
        PreparedStatement comando;
        ResultSet resultado;
        try {
            comando = conn.prepareStatement(sql);
            resultado = comando.executeQuery();
            while (resultado.next()) {
                Cliente cli = new Cliente();
                cli.setId(resultado.getInt("id"));
                cli.setNome(resultado.getString("nome"));
                cli.setRg(resultado.getString("rg"));
                cli.setRg(resultado.getString("rg"));
                cli.setCpf(resultado.getString("cpf"));
                cli.setEmail(resultado.getString("email"));
                cli.setTelefone(resultado.getString("telefone"));
                cli.setCelular(resultado.getString("celular"));
                cli.setCep(resultado.getString("cep"));
                cli.setEndereco(resultado.getString("endereco"));
                cli.setNumero(resultado.getString("numero"));
                cli.setComplemento(resultado.getString("complemento"));
                cli.setBairro(resultado.getString("bairro"));
                cli.setCidade(resultado.getString("cidade"));
                cli.setEstado(resultado.getString("estado"));
                lstClientes.add(cli);
            }
            return lstClientes;

        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public Cliente consultar(int id) {
        Cliente cli = new Cliente();
        String sql = "select * from cliente where id = ?";
        PreparedStatement comando;
        ResultSet resultado;
        try {
            comando = conn.prepareStatement(sql);
            comando.setInt(1, id);
            resultado = comando.executeQuery();
            if (resultado.next()) {
                
                cli.setId(resultado.getInt("id"));
                cli.setNome(resultado.getString("nome"));
                cli.setRg(resultado.getString("rg"));
                cli.setRg(resultado.getString("rg"));
                cli.setCpf(resultado.getString("cpf"));
                cli.setEmail(resultado.getString("email"));
                cli.setTelefone(resultado.getString("telefone"));
                cli.setCelular(resultado.getString("celular"));
                cli.setCep(resultado.getString("cep"));
                cli.setEndereco(resultado.getString("endereco"));
                cli.setNumero(resultado.getString("numero"));
                cli.setComplemento(resultado.getString("complemento"));
                cli.setBairro(resultado.getString("bairro"));
                cli.setCidade(resultado.getString("cidade"));
                cli.setEstado(resultado.getString("estado"));
            }
            return cli;

        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public ArrayList<Cliente> consultar(String nome) {
        ArrayList<Cliente> lista = new ArrayList<>();
        String sql = "select * from cliente where nome like ?";
        PreparedStatement comando;
        ResultSet resultado;
        try {
            comando = conn.prepareStatement(sql);
            comando.setString(1, nome);
            resultado = comando.executeQuery();
            while (resultado.next()) {
                Cliente cli = new Cliente();
                cli.setId(resultado.getInt("id"));
                cli.setNome(resultado.getString("nome"));
                cli.setRg(resultado.getString("rg"));
                cli.setRg(resultado.getString("rg"));
                cli.setCpf(resultado.getString("cpf"));
                cli.setEmail(resultado.getString("email"));
                cli.setTelefone(resultado.getString("telefone"));
                cli.setCelular(resultado.getString("celular"));
                cli.setCep(resultado.getString("cep"));
                cli.setEndereco(resultado.getString("endereco"));
                cli.setNumero(resultado.getString("numero"));
                cli.setComplemento(resultado.getString("complemento"));
                cli.setBairro(resultado.getString("bairro"));
                cli.setCidade(resultado.getString("cidade"));
                cli.setEstado(resultado.getString("estado"));
                lista.add(cli);
            }
            return lista;

        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
    
    @Override
    public Cliente cadastrar(Cliente cliente) {
                String query = "insert into cliente (nome, rg, cpf, email, telefone, celular, cep, endereco, numero,\n"
                + "complemento, bairro, cidade, estado) \n"
                + "values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
        ResultSet resultado = null;
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(query, 
                    PreparedStatement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, cliente.getNome());
            preparedStatement.setString(2, cliente.getRg());
            preparedStatement.setString(3, cliente.getCpf());
            preparedStatement.setString(4, cliente.getEmail());
            preparedStatement.setString(5, cliente.getTelefone());
            preparedStatement.setString(6, cliente.getCelular());
            preparedStatement.setString(7, cliente.getCep());
            preparedStatement.setString(8, cliente.getEndereco());
            preparedStatement.setString(9, cliente.getNumero());
            preparedStatement.setString(10, cliente.getComplemento());
            preparedStatement.setString(11, cliente.getBairro());
            preparedStatement.setString(12, cliente.getCidade());
            preparedStatement.setString(13, cliente.getEstado());
            preparedStatement.executeUpdate();
            resultado = preparedStatement.getGeneratedKeys();
            if (resultado.next()) {
                cliente.setId(resultado.getInt(1));
            }
            return cliente;

        } catch (SQLException erro) {
            throw new RuntimeException(erro.getMessage());
        }

    }

    @Override
    public boolean excluir(int id) {
        String sql = "delete from cliente where id = ?";
        PreparedStatement comando;
        try {
            comando = conn.prepareStatement(sql);
            comando.setInt(1, id);
            if (comando.executeUpdate() > 0) {
                return true;
            }
            else
            {
                return false;
            }
        } catch (Exception e) {
             throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public boolean alterar(Cliente cliente, int id) {
        String query = "update cliente  set nome = ?, rg = ?, cpf = ?, email = ?, "
                + "telefone = ?, celular = ?, cep = ?, endereco = ?, numero = ?, "
                + "complemento = ?, bairro = ?, cidade = ?, estado = ? "
                + " where id = ?";
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            preparedStatement = conn.prepareCall(query);
            preparedStatement.setString(1, cliente.getNome());
            preparedStatement.setString(2, cliente.getRg());
            preparedStatement.setString(3, cliente.getCpf());
            preparedStatement.setString(4, cliente.getEmail());
            preparedStatement.setString(5, cliente.getTelefone());
            preparedStatement.setString(6, cliente.getCelular());
            preparedStatement.setString(7, cliente.getCep());
             preparedStatement.setString(8, cliente.getEndereco());
            preparedStatement.setString(9, cliente.getNumero());
            preparedStatement.setString(10, cliente.getComplemento());
            preparedStatement.setString(11, cliente.getBairro());
            preparedStatement.setString(12, cliente.getCidade());
            preparedStatement.setString(13, cliente.getEstado());
            preparedStatement.setInt(14, id);
            
            if (preparedStatement.executeUpdate() > 0) {
                return true;
            }
            else{
                return false;
            }
            
        } catch (SQLException erro) {
            throw new RuntimeException(erro.getMessage());
        }


    }

}
