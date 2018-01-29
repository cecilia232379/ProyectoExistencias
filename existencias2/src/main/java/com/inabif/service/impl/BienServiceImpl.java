package com.inabif.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.inabif.component.BienConverter;
import com.inabif.constant.ViewConstant;
import com.inabif.entity.Bien;
import com.inabif.model.BienModel;
import com.inabif.repository.BienRepository;
import com.inabif.repository.RegistroRepository;
import com.inabif.service.BienService;


@Service("bienServiceImpl")
public class BienServiceImpl implements BienService{

	@Autowired
	@Qualifier("bienRepository")
	private BienRepository bienRepository;
	
	@Autowired
	@Qualifier("bienConverter")
	private BienConverter bienConverter;
	
	@GetMapping("/listar")
	public ModelAndView showBienes() {
		ModelAndView mav = new ModelAndView(ViewConstant.BIENES);
		//mav.addObject("feriados",feriadoService.findFeriadosByYear(2017));
		//LOG.info("METHOD: showFeriados() --PARMS:" +feriadoService.findFeriadosByYear(2017));
		//mav.addObject("sistema",ViewConstant.SISTEMA_TITULO);
	
		//LOG.info("sesion"+sesion.getAttribute("usuarioSession"));
		return mav;
		
	}
	
	/*@Override bien
	public List<BienModel> findBienesByYear(int ano) {
		
		List<Bien> bienes = bienRepository.findBienesByYear(ano);
		List<BienModel> bienesModel= new ArrayList<BienModel>();
		for(Bien bien : bienes) {
			bienesModel.add(bienConverter.convertBien2BienModel(bien));
		}
		System.out.println("ano:"+ano);
	
		return bienesModel;
	}*/

	@Override
	public List<BienModel> findBienesByYear(int ano) {	
		
		List<Bien> bienes = bienRepository.findBienesByYear(ano);
		System.out.println("anopp:"+ano);
		System.out.print("tamanio:"+bienes.size());
		List<BienModel> bienesModel= new ArrayList<BienModel>();
		for(Bien bien : bienes) {
			bienesModel.add(bienConverter.convertBien2BienModel(bien));
		}		
	
		return bienesModel;
	}

}
