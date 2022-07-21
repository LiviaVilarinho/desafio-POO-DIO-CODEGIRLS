package br.com.dio.desafio.dominio;



public abstract class Conteudo {

    //criando a constante xp_padrao, o que quer dizer que todo conteúdo, ele já vai ser criado com o xp_padrao
    //static quer dizer que vai poder acessar esse XP_PADRAO fora da classe Conteúdo.
    protected static final double XP_PADRAO = 10d;

    private String titulo;
    private String descricao;

    public abstract  double calcularXP();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
