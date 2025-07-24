package br.com.cadastro.dto;

import br.com.cadastro.enums.Sexo;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioDTO {
    private Long id;
    @NotBlank(message="não pode estar em branco")
    private String nome;
    @NotBlank(message="não pode estar em branco")
    private  String telefone;
    @NotBlank(message="não pode estar em branco")
    private String email;
    private Sexo sexo;
}
