package br.com.cadastro.entidade.conversores;

import br.com.cadastro.dto.UsuarioDTO;
import br.com.cadastro.entidade.Usuario;
import org.springframework.stereotype.Component;

@Component
public class ConversorDTO {

    public Usuario entidadeParaDtO(UsuarioDTO usuarioDTO){
        var usuario = new Usuario();
        usuario.setId(usuarioDTO.getId());
        usuario.setNome(usuarioDTO.getNome());
        usuario.setTelefone(usuarioDTO.getTelefone());
        usuario.setEmail(usuarioDTO.getEmail());
        usuario.setSexo(usuarioDTO.getSexo());
        return usuario;
    }

    public UsuarioDTO dtoParaEntidade(Usuario usuario){
        var novoUsuario = new UsuarioDTO();
        novoUsuario.setId(usuario.getId());
        novoUsuario.setNome(usuario.getNome());
        novoUsuario.setTelefone(usuario.getTelefone());
        novoUsuario.setEmail(usuario.getEmail());
        novoUsuario.setSexo(usuario.getSexo());
        return novoUsuario;
    }
}
