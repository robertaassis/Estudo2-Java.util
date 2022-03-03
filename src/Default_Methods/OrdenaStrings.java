package Default_Methods;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaStrings {
    public static void main(String[] args) {
        List<String> palavras = new ArrayList<String>();
        palavras.add("alura online");
        palavras.add("teatro 2");
        palavras.add("editora casa do codigo");

       // Collections.sort(palavras); // jeito velho; ordena só por A-Z
        Comparator<String> comparador = new ComparadorPorTamanho();
        palavras.sort(comparador); // == Collections.sort(palavras, comparador);
        System.out.println(palavras); // imprime dem forma de lista  [teatro 2, alura online, editora casa do codigo]

        // jeito velho
        /*      for(String p : palavras) {
                    System.out.println(p);
                }
        */

        // jeito novo
        Consumer<String> consumidor= new ImprimeNaLinha();
        palavras.forEach(consumidor); // imprime
        /*
           teatro 2
          alura online
          editora casa do codigo
        */
    }
}

// imprime string
class ImprimeNaLinha implements Consumer<String> {

    @Override
    public void accept(String s) {
        System.out.println(s);
    }
}

class ComparadorPorTamanho implements Comparator<String> {

    @Override
    public int compare(String s1, String s2){
        if(s1.length()>s2.length()) return 1;
        if(s1.length()<s2.length()) return -1;
        return 0;
    }
}
