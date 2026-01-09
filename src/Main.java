import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso js");
        curso2.setDescricao("Descrição curso js");
        curso2.setCargaHoraria(6);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria java");
        mentoria.setDescricao("Descrição mentoria java");
        mentoria.setData(LocalDate.now());

       /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp  = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devBernardo = new Dev();
        devBernardo.setNome("Bernardo");
        devBernardo.increverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Bernardo: " + devBernardo.getConteudosInscritos());

        devBernardo.progredir();
        devBernardo.progredir();

        System.out.println("*");
        System.out.println("Conteúdos inscritos Bernardo: " + devBernardo.getConteudosInscritos());
        System.out.println("Conteúdos concluidos Bernardo: " + devBernardo.getConteudosConcluidos());
        System.out.println("XP: " + devBernardo.calcularTotalXp());

        System.out.println("***************************************************");
        Dev devMaria = new Dev();
        devMaria.setNome("Maria");
        devMaria.increverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Maria: " + devMaria.getConteudosInscritos());

        devMaria.progredir();
        devMaria.progredir();
        devMaria.progredir();

        System.out.println("*");
        System.out.println("Conteúdos inscritos Maria: " + devMaria.getConteudosInscritos());
        System.out.println("Conteúdos concluidos Maria: " + devMaria.getConteudosConcluidos());
        System.out.println("XP: " + devMaria.calcularTotalXp());
    }
}