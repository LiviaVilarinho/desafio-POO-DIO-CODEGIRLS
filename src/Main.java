import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrição curso Java Script");
        curso2.setCargaHoraria(4);

        //trabalhando aqui conceito de Polimorfismo, pois pela classe Conteudo ser abstrata, ela não permite
        // que seja criado um conteúdo fora dela. posso criar um curso a partir da classe conteudo.
        // Tudo que tem em conteudo eu tenho em curso, mas nem tudo que tem em curso tem em conteúdo
        //só servindo de exemplo para entendimento. Não será usado - Conteudo conteudo = new Curso();

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Mentoria curso Java");
        mentoria.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);


        }
    }

