package controller;

import interfaceService.IPersonService;

import model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


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
}
