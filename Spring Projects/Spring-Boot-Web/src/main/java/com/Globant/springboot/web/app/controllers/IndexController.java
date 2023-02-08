package com.Globant.springboot.web.app.controllers;

import com.Globant.springboot.web.app.Models.Usuario;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/app")
public class IndexController {

@Value("${texto.indexController.index.titulo}")
private String textoIndex;

@Value("${texto.indexController.perfil.titulo}")
private String textoPerfil;

@Value("${texto.indexController.listar.titulo}")
private String textoListar;
//Enviar parametros pero a vista elegida
	@RequestMapping("/index")
	public ModelAndView index (ModelAndView mv){
		String prueba = "Hol";
		if(prueba.equals("Hola")){
			mv.addObject("titulo", "Hola Spring Framework de html prueba");
			mv.setViewName("prueba");
			return mv;
		}
		mv.addObject("titulo", textoIndex);
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
		model.addAttribute("titulo", textoPerfil.concat(usuario.getNombre()));
		return "perfil";
	}

	@RequestMapping("/listar")
	public String listar(Model model){
		/*List<Usuario> usuarios = Arrays.asList(
				new Usuario("Mario","Amores","manolo@gmail.com"),
				new Usuario("Carolina","Angelina","marinila@gmail.com"),
				new Usuario("Manuel","Amores","manuel@gmail.com"),
				new Usuario("Carlitos","Carlino","carl@gmail.com")
		);*/
		model.addAttribute("titulo", textoListar);
		//model.addAttribute("usuarios", usuarios);
		return "listar";
	}

	@ModelAttribute("usuarios")
	public List<Usuario> poblarUsuarios(){

		List<Usuario> usuarios = Arrays.asList(
				new Usuario("Mario","Amores","manolo@gmail.com"),
				new Usuario("Carolina","Angelina","marinila@gmail.com"),
				new Usuario("Manuel","Amores","manuel@gmail.com"),
				new Usuario("Carlitos","Carlino","carl@gmail.com")
		);
		return usuarios;
	}
}
