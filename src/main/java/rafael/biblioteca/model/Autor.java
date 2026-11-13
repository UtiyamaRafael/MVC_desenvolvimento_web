package rafael.biblioteca.model;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class Autor {

    private String nome;
    private String nacionalidade;
    private ArrayList<String> obrasPublicadas;

}
