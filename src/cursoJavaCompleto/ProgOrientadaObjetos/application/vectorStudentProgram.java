package cursoJavaCompleto.ProgOrientadaObjetos.application;

import cursoJavaCompleto.ProgOrientadaObjetos.entities.VectorStudent;

import java.util.Scanner;

public class vectorStudentProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VectorStudent[] rooms = new VectorStudent[10];

        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Rent #" + (i + 1) + ":");

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Email: ");
            String email = sc.nextLine();

            System.out.print("Room: ");
            int room = sc.nextInt();
            sc.nextLine();

            while (room < 0 || room >= rooms.length || rooms[room] != null) {
                System.out.print("Invalid room or already occupied. Please enter a valid room number: ");
                room = sc.nextInt();
                sc.nextLine();
            }

            rooms[room] = new VectorStudent(name, email);
        }
        System.out.println();
        System.out.println("Busy rooms:");
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i] != null) {
                System.out.println(i + ": " + rooms[i]);
            }
        }
        sc.close();
    }
}
