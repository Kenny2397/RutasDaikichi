package com.codingdojo.kenny.Controllers;

import org.springframework.web.bind.annotation.PathVariable;
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
    
	@RequestMapping(value = "/search", method=RequestMethod.GET)
    public String index(@RequestParam(value="q", required=true) String searchQuery) {
        return "Haz buscado: " + searchQuery;
    }
	
	@RequestMapping(value = "/travel/{destino}", method = RequestMethod.GET)
	public String travel(@PathVariable("destino") String destino) {
		return "Congratulations! You will soon travel to "+ destino+"!";
	}
	
	@RequestMapping(value="/lotto/{int}", method = RequestMethod.GET)
	public String lotto(@PathVariable("int") int entero) {
		if(entero%2 == 0) {
			return "Harás un gran viaje en un futuro cercano, pero ten cuidado con las ofertas tentadoras";
		}else {
			return "Has disfrutado de los frutos de tu trabajo, pero ahora es un buen momento para pasar tiempo con familiares y amigos";
		}
	}

}
