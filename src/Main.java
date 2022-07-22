import br.com.dio.desafio.dominio.*;

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

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);


        Dev devLivia = new Dev();
        devLivia.setNome("Livia");
        devLivia.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Livia" + devLivia.getConteudosInscritos());

        devLivia.progredir();
        devLivia.progredir();
        System.out.println("-");

        System.out.println("Conteúdos inscritos Livia" + devLivia.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Livia" + devLivia.getConteudosConcluidos());
        System.out.println("Xp: " + devLivia.calcularTotalXP());

        System.out.println(".................");

        Dev devMaria = new Dev();
        devMaria.setNome("Maria");
        devMaria.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Maria" + devMaria.getConteudosInscritos());

        devMaria.progredir();
        devMaria.progredir();
        devMaria.progredir();
        System.out.println("-");

        System.out.println("Conteúdos inscritos Maria" + devMaria.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Maria" + devMaria.getConteudosConcluidos());
        System.out.println("Xp: " + devMaria.calcularTotalXP());



        }
    }

