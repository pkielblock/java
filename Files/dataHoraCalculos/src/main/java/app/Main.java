package app;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");

        LocalDate pastWeekLocalDate = d04.minusDays(7);
        LocalDate nextWeekLocalDate = d04.plusDays(7);

        DateTimeFormatter localFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("originalLocalDate = " + d04.format(localFormatter));
        System.out.println("pastWeekLocalDate = " + pastWeekLocalDate.format(localFormatter));
        System.out.println("nextWeekLocalDate = " + nextWeekLocalDate.format(localFormatter));

        LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
        LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);

        System.out.println("pastWeekLocalDateTime = " + pastWeekLocalDateTime);
        System.out.println("nextWeekLocalDateTime = " + nextWeekLocalDateTime);

        Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);

        System.out.println("pastWeekInstant = " + pastWeekInstant);
        System.out.println("nextWeekInstant = " + nextWeekInstant);

        Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atStartOfDay());
        System.out.println("t1 dias = " + t1.toDays());

        Duration t2 = Duration.between(pastWeekLocalDateTime, d05);
        System.out.println("t2 dias = " + t2.toDays());

        Duration t3 = Duration.between(pastWeekInstant, d06);
        System.out.println("t3 dias = " + t3.toDays());

        Duration t4 = Duration.between(d06, pastWeekInstant);
        System.out.println("t4 dias = " + t4.toDays());
    }
}