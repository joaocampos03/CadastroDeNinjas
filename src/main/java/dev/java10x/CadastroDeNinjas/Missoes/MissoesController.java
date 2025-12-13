package dev.java10x.CadastroDeNinjas.Missoes;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("missoes")
public class MissoesController {

    private MissoesService missoesService;

    @PostMapping("/criar")
    public MissoesModel criarMissao(@RequestBody MissoesModel missoesModel) {
        return missoesService.criarMissao(missoesModel);
    }

    @GetMapping("/listar")
    public List<MissoesModel> listarMissao() {
        return missoesService.listarMissoes();
    }

    @GetMapping("/listar/{id}")
    public MissoesModel listarMissaoPorId(@PathVariable Long id) {
        return missoesService.listarMissaoPorId(id);
    }

    @PutMapping("/alterar/{id}")
    public String alterarMissaoPorId() {
        return "Missão alterar com sucesso!";
    }

    @DeleteMapping("/deletar")
    public String deletarMissao() {
        return "Missao deletada com sucesso!";
    }
}
