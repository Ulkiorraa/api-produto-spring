package br.com.ulkiorra.api.http.controller;

import br.com.ulkiorra.api.entity.Produto;
import br.com.ulkiorra.api.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Produto> getAllProdutos() {
        return produtoService.getAllProdutos();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Produto getProdutoById(@PathVariable Long id) {
        return produtoService.getProdutoById(id)
                .orElseThrow(() -> new RuntimeException(HttpStatus.NOT_FOUND + "Produto não encontrado com o ID: " + id));
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Produto createProduto(@RequestBody Produto produto) {
        return produtoService.saveProduto(produto);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Produto updateProduto(@PathVariable Long id, @RequestBody Produto produto) {
        return produtoService.updateProduto(id, produto);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteProduto(@PathVariable Long id) {
        produtoService.getProdutoById(id).map(produto -> {
            produtoService.deleteProduto(produto.getId());
            return Void.TYPE;
        }).orElseThrow(() -> new RuntimeException(HttpStatus.NOT_FOUND + "Produto não encontrado com o ID: " + id));
    }
}
