package com.Globant.springboot.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

	@GetMapping({"/index","/","/home"})
	/*public String index() {
		return "index";
	}*/

	//Formas para enviar por parametros
	/*public String index(Model model) {
		model.addAttribute("titulo", "Hola Spring Framework");
		return "index";
	}*/
//Enviar parametros pero a vista elegida
	public ModelAndView index (ModelAndView mv){
		String prueba = "Hol";
		if(prueba.equals("Hola")){
			mv.addObject("titulo", "Hola Spring Framework de html prueba");
			mv.setViewName("prueba");
			return mv;
		}
		mv.addObject("titulo", "Hola Spring Framework de index");
		mv.setViewName("index");
		return mv;
	}
}
