package practice10_Metodos_de_Referencia;

public class Persona {
    private String name;

    public Persona(String name) {
        this.name = name;
    }

    public Persona() {
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "name='" + name + '\'' +
                '}';
    }
}
