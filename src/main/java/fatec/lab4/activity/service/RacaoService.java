package fatec.lab4.activity.service;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import fatec.lab4.activity.entity.Racao;
import fatec.lab4.activity.repository.RacaoRepository;

public class RacaoService {
    private RacaoRepository racaoRepo;
    
    // cadastra uma nova ração
    public Racao inserRacao(Racao racao) {
        if (racao.getMarca() == null ||
            racao.getMarca().isBlank() ||
            racao.getDataHoraUltimaCompra() == null ||
            racao.getQuantidadeEstoque() < 0 ||
            racao.getNota() < 0) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "erro");
        }
        return racaoRepo.save(racao);
    }

    // traz todos os registros
    public List<Racao> findAll() {
        return racaoRepo.findAll();
    }

    // traz todos os registos dentro das regras da query
    public List<Racao> findRacaoByEstoqueNota(int nota, double quantidadeEstoque){
        return racaoRepo.findRacaoByEstoqueNota(nota, quantidadeEstoque);
    }

}
