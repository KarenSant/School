package br.com.alura.school.relatorio;

import com.fasterxml.jackson.annotation.JsonProperty;

class RelatorioResponse {

    @JsonProperty
    private final String email;
    private final String quantidade_matriculas;
   

    RelatorioResponse(Relatorio relatorio) {
        this.email = relatorio.getEmail();
		this.quantidade_matriculas = relatorio.getQuantidade_matriculas();
    }
}
