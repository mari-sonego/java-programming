package br.ifsp.edu.dsw3.anagrama.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.HttpStatus;
// import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.ifsp.edu.dsw3.anagrama.model.dao.NivelDAO;
import br.ifsp.edu.dsw3.anagrama.model.dao.TemaDAO;
import br.ifsp.edu.dsw3.anagrama.model.domain.Nivel;
import br.ifsp.edu.dsw3.anagrama.model.domain.Tema;

@RestController
@RequestMapping({ "/temas" })
public class TemaController {

    @Autowired
    private TemaDAO dao;
    @Autowired
    private NivelDAO daoN;

    @PostMapping({ "/cadastrar" })
    public Tema cadastrar(@RequestParam("tema") String tema, @RequestParam("nivel") Long nivel) {

        List<Tema> tms = this.dao.findAll();
        List<Nivel> n = this.daoN.findAll();
        boolean achou = false;
        Nivel nivel2 = new Nivel();

        for (Tema tm : tms){

            if(tm.getTema().equals(tema)){
                return null;
            }
        }

        for(Nivel nn : n){

            if(nn.getId() == nivel){
                achou = true;
                nivel2 = nn;
            }
        }

        if(achou){

            Tema t = new Tema(tema, nivel2);
            return (Tema) this.dao.save(t);
        } else{
            return null;
        }
    }


    @GetMapping({ "/listar" })
    public List<Tema> listar() {
        return this.dao.findAll();
    }

    @GetMapping({ "/pesquisar/{id}" })
    public Tema pesquisarPorCodigo(@PathVariable("id") Long id) {
        return (Tema) this.dao.findById(id).orElseGet(() -> {
            return null;
        });
    }

    @DeleteMapping({ "/deletar/{id}" })
    public Boolean remover(@PathVariable("id") Long id) {

        Optional<Tema> oTema = this.dao.findById(id);

        if (oTema.isPresent()) {
            Tema t = oTema.get();
            this.dao.delete(t);
            return true;
        } else {
            return false;
        }
    }
}