/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.io.Serializable;
import java.util.ArrayList;

public class panaderia implements Serializable{
    
    private String nombre;
    private String direccion;
    private String nit;
    private String contacto;
    private String nom_usuario;
    private String pass_usuario;

    public panaderia(String nombre, String direccion, String nit, String contacto, String nom_usuario, String pass_usuario) {
        this.nombre = nombre.toUpperCase();
        this.direccion = direccion.toUpperCase();
        this.nit = nit;
        this.contacto = contacto;
        this.nom_usuario = nom_usuario;
        this.pass_usuario = pass_usuario;
    }

    public panaderia() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getNom_usuario() {
        return nom_usuario;
    }

    public void setNom_usuario(String nom_usuario) {
        this.nom_usuario = nom_usuario;
    }

    public String getPass_usuario() {
        return pass_usuario;
    }

    public void setPass_usuario(String pass_usuario) {
        this.pass_usuario = pass_usuario;
    }
    
    
    
}
