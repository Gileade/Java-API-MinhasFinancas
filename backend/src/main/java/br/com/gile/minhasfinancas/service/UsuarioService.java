package br.com.gile.minhasfinancas.service;

import br.com.gile.minhasfinancas.model.entity.Usuario;

public interface UsuarioService {

    Usuario autenticar(String email, String senha);

    Usuario salvarUsuario(Usuario usario);

    void validarEmail(String email);
}
