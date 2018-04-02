package br.com.receitamedica.model;

import java.time.LocalDateTime;
import lombok.Data;

@Data
public class Consulta {

  private Paciente paciente;

  private Medico medico;

  private LocalDateTime data;

  private Receita receita;

}
