/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empleados;

public class Empleado {

    private String nombre, fechaNac, fechaIng, foto;
    private float salario, finiquito, bono;

    public boolean setNombre(String n) {
        if (n == null || n == "") {
            return false;
        } else {
            nombre = n;
            return true;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public boolean setFechaNac(String fn) {
        if (fn == null || fn == "") {
            return false;
        } else {
            fechaNac = fn;
            return true;
        }
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public boolean setFechaIng(String fi) {
        if (fi == null || fi == "") {
            return false;
        } else {
            fechaNac = fi;
            return true;
        }
    }

    public String getFechaIng() {
        return fechaIng;
    }

    /*public void setFoto(String foto) {
        this.foto = foto;
    }*/
    public boolean setSalario(float s) {
        if (salario <= 0) {
            return false;
        } else {
            salario = s;
            return true;
        }
    }

    public void setFiniquito(float f) {
        finiquito = f;
    }

    public void setBono(float b) {
        bono = b;
    }

    public float getBono() {
        return bono;
    }

}
