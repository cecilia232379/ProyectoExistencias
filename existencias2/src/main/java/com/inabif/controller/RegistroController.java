package com.inabif.controller;

import org.apache.commons.logging.LogFactory;
import javax.servlet.http.HttpServletRequest;


import org.apache.commons.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.inabif.constant.ViewConstant;
import com.inabif.model.RegistroModel;
import com.inabif.service.RegistroService;


@Controller
@RequestMapping("/registro")
public class RegistroController {

	private static final Log LOG = LogFactory.getLog(RegistroController.class);
	@Autowired
	@Qualifier("registroServiceImpl")
	private RegistroService registroService;
	
	protected HttpServletRequest request;
	
	public void execute() {
		
	}
	
	
	@GetMapping("/listar")
	public ModelAndView showRegistros() {
		ModelAndView mav = new ModelAndView(ViewConstant.REGISTROS);
		//mav.addObject("feriados",feriadoService.findFeriadosByYear(2017));
		LOG.info("METHOD: showRegistros() --PARMS:" +registroService.findRegistrosByYear(2017,139));
		//mav.addObject("sistema",ViewConstant.SISTEMA_TITULO);
	
		//LOG.info("sesion"+sesion.getAttribute("usuarioSession"));
		return mav;
		
	}
	
	@GetMapping(value = "/listar/{ano}")
	public String showBienList(Model model, @PathVariable("ano") int ano) {
	    model.addAttribute("registros", registroService.findRegistrosByYear(2017,139));
	    return "registrotable :: resultsList";
	}
}
