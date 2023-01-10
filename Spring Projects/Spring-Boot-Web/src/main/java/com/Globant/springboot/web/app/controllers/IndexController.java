package com.Globant.springboot.web.app.controllers;

import com.Globant.springboot.web.app.Models.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/app")
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
		String prueba = "Hola";
		if(prueba.equals("Hola")){
			mv.addObject("titulo", "Hola Spring Framework de html prueba");
			mv.setViewName("prueba");
			return mv;
		}
		mv.addObject("titulo", "Hola Spring Framework de index");
		mv.setViewName("index");
		return mv;
	}


	@RequestMapping("/perfil")
	public String perfil(Model model){
		Usuario usuario = new Usuario();
		usuario.setNombre("Manuel");
		usuario.setApellido("Amores");
		usuario.setEmail("manuel@gmail.com");
		model.addAttribute("usuario", usuario);
		model.addAttribute("titulo", "Perfil del usuario: ".concat(usuario.getNombre()));
		return "perfil";
	}

	@RequestMapping("/listar")
	public String listar(Model model){
		List<Usuario> usuarios = new ArrayList<>();
		model.addAttribute("titulo", "Listado de usuarios");
		model.addAttribute("usuarios", usuarios);
		return "listar";
	}
}
