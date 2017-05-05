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
public class Defensa extends Jugador{
    double NvlAgresividad;
    double Altura;
    double Peso;
    double Velocidad;

    public Defensa(double NvlAgresividad, double Altura, double Peso, double Velocidad, String Nombre, String Apellido, int Edad, String Estado, String Pais, String PiePreferido, String Equipo) {
        super(Nombre, Apellido, Edad, Estado, Pais, PiePreferido, Equipo);
        this.NvlAgresividad = NvlAgresividad;
        this.Altura = Altura;
        this.Peso = Peso;
        this.Velocidad = Velocidad;
    }

    public double getNvlAgresividad() {
        return NvlAgresividad;
    }

    public void setNvlAgresividad(double NvlAgresividad) {
        this.NvlAgresividad = NvlAgresividad;
    }

    public double getAltura() {
        return Altura;
    }

    public void setAltura(double Altura) {
        this.Altura = Altura;
    }

    public double getPeso() {
        return Peso;
    }

    public void setPeso(double Peso) {
        this.Peso = Peso;
    }

    public double getVelocidad() {
        return Velocidad;
    }

    public void setVelocidad(double Velocidad) {
        this.Velocidad = Velocidad;
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
