package io.hanri.ms.msclientes.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idCliente;
    @Column
    private String nome;
    @Column(unique = true)
    private String cpf;
    @Column(unique = true)
    private String email;
    @Column
    private String idade;

}
