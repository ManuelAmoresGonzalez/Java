package com.globant.CrudSpringBoot.controller;

import com.globant.CrudSpringBoot.interfaceService.IPersonService;

import com.globant.CrudSpringBoot.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;


@Controller
@RequestMapping
public class ControllerClass {
    @Autowired
    private IPersonService service;

    @GetMapping("/listar")
    public String listar(Model model){
        List<Person> persons = service.listar();
        model.addAttribute("persons",persons);
        return "index";
    }

    @GetMapping("/new")
    public String add(Model model){
        model.addAttribute("person",new Person());
        return "form";
    }

    @PostMapping("/save")
    public String save(Person person, Model model){
        service.save(person);
        return "redirect:/listar";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable int id, Model model){
        Optional<Person> person = service.listarId(id);
        model.addAttribute("person",person);
        return "form";
    }

}
