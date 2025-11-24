package br.ifsp.edu.dsw3.anagrama.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.ifsp.edu.dsw3.anagrama.model.dao.PalavraDAO;
import br.ifsp.edu.dsw3.anagrama.model.dao.TemaDAO;
import br.ifsp.edu.dsw3.anagrama.model.domain.Nivel;
import br.ifsp.edu.dsw3.anagrama.model.domain.Palavra;
import br.ifsp.edu.dsw3.anagrama.model.domain.Tema;

@RestController
@RequestMapping({"/palavras"})
public class PalavraController {

   @Autowired
   private PalavraDAO dao;
   @Autowired
   private TemaDAO daoT;

   @PostMapping({"/cadastrar"})
   public Palavra cadastrar(@RequestParam("palavra") String palavra, @RequestParam("pontuacao") Integer pontuacao, @RequestParam("tema") Long tema) {

      List<Palavra> pls = this.dao.findAll();
      List<Tema> t = this.daoT.findAll();
      boolean a = false;
      Tema tema2 = new Tema();

      for (Palavra pl : pls){

         if(pl.getPalavra().equals(palavra)){
            return null;
         }
      }

      for(Tema tt : t){

         if(tt.getId() == (tema)){
            a = true;
            tema2 = tt;
         }
      }

      if(a){

         Palavra p = new Palavra(palavra, pontuacao, tema2);
         return (Palavra)this.dao.save(p);

      }else{
         return null;
      }
   }

   @GetMapping({"/listar"})
   public List<Palavra> listar() {
      return this.dao.findAll();
   }

   @GetMapping({"/pesquisar/{id}"})
   public Palavra pesquisarPorCodigo(@PathVariable("id") Long id) {
      return (Palavra)this.dao.findById(id).orElseGet(() -> {
         return null;
     });
   }

   @DeleteMapping({"/deletar/{id}"})
   public Boolean remover(@PathVariable("id") Long id) {

      Optional<Palavra> oPalavra = this.dao.findById(id);

      if (oPalavra.isPresent()) {
         Palavra p = oPalavra.get();
         this.dao.delete(p);
         return true;
     } else {
         return false;
     }
   }

   @GetMapping("/embaralhar/{n}")
    public List<String> embaralhar(@PathVariable("n") Long n) {

        List<Palavra> allPalavras = dao.findAll();
        
        if (allPalavras.isEmpty()) {
            throw new RuntimeException("A lista de palavras está vazia");
        }

        List<Palavra> palavrasNivel = new ArrayList<>();
        System.out.println("parametro" + n);

        for (int i = 0; i < allPalavras.size(); i ++){
            Palavra palavra = allPalavras.get(i);
            Tema tema = palavra.getTema();
            Nivel nivel = tema.getNivel();
            Long idNivel = nivel.getId();
            if (idNivel.equals(n)){
               palavrasNivel.add(palavra);
            }
        }

        Random random = new Random();
        int numeroAleatorio = random.nextInt(palavrasNivel.size());
        Palavra pEscolhida = palavrasNivel.get(numeroAleatorio);


        String novaP;
        String antigaP;
        do{
         char[] caracteres = pEscolhida.getPalavra().toCharArray();
         for (int i = caracteres.length - 1; i > 0; i--) {
               int indiceAleatorio = random.nextInt(i + 1);
               char temp = caracteres[i];
               caracteres[i] = caracteres[indiceAleatorio];
               caracteres[indiceAleatorio] = temp;
         }

         novaP = new String(caracteres);
         antigaP = pEscolhida.getPalavra();

        } while (novaP.equals(antigaP));

        String id = pEscolhida.getId() != null ? String.valueOf(pEscolhida.getId()) : "ID nulo";
        List<String> lista = new ArrayList<>();

        lista.add(novaP);
        lista.add(antigaP);
        lista.add(id);

        return lista;
    }
}