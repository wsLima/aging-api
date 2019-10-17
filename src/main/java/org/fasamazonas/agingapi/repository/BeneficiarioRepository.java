package org.fasamazonas.agingapi.repository;

import org.fasamazonas.agingapi.model.Beneficiario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;

/**
 * Created by wsLima
 */
public interface BeneficiarioRepository extends JpaRepository<Beneficiario, Long> {


    @Query(value = " select  b.protocolo, b.nome, p.data_pagamento, s.data_saque from financa.beneficiario as b "
            + " inner join (select distinct p.protocolo, p.valor, p.data_pagamento from financa.pagamento p "
            + " inner join (select  max(data_pagamento) as data from financa.pagamento "
            + " group by  protocolo) pg on p.data_pagamento = pg.data )  as p ON  b.protocolo = p.protocolo "
            + " inner join (select distinct s.protocolo, s.valor, s.data_saque from financa.saque s "
            + " inner join (select  max(data_saque) as data from financa.saque "
            + " group by  protocolo) sq on s.data_saque = sq.data) as s ON b.protocolo = s.protocolo", nativeQuery = true)
    List<Object[]> findAllBeneficiarios();


}

