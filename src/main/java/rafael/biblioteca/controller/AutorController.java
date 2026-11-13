package rafael.biblioteca.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import rafael.biblioteca.model.Autor;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/autores")
public class AutorController {

    @GetMapping
    public String exibirAutores(Model model) {

        Autor autor = new Autor();
        autor.setNome("J. K. Rowling");
        autor.setNacionalidade("Britânica");
        ArrayList<String> obras = new ArrayList<String>();
        autor.setObrasPublicadas(obras);

        model.addAttribute("autor", autor);

        return "autor";

    }
}
