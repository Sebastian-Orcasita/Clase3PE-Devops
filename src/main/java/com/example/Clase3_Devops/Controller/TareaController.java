package com.example.Clase3_Devops.Controller;

import ch.qos.logback.core.model.Model;
import com.example.Clase3_Devops.Model.Tarea;
import com.example.Clase3_Devops.Repositorio.TareaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor

public class TareaController {

    private final TareaRepository repositorio;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("tareas", repositorio.findAll());
        return "index";
    }

    @PostMapping("/guardar")
    public String guardar(@ModelAttribute Tarea tarea){
        repositorio.save(tarea);
        return "redirect:/";
    }

    @GetMapping("eliminar{id}")
    public String eliminar(@PathVariable Long id){
        repositorio.deleteAllById(id);
        return "redirect:/";
    }
}
