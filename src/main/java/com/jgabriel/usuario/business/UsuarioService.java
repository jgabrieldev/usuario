package com.jgabriel.usuario.business;

import com.jgabriel.usuario.business.converter.UsuarioConverter;
import com.jgabriel.usuario.business.dto.UsuarioDTO;
import com.jgabriel.usuario.infrastructure.entity.Usuario;
import com.jgabriel.usuario.infrastructure.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor

public class UsuarioService {

    private final UsuarioRepository usuarioRepository;
    private final UsuarioConverter usuarioConverter;

    public UsuarioDTO salvaUsuario(UsuarioDTO usuarioDTO){
        Usuario usuario = usuarioConverter.paraUsuario(usuarioDTO);
        return usuarioConverter.paraUsuarioDTO(usuarioRepository.save(usuario));
    }
}
