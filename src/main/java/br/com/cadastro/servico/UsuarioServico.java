package br.com.cadastro.servico;

import br.com.cadastro.dto.UsuarioDTO;
import br.com.cadastro.entidade.Usuario;
import br.com.cadastro.entidade.conversores.ConversorDTO;
import br.com.cadastro.excessoes.UsuarioNaoEncontrado;
import br.com.cadastro.repositorio.UsuarioRepositorio;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UsuarioServico {

    private final UsuarioRepositorio usuarioRepositorio;
    private final ConversorDTO conversorDTO;

    public UsuarioDTO cadastrarUsuario(UsuarioDTO usuarioDTO){
        var usuario = conversorDTO.dtoParaEntidade(usuarioDTO);
        var salvarUsuario = usuarioRepositorio.save(usuario);
        return conversorDTO.entidadeParaDtO(salvarUsuario);
    }

    public List<UsuarioDTO> buscarUsuarios(){
        return usuarioRepositorio.findAll().stream().map(conversorDTO::entidadeParaDtO).toList();
    }

    public UsuarioDTO buscarPorId(Long id){
        var buscar = usuarioRepositorio.findById(id).orElseThrow(()->new UsuarioNaoEncontrado("Usuário não encontrado !"));
        return conversorDTO.entidadeParaDtO(buscar);
    }

    public UsuarioDTO atualizarUsuario(Long id,UsuarioDTO usuarioDTO){
        Usuario usuario = conversorDTO.dtoParaEntidade(usuarioDTO);
        usuario.setId(id);
        var salvarUsuario = usuarioRepositorio.save(usuario);
        return conversorDTO.entidadeParaDtO(salvarUsuario);
    }

    public void excluir(Long id){
        buscarPorId(id);
        usuarioRepositorio.deleteById(id);
    }

    public UsuarioDTO atualizarParcial(UsuarioDTO usuarioDTO){
        var atualizar = usuarioRepositorio.getReferenceById(usuarioDTO.getId());
        atualizar.atualizando(usuarioDTO);
        var atualizando =  usuarioRepositorio.save(atualizar);
        return conversorDTO.entidadeParaDtO(atualizando);

    }

}
