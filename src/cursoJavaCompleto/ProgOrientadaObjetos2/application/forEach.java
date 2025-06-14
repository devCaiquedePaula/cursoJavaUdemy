package cursoJavaCompleto.ProgOrientadaObjetos2.application;

public class forEach {
    public static void main(String[] args) {
        String[] vect = new String[] { "Maria", "Alex", "Bob" };
        System.out.println("Using for-each loop:");
        for (String name : vect) {
            System.out.println(name);
        }
        System.out.println("Using traditional for loop:");
        for (int i = 0; i < vect.length; i++) {
            System.out.println(vect[i]);
        }
    }
}
