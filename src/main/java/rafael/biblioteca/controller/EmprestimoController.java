package rafael.biblioteca.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import rafael.biblioteca.model.Emprestimo;
import rafael.biblioteca.model.Livro;
import rafael.biblioteca.model.Usuario;

import java.time.LocalDateTime;

@Controller
@RequestMapping("/emprestimos")
public class EmprestimoController {

    @GetMapping
    public String emprestimos(Model model) {
        Emprestimo emprestimo = new Emprestimo();
        emprestimo.setDataEmprestimo(LocalDateTime.now());
        emprestimo.setDataDevolucao(LocalDateTime.now().plusDays(7));
        emprestimo.setStatus("Em andamento");

        Usuario usuario = new Usuario();
        usuario.setNome("Rafael");
        usuario.setMatricula(123456);

        Livro livro = new Livro();
        livro.setTitulo("O Senhor dos Anéis");
        livro.setAutor("J.R.R. Tolkien");
        livro.setIsbn("978-0261102385");

        emprestimo.setUsuario(usuario);
        emprestimo.setLivro(livro);

        model.addAttribute("emprestimo", emprestimo);

        return "livros/emprestimos";
    }
}
