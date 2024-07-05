package com.iftm.brunov.exercicio_04.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.iftm.brunov.exercicio_04.model.Mensagem;
import com.iftm.brunov.exercicio_04.service.MensagemService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/mensagem")
public class MensagemController {

    @Autowired
    private MensagemService service;

    @PostMapping
    public ResponseEntity<Mensagem> enviaMensagem(@RequestBody Mensagem mensagem) {
        Mensagem mensagen1 = service.enviarMensagem(mensagem);

        return ResponseEntity.status(HttpStatus.CREATED).body(mensagen1);
    }

    @GetMapping
    public ResponseEntity<List<Mensagem>> buscarMensagens() {

        List<Mensagem> mensagens = service.buscaMensagens();

        return ResponseEntity.ok().body(mensagens);
    }

}
