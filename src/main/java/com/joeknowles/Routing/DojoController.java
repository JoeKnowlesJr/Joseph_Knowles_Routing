package com.joeknowles.Routing;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DojoController {
	
    @RequestMapping("/{word}")
    public String respond(@PathVariable("word") String word){
    	switch(word) {
	    	case "dojo": return "The dojo is awesome!";
	    	case "burbank-dojo": return "Burbank Dojo is located in Southern California.";
	    	case "san-jose": return "SJ dojo is the headquarters.";
    	}
    	return "Invalid parameter!";
    }
}
