package br.com.alura.school.matricula;

import com.fasterxml.jackson.annotation.JsonProperty;

class MatriculaResponse {

    @JsonProperty
    private final String username;

   

    MatriculaResponse(Matricula matricula) {
        this.username = matricula.getUsername();
        
    }
}
