package br.com.dio.desafio.dominio;

import com.sun.source.doctree.SeeTree;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {

    private String nome;
    //coleção Set sendo usado, pois eu quero que seja adicionado somente uma vez um curso e ele permite apenas para adicioanr conteúdos únicos.
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>(); //implementando o LinkedHashSet pq quero que a forma
    // que eu for me inscrevendo nesses cursos, eu quero que seja salvo e colocado na mesma ordem.
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    public void inscreverBootcamp(Bootcamp bootcamp) {

        //metodo addAll estou pegando tudo que tem dentro desse Set (bootcamp.getConteudos()) e posicionado dentro desse conteudosInscritos
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
        //aqui estou pegando o bootcampo e peguei o getDevsIncritos, que é o Set onde contem todos os devs inscritos
        // e usei o add(this) (palavra reservada this) para adicionar esse Dev da class Dev que se inscreveu no bootcamp
        bootcamp.getDevsInscritos().add(this);
    }

    public void progredir() {

        //metodo findFirst me retorna um Optional, que serve para resolver a questão de retornos nulls
        Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
        if (conteudo.isPresent()) {
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudosInscritos.remove(conteudo.get());
        } else {
            System.err.println("Você não está matriculado em nenhum conteúdo!");
        }

    }

    public double calcularXP() {

        this.conteudosConcluidos.stream().mapToDouble(Conteudo::calcularXP).sum();

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    //criou o equals and hashCode pois estou trabalhando com Hash nos atributos acima. E serve para fazer comparações e etc.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosInscritos, dev.conteudosInscritos) && Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosInscritos, conteudosConcluidos);
    }
}
