package insper.store.instituicao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstituicaoRepository extends CrudRepository<InstituicaoModel, String> {
    InstituicaoModel findByNome(String nome);
}
