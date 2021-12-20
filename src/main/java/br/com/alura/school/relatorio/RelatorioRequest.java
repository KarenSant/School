package br.com.alura.school.relatorio;

import br.com.alura.school.support.validation.Unique;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;


class RelatorioRequest {

    @Unique(entity = Relatorio.class, field = "username")
    @Size(max=20)
    @NotBlank
    @JsonProperty
    private final Integer quantidade_matriculas;

    @Unique(entity = Relatorio.class, field = "email")
    @NotBlank
    @Email
    @JsonProperty
    private final String email;

    RelatorioRequest(Integer quantidade_matriculas, String email) {
        this.quantidade_matriculas = quantidade_matriculas;
        this.email = email;
    }

    public String getEmail() {
		return email;
	}

    public Integer getQuantidade_matriculas() {
		return quantidade_matriculas;
	}

	Relatorio toEntity() {
        return new Relatorio ();
    }
}
