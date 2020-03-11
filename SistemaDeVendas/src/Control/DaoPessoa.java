package Control;

import Model.Pessoa;
import Model.Conexao;
import java.sql.*;

public class DaoPessoa {

    public void Insert() throws SQLException {
            
        Pessoa pessoa = new Pessoa();
        Connection conn = Conexao.conectar();
        PreparedStatement query = null;
        
        try {
           
            String sql = "INSERT INTO tbpessoa(TIP_IN_COD, PES_ST_NOME, PES_ST_APELIDO, PES_ST_DESCRICAO, PES_ST_ENDERECO, "
                    + "PES_ST_BAIRRO, PES_ST_NUMERO, PES_ST_CIDADE, PES_ST_UF, PES_ST_CEP, PES_ST_FONE, PES_ST_NUMEROREGISTRO) "
                    + "VALUES ('" + pessoa.getTIP_IN_COD() + "', "
                    + "'" + pessoa.getPES_ST_NOME() + "', "
                    + "'" + pessoa.getPES_ST_APELIDO() + "', "
                    + "'" + pessoa.getPES_ST_DESCRICAO() + "', "
                    + "'" + pessoa.getPES_ST_ENDERECO() + "', "
                    + "'" + pessoa.getPES_ST_BAIRRO() + "', "
                    + "'" + pessoa.getPES_ST_NUMERO() + "', "
                    + "'" + pessoa.getPES_ST_CIDADE() + "', "
                    + "'" + pessoa.getPES_ST_UF() + "', "
                    + "'" + pessoa.getPES_ST_CEP() + "', "
                    + "'" + pessoa.getPES_ST_FONE() + "', "
                    + "'" + pessoa.getPES_ST_NUMEROREGISTRO() + "')";

            query = conn.prepareStatement(sql);
            query.execute();
            
        } catch (SQLException e) {
            // do something appropriate with the exception, *at least*:

        } finally {query.close();}
    }
    
    public Pessoa Select(String TIP_IN_COD) throws SQLException {
        
        Connection conn = Conexao.conectar();
        PreparedStatement query = null;
        Pessoa p = new Pessoa();
        
        try {
            String sql = ("SELECT * from tbpessoa where TIP_IN_COD = '"+ TIP_IN_COD +"'");
            
            query = conn.prepareStatement(sql);
            
            ResultSet rs = query.executeQuery(sql);
            
            while(rs.next()) {
                p.setPES_IN_ID(rs.getInt("PES_IN_ID")); // 1
                p.setTIP_IN_COD(rs.getInt("TIP_IN_COD")); // 2
                p.setPES_ST_NOME(rs.getString("PES_ST_NOME")); // 3
                p.setPES_ST_APELIDO(rs.getString("PES_ST_APELIDO")); //4
                p.setPES_ST_DESCRICAO(rs.getString("PES_ST_DESCRICAO")); // 5
                p.setPES_ST_ENDERECO(rs.getString("PES_ST_ENDERECO")); // 6
                p.setPES_ST_BAIRRO(rs.getString("PES_ST_BAIRRO")); // 7
                p.setPES_ST_NUMERO(rs.getString("PES_ST_NUMERO")); // 8
                p.setPES_ST_CIDADE(rs.getString("PES_ST_CIDADE")); //9
                p.setPES_ST_UF(rs.getString("PES_ST_UF")); // 10
                p.setPES_ST_CEP(rs.getString("PES_ST_CEP")); // 11
                p.setPES_ST_FONE(rs.getString("PES_ST_FONE")); // 12
                p.setPES_ST_NUMEROREGISTRO(rs.getString("PES_ST_NUMEROREGISTRO")); // 13   
            }
            
            return p;
        } catch (SQLException e) {
            return null;
        } finally {query.close();}      
    } 
    
    public void Update(Pessoa pe) throws SQLException {
        
        Connection conn = Conexao.conectar();
        PreparedStatement query = null;
        Pessoa p = new Pessoa();
        
        try {
            String sql = ("UPDATE tbpessoa SET PES_IN_ID='"+ p.getPES_IN_ID() +"',"
                    + "TIP_IN_COD='"+p.getTIP_IN_COD()+"',"
                    + "PES_ST_NOME='"+p.getPES_ST_NOME()+"',"
                    + "PES_ST_APELIDO='"+p.getPES_ST_APELIDO()+"',"
                    + "PES_ST_DESCRICAO='"+p.getPES_ST_DESCRICAO()+"',"
                    + "PES_ST_ENDERECO='"+p.getPES_ST_ENDERECO()+"',"
                    + "PES_ST_BAIRRO='"+p.getPES_ST_BAIRRO()+"',"
                    + "PES_ST_NUMERO='"+p.getPES_ST_NUMERO()+"',"
                    + "PES_ST_CIDADE='"+p.getPES_ST_CIDADE()+"',"
                    + "PES_ST_UF='"+p.getPES_ST_UF()+"',"
                    + "PES_ST_CEP='"+p.getPES_ST_CEP()+"',"
                    + "PES_ST_FONE='"+p.getPES_ST_FONE()+"',"
                    + "PES_ST_NUMEROREGISTRO='"+p.getPES_ST_NUMEROREGISTRO()+"'"); // Definir a condição WHERE
            
            query.setInt(1, pe.getPES_IN_ID());
            query.setInt(2, pe.getTIP_IN_COD());
            query.setString(3, pe.getPES_ST_NOME());
            query.setString(4, pe.getPES_ST_APELIDO());
            query.setString(5, pe.getPES_ST_DESCRICAO());
            query.setString(6, pe.getPES_ST_ENDERECO());
            query.setString(7, pe.getPES_ST_BAIRRO());
            query.setString(8, pe.getPES_ST_NUMERO());
            query.setString(9, pe.getPES_ST_CIDADE());
            query.setString(10, pe.getPES_ST_UF());
            query.setString(11, pe.getPES_ST_CEP());
            query.setString(12, pe.getPES_ST_FONE());
            query.setString(13, pe.getPES_ST_NUMEROREGISTRO());
            
            query = conn.prepareStatement(sql);
            query.execute();          
        } catch (SQLException e) {
            
        } finally {query.close();}
    }
    
    public void Delete(String TIP_IN_COD) throws SQLException {
        
        Connection conn = Conexao.conectar();
        PreparedStatement query = null;
        Pessoa p = new Pessoa();
        
        try {
            String sql = ("DELETE from tbpessoa where TIP_IN_COD = ?");
            query.setString(1, TIP_IN_COD);         
            query = conn.prepareStatement(sql);
            query.execute();  
            
        } catch (SQLException e) {
            
        } finally {query.close();}
    }
}
