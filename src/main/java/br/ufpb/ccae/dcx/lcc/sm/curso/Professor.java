package br.ufpb.ccae.dcx.lcc.sm.curso;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.json.RooJson;
import org.springframework.roo.addon.plural.RooPlural;
import org.springframework.roo.addon.tostring.RooToString;


@RooJavaBean
@RooToString
@RooJpaActiveRecord
@RooJson
@RooPlural(value="Professores")
public class Professor {

	@NotNull
	private Integer status;
	
    @NotNull
    @Size(min = 2, max = 50)
    private String nome;
    
    @NotNull
	private Integer cargo;
	
    @OneToMany(mappedBy = "professor", cascade = CascadeType.ALL)
    private List<ProfessorDisciplina> professorDisciplina;
    
}