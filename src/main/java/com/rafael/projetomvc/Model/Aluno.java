package com.rafael.projetomvc.Model;

import java.util.ArrayList;

public record Aluno (


    String nome,
    int id,
    String curso

)

{
    public int getId() {
        return 0;
    }
}