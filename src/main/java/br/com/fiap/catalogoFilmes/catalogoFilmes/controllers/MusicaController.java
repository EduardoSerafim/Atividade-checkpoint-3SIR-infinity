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

import br.com.fiap.catalogoFilmes.catalogoFilmes.dto.MusicaDto;
import br.com.fiap.catalogoFilmes.catalogoFilmes.model.Musica;
import br.com.fiap.catalogoFilmes.catalogoFilmes.repositories.MusicaRepository;

@Controller
public class MusicaController {
	
	@Autowired
	private MusicaRepository musicaRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	/*@GetMapping("/index")
	public ModelAndView index() {
		ModelAndView model = new ModelAndView("index");
		return model;
	}*/
	
	
	@GetMapping("/musica")
	public ModelAndView exibirMusica(){
		ModelAndView model = new ModelAndView("musica/index");
		List<Musica> exibeMusica = musicaRepository.findAll();
		
		model.addObject("exibeMusica", exibeMusica);
		
		return model;
		
	}
	
	
	
	@GetMapping("/cadastroMusica")
	public ModelAndView cadastro(MusicaDto model) {
		return new ModelAndView("musica/cadastroMusica");
	}
	
	@PostMapping("/cadastrarMusica")
	public ModelAndView cadastrarMusica(@Valid MusicaDto model, BindingResult bindingResult) {
		
		if(bindingResult.hasErrors()) {
			ModelAndView modelView = new ModelAndView("musica/cadastroMusica");
			return modelView;
		}
		
		Musica musica = modelMapper.map(model, Musica.class);
		musicaRepository.save(musica);
		
		return new ModelAndView("redirect:/musica");
	}
	
}
