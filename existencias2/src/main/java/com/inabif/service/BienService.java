package com.inabif.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.inabif.entity.Bien;
import com.inabif.model.BienModel;

public interface BienService {
		
	public abstract List<BienModel> findBienesByYear(int ano);

	BienModel addBien(BienModel bienModel);

	List<BienModel> listAllBienes();

	BienModel findBienesByIdModel(int id);

	void removeBien(int id);

}
