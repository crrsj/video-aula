package br.com.cadastro.excessoes;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class TratandoExcessoes {

    @ExceptionHandler(UsuarioNaoEncontrado.class)
    public ResponseEntity<MensagemDeErro>usuarioNaoEncontrado(){
        var msg = new MensagemDeErro(HttpStatus.NOT_FOUND,"Usuário não encontrado !");
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(msg);
    }
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<?>validandoCampos(MethodArgumentNotValidException exception){
        var erros = exception.getFieldErrors();
        return ResponseEntity.badRequest().body(erros.stream().map(Validacao::new).toList());
    }
}
