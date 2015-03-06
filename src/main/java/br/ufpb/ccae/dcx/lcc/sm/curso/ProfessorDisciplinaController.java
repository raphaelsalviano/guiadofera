package br.ufpb.ccae.dcx.lcc.sm.curso;
import org.springframework.roo.addon.web.mvc.controller.json.RooWebJson;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;

@RooWebJson(jsonObject = ProfessorDisciplina.class)
@Controller
@RequestMapping("/professordisciplina")
@RooWebScaffold(path = "professordisciplina", formBackingObject = ProfessorDisciplina.class)
public class ProfessorDisciplinaController {
}
