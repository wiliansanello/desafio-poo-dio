import br.dio.desafio.dominio.Bootcamp;
import br.dio.desafio.dominio.Curso;
import br.dio.desafio.dominio.Mentoria;
import br.dio.desafio.dominio.Dev;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso cursoJava = new Curso();
        cursoJava.setTitulo("curso Java");
        cursoJava.setDescricao("fundamentos de java");
        cursoJava.setCargaHoraria(8);

        Curso cursoJs = new Curso();
        cursoJs.setTitulo("curso Javascript");
        cursoJs.setDescricao("fundamentos de javascript");
        cursoJs.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Pilares da Orientação a Objetos");
        mentoria.setDescricao("Entendendo o uso de POO");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(cursoJava);
        bootcamp.getConteudos().add(cursoJs);
        bootcamp.getConteudos().add(mentoria);

        Dev wilian = new Dev();
        wilian.setNome("Wilian");
        wilian.inscreverBootcamp(bootcamp);
        System.out.println("Área de aprendizado Wilian");
        System.out.println("Conteudos inscritos " + wilian.getConteudosInscritos());
        wilian.progredir();
        wilian.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos " + wilian.getConteudosInscritos());
        System.out.println("Conteudos concluidos " + wilian.getConteudosConcluidos());
        System.out.println("XP: " + wilian.calcularXp() + "\n\n");

        Dev mauricio = new Dev();
        mauricio.inscreverBootcamp(bootcamp);
        System.out.println("Área de aprendizado Mauricio");
        mauricio.setNome("Mauricio");
        System.out.println("Conteudos inscritos " + mauricio.getConteudosInscritos());
        mauricio.progredir();
        mauricio.progredir();
        mauricio.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos " + mauricio.getConteudosInscritos());
        System.out.println("Conteudos concluidos " + mauricio.getConteudosConcluidos());
        System.out.println("XP: " + mauricio.calcularXp());
    }
}