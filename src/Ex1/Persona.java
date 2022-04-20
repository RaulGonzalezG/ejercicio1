package Ex1;

import java.util.Optional;

public class Persona {
    private String nombre;
    private String poblacion;
    private Optional<Integer> edad;

    public Persona(String nombre, String poblacion, Optional<Integer> edad)
    {
        this.nombre = nombre;
        this.poblacion = poblacion;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public Optional<Integer> getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public void setEdad(Optional<Integer> edad) {
        this.edad = edad;
    }

    public String toString() {
        return "nombre:" + nombre + '.' +
                " poblacion:" + poblacion + '.' +
                " edad:" + edad;
    }
}
