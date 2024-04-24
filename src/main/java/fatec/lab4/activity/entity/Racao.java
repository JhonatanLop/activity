package fatec.lab4.activity.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "rac_racao")
public class Racao {
    
    @Id
    @Column(name = "rac_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "rec_marca", nullable = false, length = 100, unique = true)
    private String marca;

    @Column(name = "rac_data_hora_ultima_compra", nullable = false)
    private LocalDateTime dataHoraUltimaCompra;

    @Column(name = "rac_quantidade_estoque", columnDefinition = "DECIMAL(10, 2)")
    private double quantidadeEstoque;

    @Column(name = "rac_nota", nullable = false)
    private int nota;
}
