package com.job.springbootdi.Models.Service;

import org.springframework.stereotype.Component;

@Component
public class MiServicio implements IServicio{

    @Override
    public String operacion() {
        return "Ejecutando algún proceso importante desde MiServicio";
    }
}
