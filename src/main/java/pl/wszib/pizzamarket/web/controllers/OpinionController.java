package pl.wszib.pizzamarket.web.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import pl.wszib.pizzamarket.data.entities.OpinionEntity;
import pl.wszib.pizzamarket.data.repositories.OpinionRepository;
import pl.wszib.pizzamarket.services.OpinionService;
import pl.wszib.pizzamarket.web.models.OpinionModel;
import pl.wszib.pizzamarket.web.models.OrderAddressModel;
import pl.wszib.pizzamarket.web.models.PizzaModel;

import java.util.List;

@Controller

public class OpinionController {

    private final OpinionService opinionService;


    public OpinionController(OpinionService opinionService) {

        this.opinionService = opinionService;
    }




        @GetMapping("/opinion")
        public String  opinionPage (Model model){

       List<OpinionEntity> opinionEntities = opinionService.getAllOpinions();

        model.addAttribute("opinion", new OpinionModel());
        return "opinionPage";

        }

        @PostMapping("/opinion")
    public String opinionSubmit (@ModelAttribute OpinionModel opinionModel, Model model ){

        model.addAttribute("opinion", opinionModel);
        return "opinionPage";
        }

    }



