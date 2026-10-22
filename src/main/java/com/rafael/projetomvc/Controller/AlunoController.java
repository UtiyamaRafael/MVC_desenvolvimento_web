package com.rafael.projetomvc.Controller;

import com.rafael.projetomvc.Model.Aluno;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/aluno")
public class AlunoController {

    private List<Aluno> alunos = new ArrayList<>();

    //Add a user
    @PostMapping("/")
    public String addAluno(@RequestBody Aluno aluno) {
        alunos.add(aluno);
        return "Aluno adicionado com sucesso!";
    }

    //Show all users
    @GetMapping("/")
    public List<Aluno> getAllUsers() {
        return alunos;
    }

    //Show a user by ID
    @GetMapping("/{id}")
    public Aluno getAlunoById(@PathVariable int id) {
        return alunos.stream() //transforma em elementos, permitindo acessar cada elemento individualmente
                .filter(aluno -> aluno.id() == id)
                .findFirst()
                .orElse(null);
    }

    //Show a user by name
    @GetMapping("/nome/{nome}")
    public Aluno getAlunoByName(@PathVariable String nome) {
        return alunos.stream() //transforma em elementos, permitindo acessar cada elemento individualmente
                .filter(aluno -> aluno.nome().equals(nome))
                .findFirst()
                .orElse(null);
    }


    //Delete a user by ID
    @DeleteMapping("/{id}")
    public String excluirAluno(@PathVariable int id) {
        return alunos.removeIf(aluno -> aluno.id() == id)
                ? "Aluno excluído com sucesso!"
                : "Aluno não encontrado!";
    }

}