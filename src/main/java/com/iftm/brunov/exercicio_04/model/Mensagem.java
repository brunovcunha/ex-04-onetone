package com.iftm.brunov.exercicio_04.model;

import java.util.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "mensagens")
public class Mensagem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "assunto")
    private String assunto;

    @Column(name = "data-envio")
    private Date dataEnvio;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "mensagem_corpo_id")
    private MensagemCorpo mensagemCorpo;
}
