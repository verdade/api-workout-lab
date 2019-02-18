package br.com.softplan.api.notations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import br.com.softplan.api.notations.validators.PdfFileValidator;

@Target({ ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = PdfFileValidator.class)
public @interface PdfFile {

	String message() default "{br.gov.rj.detran.gaideweb2.requerimento.validation.PdfFile.message}";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};
	
}