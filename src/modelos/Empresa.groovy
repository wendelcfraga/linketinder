package modelos

class Empresa {
    String nome
    String emailCorporativo
    String cnpj
    String pais
    String estado
    int cep
    String descricaoEmpresa
    List<String> competencias

    String toString() {
        "Nome: ${nome}\nE-mail Corporativo: ${emailCorporativo}\nCNPJ: ${cnpj}\nPaís: ${pais}\nEstado: ${estado}\nCEP: ${cep}\nDescrição da Empresa: ${descricaoEmpresa}\nCompetências: ${competencias.join(', ')}\n"
    }
}

