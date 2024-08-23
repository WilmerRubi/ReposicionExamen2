package hn.lenguajes.reposicion.reposicion.Servicios;

import java.util.Random;

import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.lenguajes.reposicion.reposicion.Modelos.Equipos;
import hn.lenguajes.reposicion.reposicion.Repositorios.EquiposRepositorio;
import hn.lenguajes.reposicion.reposicion.Repositorios.PosicionesRepositorio;

@Service
public class SimulacionServicio {

    @Autowired
    private EquiposRepositorio equipoRepositorio;
    @Autowired
    private PosicionesRepositorio posicionesRepositorio;

    private final Random random = new Random();

    public void simularPartidos() {
        List<Equipos> equipos = equipoRepositorio.findAll();
        
        if (equipos.size() < 6) {
            // Crear equipos ficticios si hay menos de 6 equipos
            crearEquiposFicticios(6 - equipos.size());
            equipos = equipoRepositorio.findAll(); // Actualizar lista de equipos
        }

    

}

}
