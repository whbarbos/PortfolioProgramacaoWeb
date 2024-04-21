package com.br.portfolio.programacao_web.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public ResourceNotFoundException(Object id) {
		super("Usuário com a id " + id + " não encontrado.");
	}
	
}
