package com.iftm.brunov.exercicio_04.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iftm.brunov.exercicio_04.model.MensagemCorpo;

@Repository
public interface MensagemCorpoRepository extends JpaRepository<MensagemCorpo, Long> {

}
