package com.example.application.controller;

import java.util.Arrays;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.application.model.Musica;
import com.example.application.model.Pessoa;
import com.example.application.service.MasterService;
import com.example.application.service.MusicaService;
import com.example.application.service.PessoaService;
@Controller
public class ControllerMaster {
		
	 private MasterService masterService;
	 
	
	public ControllerMaster(MasterService masterService) {
		super();
		this.masterService = masterService;
	}

	@GetMapping("/")
	public String retornaIndex() {
		return "index";
	}
	
	@GetMapping("/cadastro")
	public ModelAndView retornaCadastro(Pessoa pessoa, Musica musica) {
		
		ModelAndView mv = new ModelAndView("cadastro");
		
		mv.addObject("pessoas", pessoa);
		
		List<String> OpcaoBanda = Arrays.asList("Selecione..", "Sim" ,"Não");
		mv.addObject("opcaoBanda", OpcaoBanda );
		
		List<String> OpcaoAcompanhante = Arrays.asList("Selecione..", "Sim" ,"Não");
		mv.addObject("opcaoAcompanhante", OpcaoAcompanhante );
		
		mv.addObject("musicas", musica);	
		return mv;
	}
	
	@PostMapping("/cadastro")
	public ModelAndView cadastroSucesso(@Valid Pessoa pessoa, Musica musica, BindingResult result,
			RedirectAttributes attributes) {
		if (result.hasErrors()) {
			return retornaCadastro(pessoa, musica);
		}
		try {
			
			masterService.salvar(pessoa, musica);
			
		} catch(Exception e) {
			
		}
		
		ModelAndView mv = new ModelAndView("cadastrado_com_sucesso");
		mv.addObject("musicas", musica);
		mv.addObject("pessoas", pessoa);
		return mv;
		
	}
	
}
