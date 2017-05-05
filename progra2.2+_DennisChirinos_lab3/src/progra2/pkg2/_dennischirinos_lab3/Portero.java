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
public class Portero extends Jugador{
    double NvlAerio;
    double NvlPies;

    public Portero(double NvlAerio, double NvlPies, String Nombre, String Apellido, int Edad, String Estado, String Pais, String PiePreferido, String Equipo) {
        super(Nombre, Apellido, Edad, Estado, Pais, PiePreferido, Equipo);
        this.NvlAerio = NvlAerio;
        this.NvlPies = NvlPies;
    }

    public double getNvlAerio() {
        return NvlAerio;
    }

    public void setNvlAerio(double NvlAerio) {
        this.NvlAerio = NvlAerio;
    }

    public double getNvlPies() {
        return NvlPies;
    }

    public void setNvlPies(double NvlPies) {
        this.NvlPies = NvlPies;
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
    
}
