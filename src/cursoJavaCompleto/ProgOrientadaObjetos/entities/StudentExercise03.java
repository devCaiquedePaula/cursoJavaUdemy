package cursoJavaCompleto.ProgOrientadaObjetos.entities;

public class StudentExercise03 {
    public String name;
    public double firstTrimester;
    public double secondTrimester;
    public double thirdTrimester;

    public double finalGrade() {
        return firstTrimester + secondTrimester + thirdTrimester;
    }

    public double missingPoints() {
        if (finalGrade() < 60.0) {
            return 60.0 - finalGrade();
        } else {
            return 0.0;
        }
    }
}
