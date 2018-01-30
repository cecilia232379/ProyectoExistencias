package com.inabif.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.inabif.component.BienConverter;
import com.inabif.entity.Bien;
import com.inabif.model.BienModel;
import com.inabif.repository.BienRepository;
import com.inabif.service.BienService;


@Service("bienServiceImpl")
public class BienServiceImpl implements BienService{

	@Autowired
	@Qualifier("bienRepository")	
	private BienRepository bienRepository;
	
	@Autowired
	@Qualifier("bienConverter")
	private BienConverter bienConverter;
	
	@Override
	public BienModel addBien(BienModel bienModel) {
		Bien bien= bienRepository.save(bienConverter.convertBienModel2Bien(bienModel));
		
		return bienConverter.convertBien2BienModel(bien);
	}

	@Override
	public List<BienModel> listAllBienes() {
		List<Bien> bienes = bienRepository.findAll();
		List<BienModel> bienModel= new ArrayList<BienModel>();
		for(Bien bien : bienes) {
			bienModel.add(bienConverter.convertBien2BienModel(bien));
		}
	
		return bienModel;
	}

	@Override
	public List<BienModel> findBienesByYear(int ano) {
		
		List<Bien> bienes = bienRepository.findBienesByYear(ano);
		List<BienModel> bienModel= new ArrayList<BienModel>();
		for(Bien bien : bienes) {
			bienModel.add(bienConverter.convertBien2BienModel(bien));
		}
		
	
		return bienModel;
	}

	@Override
	public BienModel findBienesByIdModel(int id) {
		Bien bien = bienRepository.findByIdBien(id);
		//FeriadoModel feriadosModel = new FeriadoModel();
		BienModel bienModel = bienConverter. convertBien2BienModel(bien);
		return bienModel;
	}

	@Override
	public void removeBien(int id) {
		bienRepository.delete((bienRepository.findByIdBien(id)));
		
	}
	
}
