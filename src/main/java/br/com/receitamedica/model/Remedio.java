package br.com.receitamedica.model;

import lombok.Data;

@Data
public class Remedio {

  private String nome;

  private int periodicidade;

  private double dose;

  private int dias;

}
