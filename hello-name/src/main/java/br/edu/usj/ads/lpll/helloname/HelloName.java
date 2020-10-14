package br.edu.usj.ads.lpll.helloname;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HelloName {
    

@PostMapping(value="helloName")
public ModelAndView postHelloName(@RequestParam String nome) {
    ModelAndView modelAndView = new ModelAndView("hello-name");


    modelAndView.addObject("mensagem", nome);

    
    return modelAndView;
}



}
