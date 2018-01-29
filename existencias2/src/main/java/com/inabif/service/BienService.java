package com.inabif.service;

import java.util.List;

import org.springframework.web.servlet.ModelAndView;

import com.inabif.entity.Bien;
import com.inabif.model.BienModel;

public interface BienService {
		
	public ModelAndView showBienes();
	
	public abstract List<BienModel> findBienesByYear(int ano);

}
