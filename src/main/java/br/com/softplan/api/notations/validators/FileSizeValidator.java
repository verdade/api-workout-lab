package br.com.softplan.api.notations.validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.web.multipart.MultipartFile;

import br.com.softplan.api.notations.FileSize;

public class FileSizeValidator implements ConstraintValidator<FileSize, MultipartFile> {

	private FileSize fileSize;

	@Override
	public void initialize(FileSize fileSize) {
		this.fileSize = fileSize;
	}

	@Override
	public boolean isValid(MultipartFile file, ConstraintValidatorContext constraintValidatorContext) {
		return file == null || file.getSize() <= fileSize.max();
	}

}