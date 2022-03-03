package Lambdas;
import java.util.ArrayList;
import java.lang.Integer;
import java.util.List;

// Para trabalhar com lambda uma interface funcional precisa estar envolvida

public class OrdenaStringL {

            public static void main(String[] args) {
                List<String> palavras = new ArrayList<String>();
                palavras.add("alura online");
                palavras.add("editora casa do codigo");
                palavras.add("teatro 2");

                palavras.sort(
                        (s1,  s2) -> Integer.compare(s1.length(), s2.length()) // positivo se o segundo for maior e negativo se o primeiro for maior
                );


                palavras.forEach((s) -> System.out.println(s));
                /*
                == Consumer<String> impressor = s -> System.out.println(s);
                   palavras.forEach(impressor);
                 */

            }
}
    /*
 thread sem lambda
    new Thread(new Runnable() {

        @Override
        public void run() {
            System.out.println("Executando um Runnable");
        }

        }).start();

 thread com lambda
new Thread(() -> System.out.println("Executando um Runnable")).start();
*/

