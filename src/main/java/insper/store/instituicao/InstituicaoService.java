package insper.store.instituicao;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import lombok.NonNull;

@Service
public class InstituicaoService {

    @Autowired
    private InstituicaoRepository instituicaoRepository;

    public Instituicao create(Instituicao in) {
        return instituicaoRepository.save(new InstituicaoModel(in)).to();
    }

    @Cacheable(value = "instituicao", key = "#id")
    public Instituicao read(@NonNull String id) {
        return instituicaoRepository.findById(id).map(InstituicaoModel::to).orElse(null);
    }

    @Cacheable(value = "instituicao", key = "'ALLinstituicoes'")
    public List<Instituicao> readAll() {
        Iterable<InstituicaoModel> allInstituicoes = instituicaoRepository.findAll();
        return StreamSupport.stream(allInstituicoes.spliterator(), false)
                            .map(InstituicaoModel::to)
                            .collect(Collectors.toList());
    }
    
    @Cacheable(value = "instituicao", key = "#nome")
    public Instituicao getByNome(@NonNull String nome) {
        Optional<InstituicaoModel> instituicaoModel = instituicaoRepository.findByNome(nome);

        if (instituicaoModel.isEmpty()) {
            // Handle the case where no institution is found, e.g., throw a custom exception or return null
            return null;
        }

        return instituicaoModel.get().to();
    }
    
}
