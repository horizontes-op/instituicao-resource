
CREATE TABLE  instituicao (
    id_instituicao VARCHAR(36) PRIMARY KEY,
    tx_nome VARCHAR(255) NOT NULL,
    tx_area_atuacao VARCHAR(255),
    tx_cnpj VARCHAR(255),
    tx_site VARCHAR(255),
    tx_modalidade VARCHAR(255),
    tx_cep VARCHAR(255) NOT NULL,
    tx_numero_endereco VARCHAR(10),

    tx_perfil_instagram VARCHAR(255),
    tx_perfil_facebook VARCHAR(255),
    tx_perfil_linkedin VARCHAR(255),
    tx_perfil_twitter VARCHAR(255),

    tx_email VARCHAR(255) NOT NULL,
    tx_telefone VARCHAR(255),
    tx_descricao VARCHAR(255) NOT NULL,
    tx_misssao VARCHAR(255),
    tx_visao VARCHAR(255),
    tx_valores VARCHAR(255)

);
