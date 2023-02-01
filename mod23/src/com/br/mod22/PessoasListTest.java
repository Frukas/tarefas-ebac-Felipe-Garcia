package com.br.mod22;

import java.util.List;

import org.junit.Test;

import org.junit.Assert;

public class PessoasListTest {
	
	@Test
	public void printPersonByGender() {
		PessoasList pl = new PessoasList();
		pl.addToList(new Pessoas("João", 'M'));
		pl.addToList(new Pessoas("João", 'N'));
		pl.addToList(new Pessoas("Maria", 'F'));
		List<Pessoas> resultList = pl.getListPersonByGender('F');
		
		resultList.forEach(p -> Assert.assertEquals('F', p.getGenero()) );	
		resultList.forEach(p -> Assert.assertNotEquals('M', p.getGenero()) );
		resultList.forEach(p -> Assert.assertNotEquals('N', p.getGenero()) );
	}
}
