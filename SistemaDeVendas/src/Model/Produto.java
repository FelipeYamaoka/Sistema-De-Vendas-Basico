
package Model;

public class Produto {
    private int PRO_IN_ID;
    private int PES_IN_ID;
    private int PRO_ST_COD;
    private String PRO_ST_NOME;
    private String PRO_ST_DESCRICAO;
    private float PRO_RE_VALORUNIT;
    private int PRO_IN_QUANTIDADE;

    public Produto() {
    }

    public int getPRO_IN_ID() {
        return PRO_IN_ID;
    }

    public void setPRO_IN_ID(int PRO_IN_ID) {
        this.PRO_IN_ID = PRO_IN_ID;
    }

    public int getPES_IN_ID() {
        return PES_IN_ID;
    }

    public void setPES_IN_ID(int PES_IN_ID) {
        this.PES_IN_ID = PES_IN_ID;
    }

    public int getPRO_ST_COD() {
        return PRO_ST_COD;
    }

    public void setPRO_ST_COD(int PRO_ST_COD) {
        this.PRO_ST_COD = PRO_ST_COD;
    }

    public String getPRO_ST_NOME() {
        return PRO_ST_NOME;
    }

    public void setPRO_ST_NOME(String PRO_ST_NOME) {
        this.PRO_ST_NOME = PRO_ST_NOME;
    }

    public String getPRO_ST_DESCRICAO() {
        return PRO_ST_DESCRICAO;
    }

    public void setPRO_ST_DESCRICAO(String PRO_ST_DESCRICAO) {
        this.PRO_ST_DESCRICAO = PRO_ST_DESCRICAO;
    }

    public float getPRO_RE_VALORUNIT() {
        return PRO_RE_VALORUNIT;
    }

    public void setPRO_RE_VALORUNIT(float PRO_RE_VALORUNIT) {
        this.PRO_RE_VALORUNIT = PRO_RE_VALORUNIT;
    }

    public int getPRO_IN_QUANTIDADE() {
        return PRO_IN_QUANTIDADE;
    }

    public void setPRO_IN_QUANTIDADE(int PRO_IN_QUANTIDADE) {
        this.PRO_IN_QUANTIDADE = PRO_IN_QUANTIDADE;
    }
    
    
}
