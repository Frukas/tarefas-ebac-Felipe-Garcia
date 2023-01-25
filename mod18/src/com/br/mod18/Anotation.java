package com.br.mod18;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class Anotation {
	
	@Documented
	@Retention(RetentionPolicy.RUNTIME)
	@Target(ElementType.LOCAL_VARIABLE)
	public @interface TableName{
		String value();
	}

}
