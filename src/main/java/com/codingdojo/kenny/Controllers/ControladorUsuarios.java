package com.codingdojo.kenny.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")
public class ControladorUsuarios {
	
	@RequestMapping(value="", method = RequestMethod.GET)
	public String main() {
		return "<h1>Welcome!</h1>";
	}
	
	@RequestMapping(value="/today", method = RequestMethod.GET)
	public String today() {
		return "<h2>¡Hoy encontrarás suerte en todos tus esfuerzos!</h2>";
	}
	
	@RequestMapping(value="/tomorrow", method = RequestMethod.GET)
	public String tomorrow() {
		return "<h2>Tomorrow you will fill a good luck!</h2>";
	}
	
	//el required = false permite que cuando se llega a ../search muestra Haz buscado: null, si esta en true no despliega nada
    @RequestMapping("/search")
    public String index(@RequestParam(value="q", required=true) String searchQuery) {
        return "Haz buscado: " + searchQuery;
    }
//...
}
