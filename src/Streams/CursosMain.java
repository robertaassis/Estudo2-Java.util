package Streams;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CursosMain {

        public static void main(String[] args) {
            List<Curso> cursos = new ArrayList<Curso>();
            cursos.add(new Curso("Python", 45));
            cursos.add(new Curso("JavaScript", 150));
            cursos.add(new Curso("Java 8", 113));
            cursos.add(new Curso("C", 55));


            cursos.sort(Comparator.comparing(Curso::getAlunos)); // ordena por numero de alunos
            // cursos.forEach(c->System.out.println(c.getNome()));

            // filtrar coleções

            // FILTRA OS CURSOS COM MAIS DE 100 ALUNOS E PRINTA O NOME DELES
            cursos.stream() // stream devolve corrente de objetos
                    .filter(c -> c.getAlunos()>=100) // filter vai voltar true e guardar so aqueles cursos que tem mais de 100 alunos
                    .forEach(c->System.out.println(c.getNome())); // printa os cursos que tem mais de 100 alunos

            System.out.println("---------------------");

            // FILTRA OS CURSOS COM MAIS DE 100 ALUNOS, MAPEIA QUANTOS ALUNOS TEM EM CADA CURSO E PRINTA A QUANTIDADE DE ALUNOS DE CADA CURSO
            // FOREACH VAI RECEBER O RESULTADO DE MAP
            cursos.stream() // stream devolve corrente de objetos
                    .filter(c -> c.getAlunos()>=100) // filter retorna true or false e guardar so aqueles cursos que tem mais de 100 alunos (retornaram true)
                    .map(c ->c.getAlunos()) // dado o curso com mais de 100 alunos, eu quero o numero de alunos de cada curso
                    .forEach(total -> System.out.println(total));

            System.out.println("---------------------");

            // RETORNA A SOMA DOS ALUNOS QUE ESTÃO MATRICULADOS EM CURSO COM MAIS DE 100 ALUNOS
            // tem que usar mapToInt pra usar o sum()
            int soma = cursos.stream() // stream devolve corrente de objetos
                    .filter(c -> c.getAlunos()>=100) // filter retorna true or false e guardar so aqueles cursos que tem mais de 100 alunos (retornaram true)
                    .mapToInt(c ->c.getAlunos()) // dado o curso com mais de 100 alunos, eu quero o numero de alunos de cada curso
                    .sum();

            System.out.println(soma);

        }
}
