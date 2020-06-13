package br.com.rationalculture.core.modelmapper;

import java.util.Comparator;

import br.com.rationalculture.api.model.PontuacaoModel;

public class CustomComparator implements Comparator<PontuacaoModel> {

	@Override
	public int compare(PontuacaoModel o1, PontuacaoModel o2) {
		return o2.getMedia().compareTo(o1.getMedia());
	}

}
