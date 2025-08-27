package cursoJavaCompleto.ProgOrientadaObjetos2.interfaces.model.application;

import cursoJavaCompleto.ProgOrientadaObjetos2.interfaces.model.entities.CarRental;
import cursoJavaCompleto.ProgOrientadaObjetos2.interfaces.model.entities.Vehicle;
import cursoJavaCompleto.ProgOrientadaObjetos2.interfaces.service.BrazilTaxService;
import cursoJavaCompleto.ProgOrientadaObjetos2.interfaces.service.RentalService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        
        System.out.print("Enter rental data\nCar model: ");
        String carModel = sc.nextLine();
        System.out.print("Pickup (dd/MM/yyyy hh:mm): ");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(), dtf);
        System.out.print("Return (dd/MM/yyyy hh:mm): ");
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), dtf);

        CarRental carRental = new CarRental(start, finish, new Vehicle(carModel));

        System.out.print("Enter price per hour: ");
        Double pricePerHour = sc.nextDouble();
        System.out.print("Enter price per day: ");
        Double pricePerDay = sc.nextDouble();

        RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());
        rentalService.processInvoice(carRental);
        
        System.out.println("INVOICE: ");
        System.out.printf("Basic payment: %.2f%n", carRental.getInvoice().getBasicPayment());
        System.out.printf("Tax: %.2f%n", carRental.getInvoice().getTax());
        System.out.printf("Total payment: %.2f%n", carRental.getInvoice().getTotalPayment());
    }
}
