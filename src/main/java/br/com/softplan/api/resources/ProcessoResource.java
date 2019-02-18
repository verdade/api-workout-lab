package br.com.softplan.api.resources;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.softplan.api.models.dtos.ProcessoDto;
import br.com.softplan.api.models.dtos.ResponseDto;
import br.com.softplan.api.services.ProcessoService;

@RestController
@RequestMapping("/api")
public class ProcessoResource {
	
	@Autowired
	private ProcessoService service;
	
	@GetMapping
	public String teste() {
		return "servidor rodanto";
	}
	
	@GetMapping("/teste2")
	public String teste2() {
		return "servidor rodanto";
	}
	
	@PostMapping
	public ResponseEntity<ResponseDto<ProcessoDto>> cadastrar(@Valid @RequestBody ProcessoDto dto, BindingResult result) {
		
		ResponseDto<ProcessoDto> response = new ResponseDto<ProcessoDto>();
		
		if (result.hasErrors()) {
			result.getAllErrors().forEach(error -> response.getErrors().add(error.getDefaultMessage()));
			return ResponseEntity.badRequest().body(response);
		}
		
		response.setData(service.cadastrar(dto));
		return ResponseEntity.ok(response);
		
	}

	

}
