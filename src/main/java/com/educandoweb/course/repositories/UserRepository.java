package com.educandoweb.course.repositories;

import com.educandoweb.course.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Usuario, Long> {

}
