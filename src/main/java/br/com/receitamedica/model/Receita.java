package br.com.receitamedica.model;

import java.util.List;
import lombok.Data;

@Data
public class Receita {

  private List<Remedio> remedios;

}
