package estudo.spring.boot.produtosapi.repository;

import estudo.spring.boot.produtosapi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, String> {
}
