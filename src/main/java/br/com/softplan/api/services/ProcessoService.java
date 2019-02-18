package br.com.softplan.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.softplan.api.models.Processo;
import br.com.softplan.api.models.dtos.ProcessoDto;
import br.com.softplan.api.repositories.ProcessoRepository;

@Service
public class ProcessoService {
	
	
	@Autowired
	private ProcessoRepository repository;

	public ProcessoDto cadastrar(ProcessoDto dto) {
		
		Processo processo = new Processo();
		processo.setNome(dto.getNome());
		
		dto.setId(repository.save(processo).getId());
		
		return dto;
	}
	
}
