package br.ufpb.ccae.dcx.lcc.sm.curso;
import org.springframework.roo.addon.web.mvc.controller.json.RooWebJson;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;

@RooWebJson(jsonObject = Professor.class)
@Controller
@RequestMapping("/professores")
@RooWebScaffold(path = "professores", formBackingObject = Professor.class)
public class ProfessorController {
}
