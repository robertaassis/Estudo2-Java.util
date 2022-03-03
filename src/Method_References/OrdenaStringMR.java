package Method_References;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class OrdenaStringMR {
    public static void main(String[] args) {
        List<String> palavras = new ArrayList<String>();
        palavras.add("alura online");
        palavras.add("editora casa do codigo");
        palavras.add("teatro 2");


        // comparador de strings
        palavras.sort(Comparator.comparing(s -> s.length())); // dado uma string s, quero comparar baseado no tamanho dela

        // Method Reference
        palavras.sort(Comparator.comparing(String::length)); // mesma coisa da linha acima

        // Formas equivalentes de escrever o código acima

        // == palavras.sort((s1,  s2) -> Integer.compare(s1.length(), s2.length()));

        /*    ==  Function<String, Integer> funcao = s -> s.length(); // <String, Integer> dada uma string, retorna um Integer
                Comparator<String> comparador = Comparator.comparing(funcao);
                palavras.sort(comparador); */

        // Method Reference
        palavras.forEach(System.out::println); // invoca o método println desse System.out (converte pra Consumer por isso funciona)


    }
}
