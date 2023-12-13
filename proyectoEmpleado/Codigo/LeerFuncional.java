package proyectoEmpleado.Clases;


import java.util.List;


public class LeerFuncional {
    private final IEmpleadoRepository empleadoRepository;

    public LeerFuncional(IEmpleadoRepository empleadoRepository) {
        this.empleadoRepository = empleadoRepository;
    }

    public void primerosDiez() {
        List<Empleado> empleados = empleadoRepository.obtenerEmpleados();
        System.out.println(empleados.size());
        empleados.stream()
        .limit(10)
        .forEach(e->System.out.println(e));
    }

    public static void main(String[] args) {
        // Usa CsvReader como implementación de IEmpleadoRepository
        IEmpleadoRepository csvReader = new CsvReader("/home/naperez/Documentos/CodeHaskell/proyectoEmpleado/Clases/Employee.csv");

        LeerFuncional leerFuncional = new LeerFuncional(csvReader);
        leerFuncional.primerosDiez();
    }
}
