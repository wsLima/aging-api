package org.fasamazonas.agingapi.repository;

import org.fasamazonas.agingapi.model.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by wsLima
 */
public interface PagamentoRepository extends JpaRepository<Pagamento, Long> {

    //Page<Payment> filter(final Pageable pageable);

}

