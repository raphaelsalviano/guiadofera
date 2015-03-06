package br.ufpb.ccae.dcx.lcc.sm.curso;

import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.json.RooJson;
import org.springframework.roo.addon.plural.RooPlural;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
@RooJson
@RooPlural(value="ProfessorDisciplina")
public class ProfessorDisciplina {

	@NotNull
	private Integer status;
	
	@NotNull
	@Min(2010)
    private Integer periodo;
    
	@NotNull
	@Min(1)
	@Max(2)
    private Integer semestre;
	
    @ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "idprofessor")
	private Professor professor;
	
    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "iddisciplina")
	private Disciplina disciplina;
    	
	
}
