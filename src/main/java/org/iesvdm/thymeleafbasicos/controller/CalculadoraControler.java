package org.iesvdm.thymeleafbasicos.controller;
import lombok.extern.slf4j.Slf4j;
import org.iesvdm.thymeleafbasicos.dto.CalculadoraDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Slf4j
@Controller
public class CalculadoraControler {

    @GetMapping("/calculadora")

    public String calculadora(Model model, @ModelAttribute CalculadoraDTO calculadoraDTO){

    return "calculadora";
    }

    @PostMapping("/calculadora")

    public String calculadoraSubmit (Model model, @ModelAttribute CalculadoraDTO calculadoraDTO){

        log.info(calculadoraDTO.toString());

        model.addAttribute("media");

        return "calculadora";

    }

}
