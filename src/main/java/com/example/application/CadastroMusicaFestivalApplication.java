package com.example.application;

import javax.persistence.Entity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.application.controller.ControllerMaster;
import com.example.application.repository.MusicaRepository;
import com.example.application.repository.PessoaRepository;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class }) 
//@ComponentScan("com.example.application.service.MasterService")
//@EnableJpaRepositories("com.example.application.repository")
@EntityScan("com.example.application.model")
@ComponentScan("com.example.application.model")
public class CadastroMusicaFestivalApplication {

	public static void main(String[] args) {
		SpringApplication.run(CadastroMusicaFestivalApplication.class, args);
	}

}
