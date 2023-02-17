package com.job.springbootdi.Models.Service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Component("miServicioComplejo")
//@Primary
public class MiServicioComplejo implements IServicio{

    @Override
    public String operacion() {
        return "Ejecutando algún proceso Complejo";
    }
}
