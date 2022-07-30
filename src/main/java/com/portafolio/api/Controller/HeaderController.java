package com.portafolio.api.Controller;

import com.portafolio.api.Service.IHeaderService;
import com.portafolio.api.model.Header;
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
public class HeaderController {

    @Autowired
    private IHeaderService headServ;

    @GetMapping("/ver/header")
    public List<Header> verHeader() {
        return headServ.verHeader();
    }

    @PostMapping("/new/Header")
    public void crearHeader(@RequestBody Header head) {
        headServ.crearHeader(head);
    }

    @DeleteMapping("/delete/header/{id}")
    public void borrarHeader(@PathVariable Long id) {
        headServ.borrarHeader(id);
    }

    @PutMapping("/editar/header/{id}")
    public Header editHeader(@PathVariable Long id,@RequestParam("img_header")String nuevoImg_header) {
        Header head = headServ.findHeader(id);
        
        head.setImg_header(nuevoImg_header);
        
        headServ.crearHeader(head);
        return head;
    }
}