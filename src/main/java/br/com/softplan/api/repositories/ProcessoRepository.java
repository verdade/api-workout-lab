package br.com.softplan.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import br.com.softplan.api.models.Processo;

public interface ProcessoRepository extends JpaRepository<Processo, Long> {
	
	Processo findByNome(String nome);
}
