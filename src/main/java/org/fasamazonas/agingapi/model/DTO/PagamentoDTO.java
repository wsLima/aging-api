package org.fasamazonas.agingapi.model.DTO;

import lombok.Data;
import lombok.Getter;
import org.fasamazonas.agingapi.model.Pagamento;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
public class PagamentoDTO {

    private Long protocolo;

    private String nome;

    private BigDecimal valorPagamento;

    private LocalDate dataPagamento;


    public PagamentoDTO(){}

    public PagamentoDTO(Long protocolo, String nome, BigDecimal valorPagamento, LocalDate dataPagamento){

        this.protocolo = protocolo;
        this.nome = nome;
        this.valorPagamento = valorPagamento;
        this.dataPagamento = dataPagamento;
    }
}
