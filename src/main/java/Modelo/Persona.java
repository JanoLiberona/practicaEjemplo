package Modelo;


public class Persona {
    private String rut, nombre, apellido, direccion, comuna, fnacimiento, genero, rrss;

    public Persona(String rut, String nombre, String apellido, String direccion, String comuna, String fnacimiento, String genero, String rrss) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.comuna = comuna;
        this.fnacimiento = fnacimiento;
        this.genero = genero;
        this.rrss = rrss;
    }

    public Persona() {
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public String getFnacimiento() {
        return fnacimiento;
    }

    public void setFnacimiento(String fnacimiento) {
        this.fnacimiento = fnacimiento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getRrss() {
        return rrss;
    }

    public void setRrss(String rrss) {
        this.rrss = rrss;
    }
    
    
}
