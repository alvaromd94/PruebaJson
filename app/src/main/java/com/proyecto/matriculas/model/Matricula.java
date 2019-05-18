package com.proyecto.matriculas.model;



public class Matricula {

    private Integer N_Registro;
    private String Infraccion;
    private String Fecha_Infraccion;
    private String N_Matricula;
    private Integer IDPropietariosFK;

    public Matricula() {
        this.N_Registro = null;
        this.Infraccion = "";
        this.Fecha_Infraccion = "";
        this.N_Matricula = "";
        this.IDPropietariosFK = null;
    }

    public Matricula(Integer N_Registro,  String Infraccion, String Fecha_Infraccion, String N_Matricula, Integer IDPropietariosFK) {
        this.N_Registro = N_Registro;
        this.Infraccion = Infraccion;
        this.Fecha_Infraccion = Fecha_Infraccion;
        this.N_Matricula = N_Matricula;
        this.IDPropietariosFK = IDPropietariosFK;
    }

    public Integer getN_Registro() {
        return N_Registro;
    }

    public void setN_Registro(Integer N_Registro) {
        this.N_Registro = N_Registro;
    }

    public String getInfraccion() {
        return Infraccion;
    }

    public void setInfraccion(String Infraccion) {
        this.Infraccion = Infraccion;
    }

    public String getFecha_Infraccion() {
        return Fecha_Infraccion;
    }

    public void setFecha_Infraccion(String Fecha_Infraccion) { this.Fecha_Infraccion = Fecha_Infraccion; }

    public String getN_Matricula() {
        return N_Matricula;
    }

    public void setN_Matricula(String N_Matricula) {
        this.N_Matricula = N_Matricula;
    }

    public Integer getIDPropietariosFK() {
        return IDPropietariosFK;
    }

    public void setIDPropietariosFK(Integer IDPropietariosFK) { this.IDPropietariosFK = IDPropietariosFK; }

    @Override
    public String toString() {
        return "Matricula {" +
                "N_Registro=" + N_Registro +
                ", Infraccion='" + Infraccion + '\'' +
                ", Fecha_Infraccion=" + Fecha_Infraccion +
                ", N_Matricula='" + N_Matricula + '\'' +
                ", matricula='" + IDPropietariosFK + '\'' +
                '}';
    }
}
