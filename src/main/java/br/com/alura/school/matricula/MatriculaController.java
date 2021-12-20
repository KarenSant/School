package br.com.alura.school.matricula;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

import static java.lang.String.format;
import static org.springframework.http.HttpStatus.NOT_FOUND;

@RestController
@RequestMapping("/matriculas")
class MatriculaController {
	
	@Autowired
    private MatriculaRepository matriculaRepository;
	   /* 
    MatriculaController(MatriculaRepository matriculaRepository) {
        this.matriculaRepository = matriculaRepository;
    }

    @GetMapping//("/matricula/{username}")
    public String listar(){
    	return "oiiiii";
    }*/
    
    @GetMapping//("/matricula/{username}")
    public List<Matricula> listar(){
    	return matriculaRepository.findAll();
    }
    
    
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Matricula adicionar(@RequestBody Matricula matricula) {
    	return matriculaRepository.save(matricula);
    }
/*
    @PostMapping("/matriculas")
    ResponseEntity<Void> newMatricula(@RequestBody @Valid MatriculaRequest MatriculaRequest) {
        matriculaRepository.save(MatriculaRequest.toEntity());
        URI location = URI.create(format("/matriculas/%s", MatriculaRequest.getUsername()));
        return ResponseEntity.created(location).build();
    }*/

}
