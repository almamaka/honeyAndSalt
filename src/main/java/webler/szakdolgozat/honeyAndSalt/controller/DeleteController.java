package webler.szakdolgozat.honeyAndSalt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import webler.szakdolgozat.honeyAndSalt.service.HoneyAndSaltService;

@Controller
public class DeleteController {

	@Autowired
	private HoneyAndSaltService honeyService;
	
	@GetMapping("delete/{id}")
	public String deleteCarOrder(@PathVariable("id") Long id) {
		honeyService.deleteRecipe(id);
		return "redirect:/listrecipes";
	}
}
