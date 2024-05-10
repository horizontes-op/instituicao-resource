package insper.store.instituicao;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.persistence.EntityNotFoundException;
import lombok.NonNull;

@Service
public class InstituicaoService {

    @Autowired
    private InstituicaoRepository instituicaoRepository;

    public Instituicao create(Instituicao in) {
        return instituicaoRepository.save(new InstituicaoModel(in)).to();
    }

    public Instituicao read(@NonNull String id) {
        return instituicaoRepository.findById(id).map(InstituicaoModel::to).orElse(null);
    }

    public List<Instituicao> readAll() {
        Iterable<InstituicaoModel> allInstituicoes = instituicaoRepository.findAll();
        return StreamSupport.stream(allInstituicoes.spliterator(), false)
                            .map(InstituicaoModel::to)
                            .collect(Collectors.toList());
    }
    
    public Instituicao getByNome(@NonNull String nome) {
        // return the element with the given name or null if it does not exist
          InstituicaoModel instituicaoModel = instituicaoRepository.findByNome(nome);
        if (instituicaoModel == null) {
            // Handle the case where no institution is found, e.g., throw a custom exception or return null
            return null;
        }
        return instituicaoModel.to();
    }
    
}
