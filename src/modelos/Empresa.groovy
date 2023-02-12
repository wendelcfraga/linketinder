package modelos

import groovy.transform.ToString

@ToString
class Empresa {
    String nome
    String emailCorporativo
    String cnpj
    String pais
    String estado
    int cep
    String descricaoEmpresa
    List<String> competencias
}

