package cursoJavaCompleto.data_hora.application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class data_hora_pt2 {
    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2025-06-20");
        LocalDateTime d05 = LocalDateTime.parse("2025-06-20T15:30:26");
        Instant d06 = Instant.parse("2025-06-20T01:30:26Z");

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").withZone(ZoneId.systemDefault());

        System.out.println("d04 = " + d04.format(fmt1));
        System.out.println("d04 = " + fmt1.format(d04));
        System.out.println("d04 = " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        System.out.println("--------------------");

        System.out.println("d05 = " + d05.format(fmt2));
        System.out.println("d05 = " + fmt2.format(d05));
        System.out.println("d05 = " + d05.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));

        System.out.println("--------------------");

        System.out.println("d06 = " + d06);
        System.out.println("d06 = " + d06.atZone(ZoneId.systemDefault()).format(fmt3));
        System.out.println("d06 = " + fmt3.format(d06));
        System.out.println("d06 = " + d06.atZone(ZoneId.systemDefault()).format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));
    }
}
