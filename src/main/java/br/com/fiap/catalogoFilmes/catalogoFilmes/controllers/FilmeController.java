package br.com.fiap.catalogoFilmes.catalogoFilmes.controllers;

import java.util.List;

import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.fiap.catalogoFilmes.catalogoFilmes.dto.FilmeDto;
import br.com.fiap.catalogoFilmes.catalogoFilmes.model.Filme;
import br.com.fiap.catalogoFilmes.catalogoFilmes.repositories.FilmeRepository;

@Controller
public class FilmeController {
	@Autowired
	private FilmeRepository filmeRepository;

	@Autowired
	private ModelMapper modelMapper;
	
	@GetMapping("/filmes")
	public ModelAndView exibirFilme() {
		ModelAndView model = new ModelAndView("filmes/index");

		List<Filme> exibeFilme = filmeRepository.findAll();
		model.addObject("exibeFilme", exibeFilme);

		return model;
	}
	
	@GetMapping("/index")
	public ModelAndView index() {
		ModelAndView model = new ModelAndView("index");
		return model;
	}



	@GetMapping("/cadastro")
	public ModelAndView cadastro(FilmeDto model) {
		return new ModelAndView("filmes/cadastro");
	}

	@PostMapping("/cadastrarFilme")
	public ModelAndView cadastrarFilme(@Valid FilmeDto model, BindingResult bindingResult) {
		
		if (bindingResult.hasErrors()) {
			ModelAndView modelView = new ModelAndView("filmes/cadastro");
			return modelView;
		}
		Filme filme = modelMapper.map(model, Filme.class);
		filmeRepository.save(filme);
		return new ModelAndView("redirect:/filmes");

	}

}
