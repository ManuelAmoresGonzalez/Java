package com.job.springbootdi;

import com.job.springbootdi.Models.Service.IServicio;
import com.job.springbootdi.Models.Service.MiServicio;
import com.job.springbootdi.Models.Service.MiServicioComplejo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfig {

    @Bean("miServicioSimple")

    public IServicio registrarMiServicio(){
        return new MiServicio();
    }

    @Bean("miServicioComplejo")
    @Primary
    public IServicio registrarMiServicioComplejo(){
        return new MiServicioComplejo();
    }
}
