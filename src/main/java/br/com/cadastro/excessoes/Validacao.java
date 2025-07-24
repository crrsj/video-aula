package br.com.cadastro.excessoes;

import org.springframework.validation.FieldError;

public record Validacao(String campo, String mensagem) {
    public Validacao(FieldError error){
        this(error.getField(), error.getDefaultMessage());
    }
}
