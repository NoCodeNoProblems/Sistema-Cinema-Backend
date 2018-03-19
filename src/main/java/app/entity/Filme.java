package app.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Table(name = "filme")
public class Filme implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "codigo_filme")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private Long id;

    @Column(name = "nomeBr")
    @Getter
    @Setter
    private String nome_br;

    @Column(name = "nomeEng")
    @Getter
    @Setter
    private String nome_eng;

    @Column(name = "anoLancamento")
    @Getter
    @Setter
    private int ano_lancamento;

    @Column(name = "sinopse")
    @Getter
    @Setter
    private String sinopse;

    @OneToOne
    private Diretor diretor;

    @OneToMany(fetch = FetchType.EAGER)
    private List<Genero> genero;

}
