/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.io.Serializable;
import java.util.ArrayList;

public class panaderia implements Serializable{
    
    private String Nombre;
    private String Direccion;
    private String Nit;
    private String Contacto;
    private String Nom_Usuario;
    private String Pass_Usuario;

    public panaderia(String Nombre, String Direccion, String Nit, String Contacto, String Nom_Usuario, String Pass_Usuario) {
        this.Nombre = Nombre.toUpperCase();
        this.Direccion = Direccion.toUpperCase();
        this.Nit = Nit;
        this.Contacto = Contacto;
        this.Nom_Usuario = Nom_Usuario;
        this.Pass_Usuario = Pass_Usuario;
    }

    public panaderia() {
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getNit() {
        return Nit;
    }

    public void setNit(String Nit) {
        this.Nit = Nit;
    }

    public String getContacto() {
        return Contacto;
    }

    public void setContacto(String Contacto) {
        this.Contacto = Contacto;
    }

    public String getNom_Usuario() {
        return Nom_Usuario;
    }

    public void setNom_Usuario(String Nom_Usuario) {
        this.Nom_Usuario = Nom_Usuario;
    }

    public String getPass_Usuario() {
        return Pass_Usuario;
    }

    public void setPass_Usuario(String Pass_Usuario) {
        this.Pass_Usuario = Pass_Usuario;
    }
    
    
    
}
