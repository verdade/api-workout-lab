package br.com.softplan.api.notations.validators;


import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.web.multipart.MultipartFile;

import br.com.softplan.api.notations.PdfFile;
import static br.com.softplan.api.utils.FileUtils.isPDF;

public class PdfFileValidator implements ConstraintValidator<PdfFile, MultipartFile> {

	@Override
	public void initialize(PdfFile pdfFile) {

	}

	@Override
	public boolean isValid(MultipartFile possiblePdfFile, ConstraintValidatorContext constraintValidatorContext) {
		try {
			return (possiblePdfFile == null || possiblePdfFile.isEmpty()) || isPDF(possiblePdfFile);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
}