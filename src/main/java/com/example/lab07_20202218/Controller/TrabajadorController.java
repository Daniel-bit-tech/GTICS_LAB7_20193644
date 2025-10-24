package com.example.lab07_20202218.Controller;

import com.example.lab07_20202218.Entity.Trabajador;
import com.example.lab07_20202218.Repository.TrabajadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class TrabajadorController {

    @Autowired
    private TrabajadorRepository trabajadorRepository;

    @GetMapping("/")
    public String listarTrabajadores(Model model) {
        List<Trabajador> listaTrabajadores = trabajadorRepository.findAll();
        model.addAttribute("trabajadores", listaTrabajadores);
        return "lista_trabajadores";
    }
}
