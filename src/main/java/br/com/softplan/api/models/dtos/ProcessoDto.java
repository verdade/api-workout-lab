package br.com.softplan.api.models.dtos;

import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

public class ProcessoDto {
	
	private Long id;
	
	@NotEmpty(message="nome nao pode estar vazio")
	@Length(min = 5, max = 200, message= "nome deve ter mais de 200 caracteres")
	private String nome;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

}
