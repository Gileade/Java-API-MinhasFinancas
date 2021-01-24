package br.com.gile.minhasfinancas.service.impl;

import br.com.gile.minhasfinancas.exception.RegraNegocioException;
import br.com.gile.minhasfinancas.model.entity.Usuario;
import br.com.gile.minhasfinancas.model.repository.UsuarioRepository;
import br.com.gile.minhasfinancas.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    private UsuarioRepository repository;

    @Autowired
    public UsuarioServiceImpl(UsuarioRepository repository) {
        this.repository = repository;
    }

    @Override
    public Usuario autenticar(String email, String senha) {
        return null;
    }

    @Override
    public Usuario salvarUsuario(Usuario usario) {
        return null;
    }

    @Override
    public void validarEmail(String email) {
        boolean existe = repository.existsByEmail(email);
        if (existe){
            throw new RegraNegocioException("Já existe um usuário cadastrado com esse e-mail.");
        }
    }
}
