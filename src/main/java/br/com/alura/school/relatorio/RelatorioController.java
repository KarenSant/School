package br.com.alura.school.relatorio;

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
@RequestMapping("/relatorios")
class RelatorioController {
	/*
	@Autowired
    private RelatorioRepository relatorioRepository;
    */
    @GetMapping//("/courses/enroll/report")
    public List<Relatorio> listar(){
    	return null;
    	//    	return relatorioRepository.findAll();
    }
    
    
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Relatorio adicionar(@RequestBody Relatorio relatorio) {
return null;
    	//    	return relatorioRepository.save(relatorio);
    }
/*
    @PostMapping("/matriculas")
    ResponseEntity<Void> newMatricula(@RequestBody @Valid MatriculaRequest MatriculaRequest) {
        matriculaRepository.save(MatriculaRequest.toEntity());
        URI location = URI.create(format("/matriculas/%s", MatriculaRequest.getUsername()));
        return ResponseEntity.created(location).build();
    }*/

}
