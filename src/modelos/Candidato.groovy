package modelos

import groovy.transform.ToString

@ToString
class Candidato {
    String nome
    String email
    String cpf
    int idade
    String estado
    int cep
    String descricaoPessoal
    List<String> competencias
}
