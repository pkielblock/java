/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatec.DAO;


import br.com.fatec.model.Proprietario;
import br.com.fatec.model.Veiculo;
import br.com.fatec.persistencia.Banco;
import java.sql.SQLException;
import java.util.Collection;

/**
 *
 * @author Viotti
 */
public class VeiculoDAO implements DAO <Veiculo> {

    //variaveis auxiliares
    //permite o uso de comandos DML (select, insert, delete e update) para
    //acessar nosso SGBD
    private java.sql.PreparedStatement pst;
    
    //permite armazenar um conjunto de dados vindo do SGBD para ser
    //manipulado
    private java.sql.ResultSet rs;
    
    //representar os dados do  meu negócio
    private Proprietario proprietario;    
    private Veiculo veiculo;
    
    @Override
    public boolean insere(Veiculo obj) throws SQLException {
        String sql = "INSERT INTO Veiculo (placa, codProprietario, modelo, valor) " +
                " VALUES (?, ?, ?, ?)"; //a ? indica parametros
        
        //abre a conexao com o banco
        Banco.conectar();
        //preparar o comando PST
        pst = Banco.obterConexao().prepareStatement(sql);
        
        //associar os dados do objeto Proprietario com o comando INSERT
        pst.setString(1, obj.getPlaca());
        //obtem os dados via composição
        pst.setInt(2, obj.getProprietario().getCodProprietario()); //FK
        pst.setString(3, obj.getModelo());
        pst.setDouble(4, obj.getValor());
        
        //executar o comando
        int res = pst.executeUpdate(); //esse método serve para Insert, delete e update
        
        //fecha a conexao
        Banco.desconectar();
        
        //devolve se funcionoou ou nao
        return res != 0;
                
    }

    @Override
    public boolean remove(Veiculo obj) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean altera(Veiculo obj) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Veiculo buscaID(Veiculo obj) throws SQLException {
        String sql = "SELECT * FROM Veiculo "
                + "WHERE placa = ?"; //a ? indica parametros
        
        //abre a conexao com o banco
        Banco.conectar();
        //preparar o comando PST
        pst = Banco.obterConexao().prepareStatement(sql);
        
        //associar os dados do objeto Proprietario com o comando SELECT
        pst.setString(1, obj.getPlaca());
        
        //executar o comando
        rs = pst.executeQuery(); //esse método serve para SELECT
        
        //verificar se trouxe algum registro
        //rs.next() faz a leitura do próximo registro, se existir devolve true
        //se nao devolve false
        if(rs.next()) {
            //buscar dados do Proprietario
            ProprietarioDAO propDAO = new ProprietarioDAO();
            //cria um objeto proprietario
            proprietario = new Proprietario();
            //coloca o codProprietario do banco para buscar os outros dados
            proprietario.setCodProprietario(rs.getInt("codProprietario"));
            //busca no banco os dados completos do proprietário
            proprietario = propDAO.buscaID(proprietario);
            
            //mover os dados do resultSet para o objeto proprietário
            veiculo = new Veiculo(proprietario);
            veiculo.setPlaca(rs.getString("placa"));
            veiculo.setModelo(rs.getString("modelo"));
            veiculo.setValor(rs.getDouble("valor"));
        }
        else {
            //não encontrou o registro solicitado
            veiculo = null;
        }
                
        //fecha a conexao
        Banco.desconectar();
        
        //devolve o objeto proprietario
        return veiculo;

        
    }

    @Override
    public Collection<Veiculo> lista(String criterio) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
