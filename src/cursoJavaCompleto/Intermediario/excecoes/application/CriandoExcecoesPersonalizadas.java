package cursoJavaCompleto.Intermediario.excecoes.application;

import cursoJavaCompleto.Intermediario.excecoes.model.entities.Reservation;
import cursoJavaCompleto.Intermediario.excecoes.model.exception.DomainException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class CriandoExcecoesPersonalizadas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        try {
            System.out.print("Enter room number: ");
            int roomNumber = scanner.nextInt();
            System.out.print("Enter check-in date (dd/MM/yyyy): ");
            Date checkIn = dateFormat.parse(scanner.next());
            System.out.print("Enter check-out date (dd/MM/yyyy): ");
            Date checkOut = dateFormat.parse(scanner.next());

            Reservation reservation = new Reservation(roomNumber, checkIn, checkOut);
            System.out.println("Reservation: " + reservation);

            System.out.println();
            System.out.println("Enter data to update the reservation: ");
            System.out.print("Enter check-in date (dd/MM/yyyy): ");
            checkIn = dateFormat.parse(scanner.next());
            System.out.print("Enter check-out date (dd/MM/yyyy): ");
            checkOut = dateFormat.parse(scanner.next());

            reservation.updateDates(checkIn, checkOut);
            System.out.print("Reservation: " + reservation);
        } catch (ParseException e) {
            System.out.print("Invalid date format.");
        } catch (DomainException e) {
            System.out.print("Error in reservation: " + e.getMessage());
        }
        scanner.close();
    }
}
