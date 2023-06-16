package pl.wszib.pizzamarket.web.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.wszib.pizzamarket.data.entities.OpinionEntity;
import pl.wszib.pizzamarket.data.repositories.OpinionRepository;
import pl.wszib.pizzamarket.web.models.OpinionModel;

import java.util.List;

@Controller
public class OpinionController {

    private OpinionRepository opinionRepository;

    @GetMapping("/opinion")
    public String opinionPage (Model model) {

        model.addAttribute("opinionModel", new OpinionModel());

        return "opinionPage";
    }

    @PostMapping("/opinion")
    public String submitOpinion(@ModelAttribute("opinionModel") OpinionModel opinionModel) {
        // Create an OpinionEntity and save it in the repository
        OpinionEntity opinionEntity = new OpinionEntity();
        opinionEntity.setName(opinionModel.getName());
        opinionEntity.setContent(opinionModel.getContent());
        opinionRepository.save(opinionEntity);
        return "redirect:/opinion";
    }

    @GetMapping("/opinion/all")
    public String showAllOpinions(Model model) {
        List<OpinionEntity> opinions = opinionRepository.findAll();
        model.addAttribute("opinions", opinions);
        return "opinionList";
    }
}

