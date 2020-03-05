package Control;

import Model.Pessoa;
import Model.Conexao;
import java.sql.*;

public class DaoPessoa {

    public void insert() throws SQLException {
            
        Pessoa pessoa = new Pessoa();
        Connection conn = Conexao.conectar();
        PreparedStatement query = null;
        
        try {
           
            String sql = "INSERT INTO INSERT INTO tbpessoa(TIP_IN_COD, PES_ST_NOME, PES_ST_APELIDO, PES_ST_DESCRICAO, PES_ST_ENDERECO, "
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
}
