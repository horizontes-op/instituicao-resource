package insper.store.instituicao;

public class InstituicaoParser {

        // // dados gerais
        // String nome,
        // String area_atuacao,
        // String cnpj,
        // String site,
        // String modalidade,
    
        // // endereço
        // String cep,
        // String numero_endereco,
    
        // // redes sociais
        // String perfil_instagram,
        // String perfil_facebook,
        // String perfil_linkedin,
        // String perfil_twitter,
    
        // // contato
        // String email,
        // String telefone,
    
        // // sobre a instituição
        // String descricao,
        // String misssao,
        // String visao,
        // String valores

    public static Instituicao to(InstituicaoIn in) {
        return Instituicao.builder()
            .nome(in.nome())
            .area_atuacao(in.area_atuacao())
            .cnpj(in.cnpj())
            .site(in.site())
            .modalidade(in.modalidade())
            .cep(in.cep())
            .numero_endereco(in.numero_endereco())
            .perfil_instagram(in.perfil_instagram())
            .perfil_facebook(in.perfil_facebook())
            .perfil_linkedin(in.perfil_linkedin())
            .perfil_twitter(in.perfil_twitter())
            .email(in.email())
            .telefone(in.telefone())
            .descricao(in.descricao())
            .misssao(in.misssao())
            .visao(in.visao())
            .valores(in.valores())
            .build();
    }

    public static InstituicaoOut to(Instituicao instituicao) {
        return InstituicaoOut.builder()
            .id(instituicao.id())
            .nome(instituicao.nome())
            .area_atuacao(instituicao.area_atuacao())
            .cnpj(instituicao.cnpj())
            .site(instituicao.site())
            .modalidade(instituicao.modalidade())
            .cep(instituicao.cep())
            .numero_endereco(instituicao.numero_endereco())
            .perfil_instagram(instituicao.perfil_instagram())
            .perfil_facebook(instituicao.perfil_facebook())
            .perfil_linkedin(instituicao.perfil_linkedin())
            .perfil_twitter(instituicao.perfil_twitter())
            .email(instituicao.email())
            .telefone(instituicao.telefone())
            .descricao(instituicao.descricao())
            .misssao(instituicao.misssao())
            .visao(instituicao.visao())
            .valores(instituicao.valores())
            .build();
    }
    
}
