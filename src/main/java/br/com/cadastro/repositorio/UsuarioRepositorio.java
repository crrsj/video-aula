package br.com.cadastro.repositorio;

import br.com.cadastro.entidade.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepositorio extends JpaRepository<Usuario,Long> {

}
