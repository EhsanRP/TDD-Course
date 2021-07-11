package guru.springframework.sfgpetclinic.controllers;

import guru.springframework.sfgpetclinic.fauxspring.Model;
import guru.springframework.sfgpetclinic.fauxspring.ModelImpl;
import guru.springframework.sfgpetclinic.model.Vet;
import guru.springframework.sfgpetclinic.services.VetService;
import guru.springframework.sfgpetclinic.services.map.VetMapService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Ehsan Rostami Pour
 * @version 1.0
 * @date 7/11/2021 11:16 PM
 */
class VetControllerTest {

    VetController vetController;
    VetService vetService;
    Model model;

    @BeforeEach
    void setUp() {

        vetService = new VetMapService(null);
        model = new ModelImpl();
        vetController = new VetController(vetService);

        var vet1 = new Vet(1l, "ehsan", "rostami", new HashSet<>());
        vetService.save(vet1);
    }

    @Test
    void listVetsReturnsView() {
        assertEquals("vets/index", vetController.listVets(model));
        assertEquals(1, model.getSize("vets"));
    }

}