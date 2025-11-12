package org.iesvdm.thymeleafbasicos.controller;

import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.iesvdm.thymeleafbasicos.dto.SaludoDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Slf4j
@Controller
public class SaludoControler {

    @GetMapping("/saludos")
    public String saludos(Model model, @ModelAttribute SaludoDTO saludoDTO){

        model.addAttribute("saludoDTO",saludoDTO);

        return "saludos";
    }
    @PostMapping("/saludos")
    public String saludosSubmit(Model model, @ModelAttribute SaludoDTO saludoDTO){

        log.info(saludoDTO.toString());

        String salida;

        if ("es".equals(saludoDTO.getIdioma())) {
            model.addAttribute("saludoEsp","Hola  " + saludoDTO.getNombre());

        }else if ("en".equals(saludoDTO.getIdioma())){

            model.addAttribute("saludoEng","Hello  " + saludoDTO.getNombre());

        }
        return "saludos";
    }
}
