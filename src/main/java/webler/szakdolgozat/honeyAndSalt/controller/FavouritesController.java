package webler.szakdolgozat.honeyAndSalt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import webler.szakdolgozat.honeyAndSalt.service.HoneyAndSaltService;

@Controller
public class FavouritesController {
	
	@GetMapping("/favourites")
	public String recipeFavourites(Model model) {
		return "favourites";
	}
	
}
