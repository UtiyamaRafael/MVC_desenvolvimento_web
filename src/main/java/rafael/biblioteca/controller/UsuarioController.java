package rafael.biblioteca.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import rafael.biblioteca.model.Usuario;

@Controller
@RequestMapping("/usuarios")
public class UsuarioController {

    @GetMapping
    public String usuarios(Model model) {

        Usuario usuario = new Usuario();

        usuario.setNome("Rafael");
        usuario.setMatricula(123456);

        model.addAttribute("usuario", usuario);

        return "usuarios";
    }
}
