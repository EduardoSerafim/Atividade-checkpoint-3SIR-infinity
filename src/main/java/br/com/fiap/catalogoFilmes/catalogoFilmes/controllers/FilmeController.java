package br.com.fiap.catalogoFilmes.catalogoFilmes.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.fiap.catalogoFilmes.catalogoFilmes.model.Filme;

@Controller
public class FilmeController {
	private List<Filme> filme;
	@GetMapping("/index")
	public ModelAndView index() {
		ModelAndView model = new ModelAndView("index");				
			filme = new ArrayList<Filme>();		
		return model;
	}
	@GetMapping("/exibirFilme")
	public ModelAndView exibirFilme() {
		ModelAndView model = new ModelAndView("filmes/index");
		model.addObject("exibeFilme", filme);
		return model;
	}
	@GetMapping("/cadastro")
	public ModelAndView cadastro() {
		ModelAndView model = new ModelAndView("filmes/cadastro");		
		return model;
	}
	@GetMapping("/cadastrarFilme")
	public ModelAndView cadastrarFilme(HttpServletRequest request, HttpServletResponse response) throws IOException {
		ModelAndView model = new ModelAndView("filmes/cadastro");
				 int id = Integer.parseInt(request.getParameter("id"));
			 String nome = (String) request.getParameter("nome");
			 String sinopse = (String) request.getParameter("sinopse");
			 String dataLancamento = (String) request.getParameter("data");
			 String autor = (String) request.getParameter("autor");
			 String genero = (String) request.getParameter("genero");
			 String atores = (String) request.getParameter("atores");	
			filme.add(new Filme(id, nome, sinopse,dataLancamento, autor,genero,atores));
			PrintWriter out = response.getWriter();
			response.setContentType("text/html");
			out.println("<script type=\"text/javascript\">");
			out.println("alert('Filme cadastrado com Sucesso!');");
			out.println("</script>");
			
		return model;
		
	}
	
	
}
