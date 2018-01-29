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
import com.inabif.model.BienModel;
import com.inabif.service.BienService;


@Controller
@RequestMapping("/bien")
public class BienController {

	private static final Log LOG = LogFactory.getLog(BienController.class);
	@Autowired
	@Qualifier("bienServiceImpl")
	private BienService bienService;
	
	protected HttpServletRequest request;
	
	public void execute() {
		
	}
	
	
	@GetMapping("/listar")
	public ModelAndView showBienes() {
		ModelAndView mav = new ModelAndView(ViewConstant.BIENES);
		//mav.addObject("feriados",feriadoService.findFeriadosByYear(2017));
		
		LOG.info("METHOD23: showBienes() --PARMS:" +bienService.findBienesByYear(2016));
		//mav.addObject("sistema",ViewConstant.SISTEMA_TITULO);
	
		//LOG.info("sesion"+sesion.getAttribute("usuarioSession"));
		return mav;
		
	}
	
	@GetMapping(value = "/listar/{ano}")
	public String showBienList(Model model, @PathVariable("ano") int ano) {
	    model.addAttribute("bienes", bienService.findBienesByYear(ano));
	    return "bientable :: resultsList";
	}
}
