package rafael.biblioteca.model;

import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;

@Getter
@Setter
public class Emprestimo {

    private LocalDateTime dataEmprestimo;
    private LocalDateTime dataDevolucao;
    private Usuario usuario;
    private Livro livro;
    private String status;

}
