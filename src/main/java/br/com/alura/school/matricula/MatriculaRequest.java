package br.com.alura.school.matricula;

import br.com.alura.school.support.validation.Unique;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;


class MatriculaRequest {

    @Unique(entity = Matricula.class, field = "username")
    @Size(max=20)
    @NotBlank
    @JsonProperty
    private final String username;
/*
    @Unique(entity = User.class, field = "email")
    @NotBlank
    @Email
    @JsonProperty
    private final String email;
*/
    MatriculaRequest(String username, String email) {
        this.username = username;
//        this.email = email;
    }

    String getUsername() {
        return username;
    }

    Matricula toEntity() {
        return new Matricula (username);
    }
}
