package br.com.ulkiorra.api.service;

import br.com.ulkiorra.api.entity.Produto;
import br.com.ulkiorra.api.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public List<Produto> getAllProdutos() {
        return produtoRepository.findAll();
    }

    public Optional<Produto> getProdutoById(Long id) {
       return produtoRepository.findById(id);
    }

    public Produto saveProduto(Produto produto) {
        return produtoRepository.save(produto);
    }

    public Produto updateProduto(Long id, Produto produtoDetails) {
        Produto produto = produtoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Produto não encontrado com o ID: " + id));
        produto.setNome(produtoDetails.getNome());
        produto.setDescricao(produtoDetails.getDescricao());
        produto.setPreco(produtoDetails.getPreco());
        return produtoRepository.save(produto);
    }

    public void deleteProduto(Long id) {
        produtoRepository.deleteById(id);
    }
}