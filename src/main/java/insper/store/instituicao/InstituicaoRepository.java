package insper.store.instituicao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface InstituicaoRepository extends JpaRepository<InstituicaoModel, String> {

    Optional<InstituicaoModel> findByNome(String nome);
}
