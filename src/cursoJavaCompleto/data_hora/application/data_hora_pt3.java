package cursoJavaCompleto.data_hora.application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class data_hora_pt3 {
    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2025-06-20");
        LocalDateTime d05 = LocalDateTime.parse("2025-06-20T01:30:26");
        Instant d06 = Instant.parse("2025-06-20T01:30:26Z");

        LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
        LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));

        LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
        LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);

        System.out.println("--------------------");

        System.out.println("r3 = " + r3);
        System.out.println("r4 = " + r4);

        System.out.println("--------------------");

        System.out.println("d04 Dia = " + d04.getDayOfMonth());
        System.out.println("d04 Mês = " + d04.getMonthValue());
        System.out.println("d04 Ano = " + d04.getYear());

        System.out.println("--------------------");

        System.out.println("d05 Hora = " + d05.getHour());
        System.out.println("d05 Minuto = " + d05.getMinute());
        System.out.println("d05 Segundo = " + d05.getSecond());
    }
}
