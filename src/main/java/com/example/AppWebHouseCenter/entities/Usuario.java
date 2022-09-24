package com.example.AppWebHouseCenter.entities;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table
public class Usuario {
    @Id @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid")

    private String id;

    @Column(name="email")
    private String email;

    @Column(name="image")
    private String image;

    @Column(name="nombreUsuario")
    private String nombreUsuario;

    public Usuario( String email, String image, String nombreUsuario) {
        this.email = email;
        this.image = image;
        this.nombreUsuario = nombreUsuario;
    }

    public Usuario() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }
}
