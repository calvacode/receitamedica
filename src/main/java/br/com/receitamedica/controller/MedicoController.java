package br.com.receitamedica.controller;

import br.com.receitamedica.model.Medico;
import br.com.receitamedica.service.CrudMedico;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/medico")
@AllArgsConstructor
public class MedicoController {

  private CrudMedico crudMedico;

  @RequestMapping(method = RequestMethod.POST)
  public String cadastra(final Medico medico){

    crudMedico.criar(medico);
    return "";
  }

  @RequestMapping(method = RequestMethod.GET, value = "/{medicoId}")
  public String consultar(final String medicoId){

    crudMedico.consultar(medicoId);
    return "";
  }

  @RequestMapping(method = RequestMethod.DELETE, value = "/{medicoId}")
  public String deletar(final String medicoId){

    crudMedico.deletar(medicoId);
    return "";
  }

  @RequestMapping(method = RequestMethod.PUT)
  public String atualizar(final Medico medico){

    crudMedico.atualizar(medico);
    return "";
  }
}
