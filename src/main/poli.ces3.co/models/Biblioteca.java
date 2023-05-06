package main.poli.ces3.co.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Biblioteca {
    private  String nombre;
    @JsonIgnoreProperties(ignoreUnknown = true)
    private String noNamespaceSchemaLocation;
    private String centro;
    private String portada;
    private List<Libros> libro;

    private int anyo;

   private String titulo;


   private List<Autores> autor;

    @JsonCreator
    public Biblioteca(@JsonProperty("nombre") String nombre,
                      @JsonProperty("centro") String centro,
                      @JsonProperty("portada") String portada,
                      @JsonProperty("libro") List<Libros> libro
    ) {
        this.centro = centro;
        this.portada = portada;
        this.libro = libro;
    }

    public List<Autores> getAutor() {
        return autor;
    }

    public void setAutor(List<Autores> autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnyo() {
        return anyo;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }

    public String getNoNamespaceSchemaLocation() {
        return noNamespaceSchemaLocation;
    }

    public void setNoNamespaceSchemaLocation(String noNamespaceSchemaLocation) {
        this.noNamespaceSchemaLocation = noNamespaceSchemaLocation;
    }

    public String getCentro() {
        return centro;
    }

    public void setCentro(String centro) {
        this.centro = centro;
    }

    public String getPortada() {
        return portada;
    }

    public void setPortada(String portada) {
        this.portada = portada;
    }

    public List<Libros> getLibro() {
        return libro;
    }

    public void setLibro(List<Libros> libro) {
        this.libro = libro;
    }
}
