package Ex1;

import Ex1.Persona;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.io.IOException;

    public class Main
    {
        public static void main(String[] args) throws IOException
        {
            File doc = new File("Personas.txt");
            FileReader lector = new FileReader(doc);
            BufferedReader personas = new BufferedReader(lector);

            List<Persona> listaPersonas = new ArrayList<>();
            Persona persona;
            String [] arrayLinea = new String[2];
            String parrafo = "";

            while ((parrafo = personas.readLine()) != null){
                arrayLinea = parrafo.split(":");
                Optional<Integer> edad = arrayLinea.length<=2?Optional.empty():Optional.of(Integer.parseInt(arrayLinea[2]));
                persona = new Persona(arrayLinea[0], arrayLinea[1].equals("")?"null": arrayLinea[1], edad);
            listaPersonas.add(persona);
        }

        listaPersonas.stream()
                .filter(p ->
                {
                    if (p.getEdad().isEmpty())
                        return false;
                    else
                        return p.getEdad().get() <25;
                })
                .forEach(p -> System.out.println(p));
    }
}

