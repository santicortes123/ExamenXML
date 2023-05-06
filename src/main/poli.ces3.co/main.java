package main.poli.ces3.co;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import main.poli.ces3.co.models.Biblioteca;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class main {
    public main() {
    }

    public static void main(String[] args) {
        try {
            ObjectMapper mapper = new XmlMapper();
            InputStream inputStream = new FileInputStream(new File("src\\resource\\biblioteca.xml"));
            TypeReference<List<Biblioteca>> typeReference = new TypeReference<List<Biblioteca>>(){};
            List<Biblioteca> bibliotecas = mapper.readValue(inputStream, typeReference);

        }catch (IOException ex){
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }

    }
}