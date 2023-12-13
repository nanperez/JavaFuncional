package proyectoEmpleado.Clases;

public class Empleado {
    private String grado;
    private int anioIngreso;
    private String ciudad;
    private String tipoPago;
    private int edad;
    private String genero;
    private boolean desempleado;
    private int aniosExperiencia;
    private boolean permanencia;

    // Constructor
    public Empleado(String grado, int anioIngreso, String ciudad, String tipoPago, int edad,
                    String genero, boolean desempleado, int aniosExperiencia, boolean permanencia) {
        this.grado = grado;
        this.anioIngreso = anioIngreso;
        this.ciudad = ciudad;
        this.tipoPago = tipoPago;
        this.edad = edad;
        this.genero = genero;
        this.desempleado = desempleado;
        this.aniosExperiencia = aniosExperiencia;
        this.permanencia = permanencia;
    }

    // Getters and Setters

    public String getgrado() {
        return grado;
    }

    public void setgrado(String grado) {
        this.grado = grado;
    }

    public int getanioIngreso() {
        return anioIngreso;
    }

    public void setanioIngreso(int anioIngreso) {
        this.anioIngreso = anioIngreso;
    }

    public String getciudad() {
        return ciudad;
    }

    public void setciudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String gettipoPago() {
        return tipoPago;
    }

    public void settipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

    public int getedad() {
        return edad;
    }

    public void setedad(int edad) {
        this.edad = edad;
    }

    public String getgenero() {
        return genero;
    }

    public void setgenero(String genero) {
        this.genero = genero;
    }

    public boolean isdesempleado() {
        return desempleado;
    }

    public void setdesempleado(boolean desempleado) {
        this.desempleado = desempleado;
    }

    public int getaniosExperiencia() {
        return aniosExperiencia;
    }

    public void setaniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    public boolean ispermanencia() {
        return permanencia;
    }

    public void setpermanencia(boolean permanencia) {
        this.permanencia = permanencia;
    }

   
    @Override
    public String toString() {
        return "[" +
                grado + '\'' +
                "," + anioIngreso +
                "," + ciudad + '\'' +
                "," + tipoPago + '\'' +
                "," + edad +
                "," + genero + '\'' +
                "," + desempleado +
                "," + aniosExperiencia +
                "," + permanencia +
                ']';
    }
}
