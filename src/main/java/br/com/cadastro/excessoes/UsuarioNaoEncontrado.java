package br.com.cadastro.excessoes;

public class UsuarioNaoEncontrado extends RuntimeException {
    public UsuarioNaoEncontrado(String mensagem) {
        super(mensagem);
    }

    public UsuarioNaoEncontrado(){
        super("Usuário,não encontrado !");
    }
}
