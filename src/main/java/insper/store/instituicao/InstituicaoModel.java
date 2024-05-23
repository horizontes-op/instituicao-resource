package insper.store.instituicao;

import java.util.Optional;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;


@Entity
@Table(name = "instituicao")
@EqualsAndHashCode(of = "id")
@Builder @Getter @Setter @Accessors(chain = true, fluent = true)
@NoArgsConstructor @AllArgsConstructor
public class InstituicaoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_instituicao")
    private String id;

    @Column(name = "tx_nome")
    private String nome;

    @Column(name = "tx_area_atuacao")
    private String area_atuacao;

    @Column(name = "tx_cnpj")
    private String cnpj;

    @Column(name = "tx_site")
    private String site;

    @Column(name = "tx_modalidade")
    private String modalidade;

    @Column(name = "tx_cep")
    private String cep;

    @Column(name = "tx_numero_endereco")
    private String numero_endereco;

    @Column(name = "tx_perfil_instagram")
    private String perfil_instagram;

    @Column(name = "tx_perfil_facebook")
    private String perfil_facebook;

    @Column(name = "tx_perfil_linkedin")
    private String perfil_linkedin;

    @Column(name = "tx_perfil_twitter")
    private String perfil_twitter;

    @Column(name = "tx_email")
    private String email;

    @Column(name = "tx_telefone")
    private String telefone;

    @Column(name = "tx_descricao")
    private String descricao;

    @Column(name = "tx_misssao")
    private String misssao;

    @Column(name = "tx_visao")
    private String visao;

    @Column(name = "tx_valores")
    private String valores;


    public InstituicaoModel(Instituicao o) {
        this.id = o.id();
        this.nome = o.nome();
        this.area_atuacao = o.area_atuacao();
        this.cnpj = o.cnpj();
        this.site = o.site();
        this.modalidade = o.modalidade();
        this.cep = o.cep();
        this.numero_endereco = o.numero_endereco();
        this.perfil_instagram = o.perfil_instagram();
        this.perfil_facebook = o.perfil_facebook();
        this.perfil_linkedin = o.perfil_linkedin();
        this.perfil_twitter = o.perfil_twitter();
        this.email = o.email();
        this.telefone = o.telefone();
        this.descricao = o.descricao();
        this.misssao = o.misssao();
        this.visao = o.visao();
        this.valores = o.valores();
    }

    public Instituicao to() {
        return Instituicao.builder()
            .id(id)
            .nome(nome)
            .area_atuacao(area_atuacao)
            .cnpj(cnpj)
            .site(site)
            .modalidade(modalidade)
            .cep(cep)
            .numero_endereco(numero_endereco)
            .perfil_instagram(perfil_instagram)
            .perfil_facebook(perfil_facebook)
            .perfil_linkedin(perfil_linkedin)
            .perfil_twitter(perfil_twitter)
            .email(email)
            .telefone(telefone)
            .descricao(descricao)
            .misssao(misssao)
            .visao(visao)
            .valores(valores)
            .build();
    }

}
