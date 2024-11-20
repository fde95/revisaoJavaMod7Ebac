public class Produto {

    //Informações gerais
    private int codigo;
    private String nome;
    private String descricao;
    private String aplicacao;
    private Double preco;

    //Dimensões
    private Double altura;
    private Double largura;
    private Double profundidade;

    //Setter & Getter

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getAplicacao() {
        return aplicacao;
    }

    public void setAplicacao(String aplicacao) {
        this.aplicacao = aplicacao;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getLargura() {
        return largura;
    }

    public void setLargura(Double largura) {
        this.largura = largura;
    }

    public Double getProfundidade() {
        return profundidade;
    }

    public void setProfundidade(Double profundidade) {
        this.profundidade = profundidade;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public void imprimirInformacoes() {
        System.out.println(
                "Cód.: " + this.codigo + "\n" +
                "Nome: " + this.nome + "\n" +
                "Descrição: " + this.descricao + "\n" +
                "Aplicação: " + this.aplicacao + "\n" +
                "Dimensões: " + this.altura + "A x " + this.largura + "L x " + this.profundidade + "C mm" + "\n" +
                "Preço: R$" + this.preco
        );
    }
}
