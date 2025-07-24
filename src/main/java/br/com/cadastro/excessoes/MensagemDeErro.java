package br.com.cadastro.excessoes;

import org.springframework.http.HttpStatus;

public record MensagemDeErro(HttpStatus status, String mensagem) {
}
