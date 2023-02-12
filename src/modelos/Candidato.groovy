package modelos

class Candidato {
    String nome
    String email
    String cpf
    int idade
    String estado
    int cep
    String descricaoPessoal
    List<String> competencias

    String toString() {
        "Nome: ${nome}\nE-mail: ${email}\nCPF: ${cpf}\nIdade: ${idade}\nEstado: ${estado}\nCEP: ${cep}\nDescrição Pessoal: ${descricaoPessoal}\nCompetências: ${competencias.join(', ')}\n"
    }
}
