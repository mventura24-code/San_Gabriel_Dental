package com.umg.sgau.service;

import org.springframework.stereotype.Service;

import com.umg.sgau.repository.UsuarioRepository;
import com.umg.sgau.usuario.UsuarioEntity;

@Service
public class UsuarioService {

	private UsuarioRepository usuarioRepository;
	
    public void setUsuarioRepository(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }
    
	/*private final UsuarioRepository usuarioRepository;

	public UsuarioService(UsuarioRepository usuarioRepository) {
		this.usuarioRepository = usuarioRepository;
	}*/
	
	public void crearUsuario(UsuarioEntity usuario) {
		usuarioRepository.save(usuario);
	}
}
