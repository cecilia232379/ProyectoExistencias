package com.inabif.service;

import java.util.List;

import org.springframework.web.servlet.ModelAndView;

import com.inabif.entity.Registro;
import com.inabif.model.RegistroModel;
import com.inabif.model.BienModel;

public interface RegistroService {
		
	public ModelAndView showRegistros();
	
	public abstract List<RegistroModel> findRegistrosByYear(int ano,int idDependencia);

}
