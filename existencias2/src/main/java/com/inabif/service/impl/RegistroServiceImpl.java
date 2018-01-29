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
import com.inabif.component.RegistroConverter;
import com.inabif.constant.ViewConstant;
import com.inabif.entity.Bien;
import com.inabif.entity.Registro;
import com.inabif.model.BienModel;
import com.inabif.model.RegistroModel;
import com.inabif.repository.RegistroRepository;
import com.inabif.service.RegistroService;


@Service("registroServiceImpl")
public class RegistroServiceImpl implements RegistroService{

	@Autowired
	@Qualifier("registroRepository")
	private RegistroRepository registroRepository;
	
	/*@Autowired
	@Qualifier("registroConverter")
	private RegistroConverter registroConverter;*/
	
	
	@Autowired
	@Qualifier("bienConverter")
	private BienConverter registroConverter;
	
	
	/*@Autowired
	@Qualifier("registroService")
	private RegistroService registroService;*/
	
	@GetMapping("/listar")
	public ModelAndView showRegistros() {
		ModelAndView mav = new ModelAndView(ViewConstant.REGISTROS);		
		//LOG.info("METHOD: showFeriados() --PARMS:" +registroService.findRegistrosByYear(2017, 139));
		//mav.addObject("sistema",ViewConstant.SISTEMA_TITULO);
	
		//LOG.info("sesion"+sesion.getAttribute("usuarioSession"));
		return mav;		
	}
	
	/*@Override
	public List<BienModel> findRegistrosByYear(int ano, int idDependencia) {	
		
		List<Bien> registros = RegistroRepository.findRegistrosByYear(ano);
		
		System.out.print("tamanio:"+registros.size());
		List<BienModel> registrosModel= new ArrayList<BienModel>();
		for(Bien registro : registros) {
			registrosModel.add(registroConverter.convertBien2BienModel(registro));
		}
		System.out.println("ano:"+ano+" idDependencia:"+idDependencia);
	
		return registrosModel;
	}*/
	
	
	 public List<RegistroModel> findRegistrosByYear(int ano, int idDependencia) {
		
		
		List<Registro> registros = null;//RegistroRepository.findRegistrosByYear(ano);
		List<RegistroModel> registrosModel= new ArrayList<RegistroModel>();
		System.out.print("tamanio:"+registros.size());
		
		for(Registro registro : registros) {
		//	registrosModel.add(registroConverter.convertRegistro2RegistroModel(registro));
		}
		//System.out.println("ano:"+ano+" idDependencia:"+idDependencia);
	
		return registrosModel;
	}


	

}
