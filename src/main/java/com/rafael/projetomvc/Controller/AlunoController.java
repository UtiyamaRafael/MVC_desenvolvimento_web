package com.rafael.projetomvc.Controller;

import com.rafael.projetomvc.Model.Aluno;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/aluno")
public class AlunoController {

    private List<Aluno> alunos = new ArrayList<>();

    @PostMapping("/")
    public String addAluno(@RequestBody Aluno aluno) {
        alunos.add(aluno);
        return "Aluno adicionado com sucesso!";
    }

    @GetMapping("/")
    public List<Aluno> getAllUsers() {
        return alunos;
    }

    @DeleteMapping("/{id}")
    public String excluirAluno(@PathVariable int id) {
        alunos.removeIf(aluno -> aluno.getId() == id);
        return "Aluno excluído com sucesso!";
    }

}