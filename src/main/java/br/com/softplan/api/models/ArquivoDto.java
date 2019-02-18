package br.com.softplan.api.models;

import java.io.Serializable;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.web.multipart.MultipartFile;

import br.com.softplan.api.notations.FileSize;
import br.com.softplan.api.notations.NotEmptyFile;
import br.com.softplan.api.notations.PdfFile;

public class ArquivoDto implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	private static final int FILE_SIZE_2MB = 1024 * 1024 * 2;

	
	@NotBlank
	@Size(min = 1, max = 20)
	private String identidade;
	
	@NotBlank
	@Size(min = 1, max = 255)
	private String endereco;
	
	@NotBlank
	@Email
	@Size(min = 1, max = 100)
	private String email;
	
	@NotBlank
	@Size(min = 1, max = 20)
	private String telefone;
	
	@NotBlank
	@Size(min = 1, max = 4000)
	private String justificativa;
	
	@NotEmptyFile
	@FileSize(max = FILE_SIZE_2MB)
	@PdfFile
	private MultipartFile pathDocumentoIdentificacao;

	public String getIdentidade() {
		return identidade;
	}

	public void setIdentidade(String identidade) {
		this.identidade = identidade;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getJustificativa() {
		return justificativa;
	}

	public void setJustificativa(String justificativa) {
		this.justificativa = justificativa;
	}

	public MultipartFile getPathDocumentoIdentificacao() {
		return pathDocumentoIdentificacao;
	}

	public void setPathDocumentoIdentificacao(MultipartFile pathDocumentoIdentificacao) {
		this.pathDocumentoIdentificacao = pathDocumentoIdentificacao;
	}

	public static int getFileSize2mb() {
		return FILE_SIZE_2MB;
	}
	
	
	

}
