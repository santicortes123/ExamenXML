package main.poli.ces3.co.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Autores{
    private String cedula;
    private String apellido;
    private String nombre;
    private String ciudad;
    private String pais;
    private String residencia;
    private String telefono;
    private String correo;
    private String foto;



    @JsonCreator
    public Autores(
            @JsonProperty("cedula") String cedula,
            @JsonProperty("nombre") String nombre,
            @JsonProperty("apellido") String apellido,
            @JsonProperty("ciudad") String ciudad,
            @JsonProperty("pais") String pais,
            @JsonProperty("residencia") String residencia,
            @JsonProperty("telefono") String telefono,
            @JsonProperty("correo") String correo,
            @JsonProperty("foto") String foto) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.ciudad = ciudad;
        this.pais = pais;
        this.residencia = residencia;
        this.telefono = telefono;
        this.correo = correo;
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getResidencia() {
        return residencia;
    }

    public void setResidencia(String residencia) {
        this.residencia = residencia;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }



    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
}
