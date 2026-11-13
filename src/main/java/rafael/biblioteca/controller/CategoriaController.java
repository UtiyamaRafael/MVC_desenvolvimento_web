package rafael.biblioteca.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import rafael.biblioteca.model.Categoria;

@Controller
@RequestMapping("/categorias")
public class CategoriaController {

    @GetMapping
    public String categorias(Model model){

        Categoria categoria = new Categoria();
        categoria.setGenero("Ficção Científica");

        model.addAttribute("categoria", categoria);
        return "categorias";
    }

}
