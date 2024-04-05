package insper.store.instituicao;

import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    public Instituicao[] readAll() {
        Iterable<InstituicaoModel> allInstituicoes = instituicaoRepository.findAll();
        return StreamSupport.stream(allInstituicoes.spliterator(), false)
                            .map(InstituicaoModel::to)
                            .toArray(Instituicao[]::new);
    }
    
}
