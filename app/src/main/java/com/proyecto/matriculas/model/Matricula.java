package com.proyecto.matriculas.model;



public class Matricula {

    private Integer idRegistro;
    private String infraccion;
    private String fecha;
    private String matricula;

    public Matricula(int idUsuario, String nombreUsuario, String claveUsuario) {
        this.idRegistro = null;
        this.infraccion = "";
        this.fecha = "";
        this.matricula = "";
    }

    public Matricula(Integer idRegistro, String infraccion, String fecha, String matricula) {
        this.idRegistro = idRegistro;
        this.infraccion = infraccion;
        this.fecha = fecha;
        this.matricula = matricula;
    }

    public Integer getIdRegistro() {
        return idRegistro;
    }

    public void setIdRegistro(Integer idRegistro) {
        this.idRegistro = idRegistro;
    }

    public String getInfraccion() {
        return infraccion;
    }

    public void setInfraccion(String infraccion) {
        this.infraccion = infraccion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Matricula {" +
                "idRegistro=" + idRegistro +
                ", infraccion='" + infraccion + '\'' +
                ", fecha=" + fecha +
                ", matricula='" + matricula + '\'' +
                '}';
    }
}
