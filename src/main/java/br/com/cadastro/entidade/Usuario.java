package br.com.cadastro.entidade;

import br.com.cadastro.dto.UsuarioDTO;
import br.com.cadastro.enums.Sexo;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_usuarios")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private  String telefone;
    private String email;
    @Enumerated(EnumType.STRING)
    private Sexo sexo;

    public void atualizando(UsuarioDTO usuarioDTO) {
        if(usuarioDTO.getNome() != null){
            this.nome = usuarioDTO.getNome();
        }

        if(usuarioDTO.getTelefone()!= null){
            this.telefone = usuarioDTO.getTelefone();
        }

        if(usuarioDTO.getEmail() != null){
            this.email = usuarioDTO.getEmail();
        }

        if (usuarioDTO.getSexo()!= null){
            this.sexo = usuarioDTO.getSexo();
        }
    }
}
