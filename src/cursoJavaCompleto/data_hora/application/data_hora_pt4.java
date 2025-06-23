package cursoJavaCompleto.data_hora.application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class data_hora_pt4 {
    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2025-06-20");
        LocalDateTime d05 = LocalDateTime.parse("2025-06-20T01:30:26");
        Instant d06 = Instant.parse("2025-06-20T01:30:26Z");

        LocalDate pastWeekLocalDate = d04.minusDays(7);
        LocalDate nextWeekLocalDate = d04.plusDays(7);

        System.out.println("pastWeekLocalDate: " + pastWeekLocalDate);
        System.out.println("nextWeekLocalDate: " + nextWeekLocalDate);
        System.out.println("---------------------");

        LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
        LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);

        System.out.println("pastWeekLocalDateTime: " + pastWeekLocalDateTime);
        System.out.println("nextWeekLocalDateTime: " + nextWeekLocalDateTime);
        System.out.println("---------------------");

        Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);

        System.out.println("pastWeekInstant: " + pastWeekInstant);
        System.out.println("nextWeekInstant: " + nextWeekInstant);
        System.out.println("---------------------");

        Duration t1 = Duration.between(pastWeekLocalDateTime, d05);
        Duration t2 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atStartOfDay());
        Duration t3 = Duration.between(pastWeekInstant, d06);

        System.out.println("Duration between pastWeekLocalDateTime and d05: " + t1.toDays());
        System.out.println("Duration between pastWeekLocalDate and d04: " + t2.toDays());
        System.out.println("Duration between pastWeekInstant and d06: " + t3.toDays());
    }
}
