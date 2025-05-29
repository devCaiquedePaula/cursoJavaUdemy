package cursoJavaCompleto.ProgOrientadaObjetos.entities;

public class VectorStudent {
    private String name;
    private String email;

    public VectorStudent(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String toString() {
        return name + ", " + email;
    }
}
