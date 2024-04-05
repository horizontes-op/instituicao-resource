package insper.store.instituicao;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

@Builder
@Getter @Setter @Accessors(fluent = true, chain = true)
@AllArgsConstructor @NoArgsConstructor
public class Instituicao {
    // dados gerais
    private String id;
    private String nome;
    private String area_atuacao;
    private String cnpj;
    private String site;
    private String modalidade;

    // endereço
    private String cep;
    private String numero_endereco;

    // redes sociais
    private String perfil_instagram;
    private String perfil_facebook;
    private String perfil_linkedin;
    private String perfil_twitter;

    // contato
    private String email;
    private String telefone;

    // sobre a instituição
    private String descricao;
    private String misssao;
    private String visao;
    private String valores;
    
}
