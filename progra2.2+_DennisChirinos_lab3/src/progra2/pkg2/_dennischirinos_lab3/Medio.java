/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra2.pkg2._dennischirinos_lab3;

/**
 *
 * @author denni
 */
public class Medio extends Jugador{
    double NvlCreatividad;
    double NvlDominio;
    double Asistencias;

    public Medio(double NvlCreatividad, double NvlDominio, double Asistencias, String Nombre, String Apellido, int Edad, String Estado, String Pais, String PiePreferido, String Equipo) {
        super(Nombre, Apellido, Edad, Estado, Pais, PiePreferido, Equipo);
        this.NvlCreatividad = NvlCreatividad;
        this.NvlDominio = NvlDominio;
        this.Asistencias = Asistencias;
    }

    public double getNvlCreatividad() {
        return NvlCreatividad;
    }

    public void setNvlCreatividad(double NvlCreatividad) {
        this.NvlCreatividad = NvlCreatividad;
    }

    public double getNvlDominio() {
        return NvlDominio;
    }

    public void setNvlDominio(double NvlDominio) {
        this.NvlDominio = NvlDominio;
    }

    public double getAsistencias() {
        return Asistencias;
    }

    public void setAsistencias(double Asistencias) {
        this.Asistencias = Asistencias;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String Pais) {
        this.Pais = Pais;
    }

    public String getPiePreferido() {
        return PiePreferido;
    }

    public void setPiePreferido(String PiePreferido) {
        this.PiePreferido = PiePreferido;
    }

    public String getEquipo() {
        return Equipo;
    }

    public void setEquipo(String Equipo) {
        this.Equipo = Equipo;
    }

    @Override
    public String toString() {
        return Nombre;
    }
    
}
