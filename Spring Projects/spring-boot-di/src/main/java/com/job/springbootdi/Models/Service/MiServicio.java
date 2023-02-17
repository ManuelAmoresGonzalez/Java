package com.job.springbootdi.Models.Service;

import org.springframework.stereotype.Component;

//@Component("miServicioSimple")
public class MiServicio implements IServicio{

    @Override
    public String operacion() {
        return "Ejecutando algún proceso Simple";
    }
}
