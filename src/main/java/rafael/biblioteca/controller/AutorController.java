package rafael.biblioteca.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/autores")
public class AutorController {

    @GetMapping
    public String autores() {
        return "livros/autores";
    }
}
