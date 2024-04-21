package com.br.portfolio.programacao_web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.portfolio.programacao_web.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
