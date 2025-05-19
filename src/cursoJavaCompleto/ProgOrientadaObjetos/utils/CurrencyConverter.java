package cursoJavaCompleto.ProgOrientadaObjetos.utils;

public class CurrencyConverter {
    public static double IOF = 0.06;

    public static double convertToReais(double dollars, double dollarPrice) {
        return dollars * dollarPrice * (1.0 + IOF);
    }
}
