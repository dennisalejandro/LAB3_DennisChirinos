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
public class Delantero extends Jugador {

    double NvlDefinicion;
    double Altura;
    double Velocidad;
    double Goles;

    
    public Delantero(double NvlDefinicion, double Altura, double Velocidad, double Goles, String Nombre, String Apellido, int Edad, String Estado, String Pais, String PiePreferido, String Equipo) {
        super(Nombre, Apellido, Edad, Estado, Pais, PiePreferido, Equipo);
        this.NvlDefinicion = NvlDefinicion;
        this.Altura = Altura;
        this.Velocidad = Velocidad;
        this.Goles = Goles;
    }

    public Delantero(double NvlDefinicion, double Altura, double Velocidad, double Goles, String Nombre, String Apellido, int Edad, String Estado, String Pais, String PiePreferido) {
        super(Nombre, Apellido, Edad, Estado, Pais, PiePreferido);
        this.NvlDefinicion = NvlDefinicion;
        this.Altura = Altura;
        this.Velocidad = Velocidad;
        this.Goles = Goles;
    }
    

    public double getNvlDefinicion() {
        return NvlDefinicion;
    }

    public void setNvlDefinicion(double NvlDefinicion) {
        this.NvlDefinicion = NvlDefinicion;
    }

    public double getAltura() {
        return Altura;
    }

    public void setAltura(double Altura) {
        this.Altura = Altura;
    }

    public double getVelocidad() {
        return Velocidad;
    }

    public void setVelocidad(double Velocidad) {
        this.Velocidad = Velocidad;
    }

    public double getGoles() {
        return Goles;
    }

    public void setGoles(double Goles) {
        this.Goles = Goles;
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
