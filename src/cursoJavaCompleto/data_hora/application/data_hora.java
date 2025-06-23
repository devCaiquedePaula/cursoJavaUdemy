package cursoJavaCompleto.data_hora.application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class data_hora {
    public static void main(String[] args) {
        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        //Padrão UTC
        Instant d03 = Instant.now();

        LocalDate d04 = LocalDate.parse("2025-06-20");
        LocalDateTime d05 = LocalDateTime.parse("2025-06-20T15:30:26");
        Instant d06 = Instant.parse("2025-06-20T15:30:26Z");
        Instant d07 = Instant.parse("2025-06-20T15:30:26-03:00");

        //Nessa linha, o formato de data está incorreto, pois LocalDate.parse espera o formato ISO (yyyy-MM-dd).
        //LocalDate d08 = LocalDate.parse("20/06/2025"); // Isso causará uma exceção
        LocalDate d08 = LocalDate.parse("20/06/2025", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDateTime d09 = LocalDateTime.parse("20/06/2025 15:30", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));

        LocalDate d10 = LocalDate.of(2025, 6, 20);
        LocalDateTime d11 = LocalDateTime.of(2025, 6, 20, 15, 30);

        System.out.println("d01 = " + d01);
        System.out.println("d02 = " + d02);
        System.out.println("d03 = " + d03);
        System.out.println("-------------------------");
        System.out.println("d04 = " + d04);
        System.out.println("d05 = " + d05);
        System.out.println("d06 = " + d06);
        System.out.println("d07 = " + d07);
        System.out.println("-------------------------");
        System.out.println("d08 = " + d08);
        System.out.println("d09 = " + d09);
        System.out.println("d10 = " + d10);
        System.out.println("d11 = " + d11);
    }
}
