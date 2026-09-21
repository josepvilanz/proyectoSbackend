package com.ejemplo.gestor.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaController {
    @GetMapping("/hola")
    public String hola() {
        return "Hola, mundo. Te responde mi servidor.";
    }

    @PostMapping
    public String crear() {
    return "Alguien ha hecho un POST";
}
}