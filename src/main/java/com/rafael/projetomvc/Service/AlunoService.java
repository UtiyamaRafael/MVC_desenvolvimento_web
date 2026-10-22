package com.rafael.projetomvc.Service;

import com.rafael.projetomvc.Model.Aluno;
import org.springframework.stereotype.Service;

@Service
public class AlunoService {

    public boolean validacaoCadastro(Aluno aluno) {
        if (!validaNome(aluno.nome()) || !validaId(aluno.id()) || !validaCurso(aluno.curso())) {
            return false;
        }
        return true;
    }

    public boolean validaNome(String nome) {
        return nome != null && !nome.isEmpty();
    }

    public boolean validaId(int id) {
        return id > 0;
    }

    public boolean validaCurso(String curso) {
        return curso != null && !curso.isEmpty();
    }




}
