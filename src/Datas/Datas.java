package Datas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Datas {
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();
        System.out.println(hoje); // YYYY-MM-DD

        LocalDate olimpiadasRio = LocalDate.of(2016, Month.JUNE,5);
        int anos = hoje.getYear() - olimpiadasRio.getYear(); // comparação de anos
        System.out.println(anos);

        Period periodo = Period.between(olimpiadasRio, hoje); // comparação de anos mais prática
        System.out.println(periodo.getYears());

        LocalDate proximasOlimpiadas = olimpiadasRio.plusYears(4); // adiciona 4 anos
        System.out.println(proximasOlimpiadas); // 2020-06-05

        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String proxOlimpiadasFormatado = proximasOlimpiadas.format(formatador);
        System.out.println(proxOlimpiadasFormatado); // 05/06/2020

        DateTimeFormatter formatadorSeg = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
        LocalDateTime agora = LocalDateTime.now(); // traz segundos
        System.out.println(agora.format(formatadorSeg)); // 07/03/2022 04:45

        LocalTime intervalo = LocalTime.of(15,30); // horas
        System.out.println(intervalo); // 15:30

        LocalDate data = LocalDate.of(2099, 1, 25); // == LocalDate data = LocalDate.of(2099, Month.JANUARY, 25);
        System.out.println(data.format(formatador)); // 25/01/2099

    }
}
