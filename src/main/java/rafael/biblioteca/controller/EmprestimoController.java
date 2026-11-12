package rafael.biblioteca.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/emprestimos")
public class EmprestimoController {

    @GetMapping
    public String emprestimos() {
        return "livros/emprestimos";
    }
}
