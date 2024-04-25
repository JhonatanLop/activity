package fatec.lab4.activity.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fatec.lab4.activity.entity.Racao;
import fatec.lab4.activity.repository.RacaoRepository;

@Service
public class RacaoService {
    @Autowired
    private RacaoRepository racaoRepo;
    
    // cadastra uma nova ração
    public Racao insertRacao(Racao racao) {
        if (racao.getDataHoraUltimaCompra() == null) {
            LocalDateTime lDateTime = LocalDateTime.now();            
            racao.setDataHoraUltimaCompra(lDateTime);
        }
        return racaoRepo.save(racao);
    }

    // traz todos os registros
    public List<Racao> findAll() {
        return racaoRepo.findAll();
    }

    // traz todos os registos dentro das regras da query
    public List<Racao> findRacaoByEstoqueNota(Double quantidadeEstoque, Integer nota){
        return racaoRepo.findRacaoByEstoqueNota(quantidadeEstoque, nota);
    }

}
