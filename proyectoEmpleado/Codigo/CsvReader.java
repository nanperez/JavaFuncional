package proyectoEmpleado.Clases;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CsvReader implements IEmpleadoRepository{
    private static final String SEPARADOR = ",";
    private final String ruta;

    public CsvReader(String ruta) {
        this.ruta = ruta;
    }

    @Override
    public List<Empleado> obtenerEmpleados() {
        Path path = Path.of(ruta);

        try {
        return Files.lines(path)
                .skip(1) // Saltar la primera línea si contiene encabezados
                .map(linea -> linea.split(SEPARADOR))
                .map(this::mapearAEmpleado)
                .collect(Collectors.toList());
    } catch (IOException e) {
        // Manejar la excepción apropiadamente
        e.printStackTrace(); // O usa un logger para registrar la excepción
        return Collections.emptyList(); // o lanza una excepción personalizada o retorna un valor predeterminado
    }
    }

    private Empleado mapearAEmpleado(String[] campos) {
        
        String grado = campos[0];
        int anioIngreso = Integer.parseInt(campos[1]);
        String ciudad = campos[2];
        String tipoPago = campos[3];
        int edad = Integer.parseInt(campos[4]);
        String genero = campos[5];
        boolean desempleado = Boolean.parseBoolean(campos[6]);
        int aniosExperiencia = Integer.parseInt(campos[7]);
        boolean permanencia = Boolean.parseBoolean(campos[8]);

        return new Empleado(grado, anioIngreso, ciudad, tipoPago, edad, genero, desempleado, aniosExperiencia, permanencia);
    }

    

}
