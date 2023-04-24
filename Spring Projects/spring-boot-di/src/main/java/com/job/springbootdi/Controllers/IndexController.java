package com.job.springbootdi.Controllers;

import com.job.springbootdi.Models.Service.IServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @Autowired
    private IServicio servicio;
    @GetMapping({"/","","/index"})
    public String index(Model model){
        model.addAttribute("objeto", servicio.operacion());
        return "index";
    }

    //Using setMethod to implement the service
    /*@Autowired
    public void setServicio(IServicio servicio) {
        this.servicio = servicio;
    }*/

}
