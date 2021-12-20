package br.com.alura.school.relatorio;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface RelatorioRepository extends JpaRepository<Relatorio, Long> {
	Optional<Relatorio> findByEmail(String email);
}
