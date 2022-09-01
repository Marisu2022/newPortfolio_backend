package com.portafolio.api.Controller;

import com.portafolio.api.Service.IPortadaService;
import com.portafolio.api.model.Portada;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
@CrossOrigin(origins = "*")
public class PortadaController {

    @Autowired
    IPortadaService portServ;

    @GetMapping("/ver/portada")
    public List<Portada> verPortada() {
        return portServ.verPortada();
    }

    @PostMapping("/new/portada")
    public void crearPortada(@RequestBody Portada port) {
        portServ.crearPortada(port);
    }

    @DeleteMapping("/delete/portada/{id}")
    public void borrarPortada(@PathVariable Long id) {
        portServ.borrarPortada(id);
    }

    @PutMapping("/editar/portada/{id}")
    public Portada editPortada(@PathVariable Long id,
            @RequestParam("nombre") String nuevoNombre,
            @RequestParam("apellido") String nuevoApellido,
            @RequestParam("info") String nuevoInfo,
            @RequestParam("img") String nuevoImg) {
        
        Portada port = portServ.findPortada(id);

        port.setNombre(nuevoNombre);
        port.setApellido(nuevoApellido);
        port.setInfo(nuevoInfo);
        port.setImg_profile(nuevoImg);

        portServ.crearPortada(port);
        return port;
    }
}
