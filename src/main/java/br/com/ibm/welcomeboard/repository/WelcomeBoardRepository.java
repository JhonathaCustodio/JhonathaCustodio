package br.com.ibm.welcomeboard.repository;

import br.com.ibm.welcomeboard.entity.WelcomeBoardEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WelcomeBoardRepository extends JpaRepository<WelcomeBoardEntity, Long> {
}