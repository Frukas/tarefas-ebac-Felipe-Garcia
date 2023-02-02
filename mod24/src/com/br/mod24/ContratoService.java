package com.br.mod24;

public class ContratoService implements IContratoService {

	private IContratoDao contratoDao;
	
	public ContratoService(IContratoDao dao) {
		this.contratoDao = dao;
	}

	@Override
	public String salvar() {
		this.contratoDao.salvar();
		return "Sucesso";
	}

	@Override
	public String buscar(int number) {		
		this.contratoDao.buscar(number);
		return "Registro encontrado";
	}

	@Override
	public String excluir(int number) {
		this.contratoDao.excluir(number);
		return "Registro excluido";
	}

	@Override
	public String atualizar(int number) {
		this.contratoDao.atualizar(number);
		return "Registro atualizado";
	}

}
