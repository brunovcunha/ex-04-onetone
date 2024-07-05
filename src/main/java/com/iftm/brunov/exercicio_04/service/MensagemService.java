package com.iftm.brunov.exercicio_04.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iftm.brunov.exercicio_04.model.Mensagem;
import com.iftm.brunov.exercicio_04.model.MensagemCorpo;
import com.iftm.brunov.exercicio_04.repository.MensagemCorpoRepository;
import com.iftm.brunov.exercicio_04.repository.MensagemRepository;

import jakarta.transaction.Transactional;

@Service
public class MensagemService {

    @Autowired
    private MensagemRepository repository;

    @Autowired
    private MensagemCorpoRepository corpoRepository;

    @Transactional
    public Mensagem enviarMensagem(Mensagem mensagem) {

        MensagemCorpo mensagemCorpo = new MensagemCorpo();

        mensagemCorpo.setDescricao(mensagem.getMensagemCorpo().getDescricao());

        mensagem.setMensagemCorpo(mensagemCorpo);

        corpoRepository.save(mensagemCorpo);
        repository.save(mensagem);
        return mensagem;
    }

    @Transactional
    public List<Mensagem> buscaMensagens() {
        return repository.findAll();
    }

}
