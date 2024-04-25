package fatec.lab4.activity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fatec.lab4.activity.entity.Racao;
import fatec.lab4.activity.service.RacaoService;

@RestController
@RequestMapping(value = "/racao")
public class RacaoController {
    @Autowired
    private RacaoService racaoService;
  
    // cadastro
    @PostMapping
    public Racao insertRacao(@RequestBody Racao racao){
        return racaoService.insertRacao(racao);
    }
    
    // trazer todas as rações
    @GetMapping
    public List<Racao> findAll(){
        return racaoService.findAll();
    }

    @GetMapping(value = "/{estoque}/{nota}")
    public List<Racao> findRacaoByEstoqueNota(@PathVariable("estoque") Double quantidadeEstoque,@PathVariable("nota") Integer nota){
        return racaoService.findRacaoByEstoqueNota(quantidadeEstoque, nota);
    }
}


