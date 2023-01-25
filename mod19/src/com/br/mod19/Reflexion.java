package com.br.mod19;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class Reflexion {
	public void printAnotation(Class<?> classObject) {

		for(Field field: classObject.getDeclaredFields()) {
			if(field.isAnnotationPresent(TableName.class)) {
				System.out.println(field.getAnnotation(TableName.class).value());
			}
		}		
	}	
}
