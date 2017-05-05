/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra2.pkg2._dennischirinos_lab3;

import java.util.ArrayList;

/**
 *
 * @author denni
 */
public class Equipo {

    String Nombre;
    int Palmares;
    String Ciudad;
    double Presupuesto;
    ArrayList<Delantero> Delanteros = new ArrayList<>();
    ArrayList<Medio> Medios = new ArrayList<>();
    ArrayList<Defensa> Defensas = new ArrayList<>();
    ArrayList<Portero> Porteros = new ArrayList<>();
    Delantero[] DelanterosAct = new Delantero[2];
    Medio[] MediosAct = new Medio[5];
    Defensa[] DefensasAct = new Defensa[3];
    Portero[] PorteroAct = new Portero[1];

    @Override
    public String toString() {
        return Nombre;
    }
    

    public Equipo(String Nombre, int Palmares, String Ciudad, double Presupuesto) {
        this.Nombre = Nombre;
        this.Palmares = Palmares;
        this.Ciudad = Ciudad;
        this.Presupuesto = Presupuesto;
    }
    

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getPalmares() {
        return Palmares;
    }

    public void setPalmares(int Palmares) {
        this.Palmares = Palmares;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    public double getPresupuesto() {
        return Presupuesto;
    }

    public void setPresupuesto(double Presupuesto) {
        this.Presupuesto = Presupuesto;
    }

    public ArrayList<Delantero> getDelanteros() {
        return Delanteros;
    }

    public void setDelanteros(ArrayList<Delantero> Delanteros) {
        this.Delanteros = Delanteros;
    }

    public ArrayList<Medio> getMedios() {
        return Medios;
    }

    public void setMedios(ArrayList<Medio> Medios) {
        this.Medios = Medios;
    }

    public ArrayList<Defensa> getDefensas() {
        return Defensas;
    }

    public void setDefensas(ArrayList<Defensa> Defensas) {
        this.Defensas = Defensas;
    }

    public ArrayList<Portero> getPorteros() {
        return Porteros;
    }

    public void setPorteros(ArrayList<Portero> Porteros) {
        this.Porteros = Porteros;
    }

}
