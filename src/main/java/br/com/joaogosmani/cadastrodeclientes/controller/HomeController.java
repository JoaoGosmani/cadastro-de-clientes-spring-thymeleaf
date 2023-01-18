package br.com.joaogosmani.cadastrodeclientes.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {
    
    @GetMapping
    public String home(ModelMap model) {
        model.addAttribute("boasVindas", "Bem vindo ao curso de Spring com Thymeleaf");

        List<String> aulas = new ArrayList<>();
        aulas.add("Aula 01 - Introdução");
        aulas.add("Aula 02 - Template engines");
        aulas.add("Aula 03 - Arquivos estáticos");
        aulas.add("Aula 04 - Arquivos informações");

        model.addAttribute("aulas", aulas);

        return "home";
    }

}
