package fatec.lab4.activity.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import fatec.lab4.activity.entity.Racao;

public interface RacaoRepository extends JpaRepository<Racao, Long>{
    @Query("select r from Racao r where r.quantidadeEstoque < ?1 and r.nota > ?2")
    public List<Racao> findRacaoByEstoqueNota(Double estoque, Integer nota);
}
