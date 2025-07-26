package br.com.cadastro.controle;

import br.com.cadastro.dto.UsuarioDTO;
import br.com.cadastro.servico.UsuarioServico;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
@RequiredArgsConstructor
public class UsuarioControle {

    private final UsuarioServico usuarioServico;

    @PostMapping
    @Operation(summary = "Endpoint responsável pelo cadastro de usuários.")
    @ApiResponse(responseCode = "201",description = " sucesso",content = {
            @Content(mediaType = "application.json",schema = @Schema(implementation = ResponseEntity.class))
    })
    public ResponseEntity<UsuarioDTO>cadastrarUsuario(@RequestBody @Valid UsuarioDTO usuarioDTO){
        var criarUsuario = usuarioServico.cadastrarUsuario(usuarioDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(criarUsuario);
    }
    @GetMapping
    @Operation(summary = "Endpoint responsável por buscar os usuarios.")
    @ApiResponse(responseCode = "200",description = " sucesso",content = {
            @Content(mediaType = "application.json",schema = @Schema(implementation = ResponseEntity.class))
    })
    public ResponseEntity<List<UsuarioDTO>>buscarTodos(){
        return ResponseEntity.status(HttpStatus.OK).body(usuarioServico.buscarUsuarios());
    }

    @GetMapping("/{id}")
    @Operation(summary = "Endpoint responsável por buscar usuarios pelo id.")
    @ApiResponse(responseCode = "200",description = " sucesso",content = {
            @Content(mediaType = "application.json",schema = @Schema(implementation = ResponseEntity.class))
    })
    public ResponseEntity<UsuarioDTO>buscarPorId(@PathVariable Long id){
        var buscarId = usuarioServico.buscarPorId(id);
        return ResponseEntity.status(HttpStatus.OK).body(buscarId);

    }

    @PutMapping("/{id}")
    @Operation(summary = "Endpoint responsável por atualizar usuarios pelo id.")
    @ApiResponse(responseCode = "200",description = " sucesso",content = {
            @Content(mediaType = "application.json",schema = @Schema(implementation = ResponseEntity.class))
    })
    public ResponseEntity<UsuarioDTO>atualizarUsuario(@PathVariable Long id,@RequestBody @Valid UsuarioDTO usuarioDTO){
        var atualizar = usuarioServico.atualizarUsuario(id,usuarioDTO);
        return ResponseEntity.status(HttpStatus.OK).body(atualizar);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Endpoint responsável por excluir usuarios pelo id.")
    @ApiResponse(responseCode = "204",description = " sucesso",content = {
            @Content(mediaType = "application.json",schema = @Schema(implementation = ResponseEntity.class))
    })
    public ResponseEntity<UsuarioDTO> excluirUsuario(@PathVariable Long id){
        usuarioServico.excluir(id);
        return ResponseEntity.noContent().build();
    }

    @PatchMapping
    @Operation(summary = "Endpoint responsável por atualizar parcialmente.")
    @ApiResponse(responseCode = "200",description = " sucesso",content = {
            @Content(mediaType = "application.json",schema = @Schema(implementation = ResponseEntity.class))
    })
    public ResponseEntity<UsuarioDTO>atualizarParcial(@RequestBody UsuarioDTO usuarioDTO){
        var atualizar = usuarioServico.atualizarParcial(usuarioDTO);
        return ResponseEntity.status(HttpStatus.OK).body(atualizar);
    }

}
