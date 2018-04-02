package br.com.receitamedica.model;

import lombok.Data;

@Data
public class Medico {

  private String nome;

  private String numeroCRM;

  private Especialidade especialidade;

}
