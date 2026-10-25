package com.umg.sgau.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.umg.sgau.usuario.UsuarioEntity;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {

}
