import br.dio.desafio.dominio.Curso;
import br.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso cursoJava = new Curso();
        cursoJava.setTitulo("curso Java");
        cursoJava.setDescricao("fundamentos de java");
        cursoJava.setCargaHoraria(8);
        System.out.println(cursoJava);

        Curso cursoJs = new Curso();
        cursoJs.setTitulo("curso Javascript");
        cursoJs.setDescricao("fundamentos de javascript");
        cursoJs.setCargaHoraria(4);
        System.out.println(cursoJs);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Pilares da Orientação a Objetos");
        mentoria.setDescricao("Entendendo o uso de POO");
        mentoria.setData(LocalDate.now());
        System.out.println(mentoria);
    }
}