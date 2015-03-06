package br.ufpb.ccae.dcx.lcc.sm.curso;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.roo.addon.web.mvc.controller.json.RooWebJson;

@RequestMapping("/disciplinas")
@Controller
@RooWebScaffold(path = "disciplinas", formBackingObject = Disciplina.class)
@RooWebJson(jsonObject = Disciplina.class)
public class DisciplinaController {
}
