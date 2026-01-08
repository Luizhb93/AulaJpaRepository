package br.com.luiz.aulajpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.luiz.aulajpa.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
