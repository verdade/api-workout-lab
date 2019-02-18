package br.com.softplan.api.notations.validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.web.multipart.MultipartFile;

import br.com.softplan.api.notations.NotEmptyFile;


public class NotEmptyFileValidator implements ConstraintValidator<NotEmptyFile, MultipartFile> {

	@Override
	public void initialize(NotEmptyFile notEmptyFile) {
		
	}

	@Override
	public boolean isValid(MultipartFile file, ConstraintValidatorContext constraintValidatorContext) {
		return file != null && !file.isEmpty();
	}

}