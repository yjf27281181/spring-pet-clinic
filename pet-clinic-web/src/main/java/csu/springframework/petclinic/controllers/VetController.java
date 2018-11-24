package csu.springframework.petclinic.controllers;

import csu.springframework.petclinic.services.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {
    private final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping({"/vets", "/vets/index", "/vets/index.html"})
    public String ListVets(Model model) {
        System.out.println(vetService.findAll());
        model.addAttribute("vets", vetService.findAll());
        return "vets/index";
    }
}
