package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class CursosMain {

        public static void main(String[] args) {
            List<Curso> cursos = new ArrayList<Curso>();
            cursos.add(new Curso("Python", 45));
            cursos.add(new Curso("JavaScript", 150));
            cursos.add(new Curso("Java 8", 113));
            cursos.add(new Curso("C", 55));

            // devolve qualquer um dos cursos com mais de 100 alunos
            cursos.stream() // stream devolve corrente de objetos
                   .filter(c -> c.getAlunos()>=100) // filter retorna true or false e guardar so aqueles cursos que tem mais de 100 alunos (retornaram true)
                   .findAny() // devolve qualquer um dos cursos com mais de 100 alunos
                   .ifPresent(c -> System.out.println(c.getNome()));  // vai devolver o curso ou se não achar, devolve vazio

            // se eu fizer outro cursos.stream() aqui, ele perde o resultado desse filtro de cima, logo se eu quiser guardar
            // o resultado acima para futuras necessidades, eu necessito fazer o codigo abaixo
           cursos = cursos.stream()
                    .filter(c -> c.getAlunos()>=100)
                    .collect(Collectors.toList()); // transforma em lista

            cursos.stream().forEach(c-> System.out.println(c.getNome()));

            // outra forma

                 cursos.stream()
                    .filter(c -> c.getAlunos()>=100)
                    .collect(Collectors.toMap(c -> c.getNome(), c -> c.getAlunos())) // dado curso com mais de 100 alunos, guarda a chave do mapa que é o nome
            // e é mapeado (guardado) pelo numero de alunos
                    .forEach((nome,alunos) -> System.out.println(nome + " tem " + alunos + " alunos"));
//            JavaScript tem 150 alunos
//            Java 8 tem 113 alunos

            System.out.println(cursos.stream()
                    .filter(c -> c.getAlunos()>=100)
                    .collect(Collectors.toMap(c -> c.getNome(), c -> c.getAlunos()))); // {JavaScript=150, Java 8=113}



        }
}
