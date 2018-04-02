package br.com.receitamedica.controller;

import br.com.receitamedica.model.Paciente;
import br.com.receitamedica.service.CrudPaciente;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/paciente")
@AllArgsConstructor
public class PacienteController {

  private CrudPaciente crudPaciente;

  @RequestMapping(method = RequestMethod.POST)
  public String cadastra(final Paciente paciente){

    crudPaciente.criar(paciente);
    return "";
  }

  @RequestMapping(method = RequestMethod.GET, value = "/{pacienteId}")
  public String consultar(final String pacienteId){

    crudPaciente.consultar(pacienteId);
    return "";
  }

  @RequestMapping(method = RequestMethod.DELETE, value = "/{pacienteId}")
  public String deletar(final String pacienteId){

    crudPaciente.deletar(pacienteId);
    return "";
  }

  @RequestMapping(method = RequestMethod.PUT)
  public String atualizar(final Paciente paciente){

    crudPaciente.atualizar(paciente);
    return "";
  }
}
