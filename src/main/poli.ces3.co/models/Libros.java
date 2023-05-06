package main.poli.ces3.co.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Libros {
    private String titulo;
    private Integer anyo;
    private String pais;
    private String editorial;
    private double precio;
    private List<Autores> autor;

    @JsonCreator
    public Libros(@JsonProperty("titulo") String titulo,
                  @JsonProperty("anyo") Integer anyo,
                  @JsonProperty("pais") String pais,
                  @JsonProperty("editorial") String editorial,
                  @JsonProperty("precio") double precio,
                  @JsonProperty("autor") List<Autores> autor
    ) {
        this.titulo = titulo;
        this.anyo = anyo;
        this.pais = pais;
        this.editorial = editorial;
        this.precio = precio;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getAnyo() {
        return anyo;
    }

    public void setAnyo(Integer anyo) {
        this.anyo = anyo;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public List<Autores> getAutor() {
        return autor;
    }

    public void setAutor(List<Autores> autor) {
        this.autor = autor;
    }
}
