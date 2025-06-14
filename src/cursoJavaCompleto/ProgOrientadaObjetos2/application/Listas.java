package cursoJavaCompleto.ProgOrientadaObjetos2.application;

import java.util.ArrayList;
import java.util.List;

public class Listas {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Honda Civic");
        list.add("Porsche GT3RS");
        list.add("BMW X5");
        list.add("Mercedes-Benz C63 AMG GT");
        list.add("Audi RS6");
        list.add("Nissan GT-R");
        list.add("Ferrari 488");
        list.add("honda NSX");
        list.add("Lamborghini Huracan");
        list.add("Honda Accord");
        list.add("Bugatti Veyron");
        list.add("Toyota Supra");
        list.add("Chevrolet Camaro");
        list.add("Ford Mustang");

        list.add(5, "Mazda MX-5");

        System.out.println("List size: " + list.size());

        for (String name : list) {
            System.out.println(name);
        }

        System.out.println("--------------------");
        list.removeIf(x -> x.charAt(0) == 'B');
        for (String name : list) {
            System.out.println(name);
        }

        System.out.println("--------------------");
        System.out.println("Index of 'Honda': " + list.indexOf("Honda Civic"));

        System.out.println("---------------------");
        List<String> result = list.stream()
                .filter(x -> x.charAt(0) == 'M')
                .toList();
        for (String name : result) {
            System.out.println(name);
        }
        System.out.println("---------------------");
        String name = list.stream()
                .filter(x -> x.charAt(0) == 'H')
                .findFirst()
                .orElse(null);
        System.out.println("First car starting with 'H': " + name);
    }

}
