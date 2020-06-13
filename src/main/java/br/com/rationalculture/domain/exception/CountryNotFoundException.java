package br.com.rationalculture.domain.exception;

public class CountryNotFoundException extends EntityNotFoundException {

	private static final long serialVersionUID = 1L;

	public CountryNotFoundException(String mensagem) {
		super(mensagem);
	}
	
	
	public CountryNotFoundException(Long countryId) {
		this(String.format("Não existe um cadastro de país com código %d", countryId));
	}

}
