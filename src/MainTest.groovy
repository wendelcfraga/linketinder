import spock.lang.Specification

class MainTest extends Specification {

    def "adicionar candidato"() {
        given:
        def cadastro = new Main()

        when:
        cadastro.adicionarCandidato("João", "joao@teste.com", "12345678900", 30, "SP", 12345678, "Gosto de programar", ["Java", "Python"])

        then:
        cadastro.candidatos.size() == 6
        def joao = cadastro.candidatos.find { it.nome == "João" }
        joao.email == "joao@teste.com"
        joao.cpf == "12345678900"
        joao.idade == 30
        joao.estado == "SP"
        joao.cep == 12345678
        joao.descricaoPessoal == "Gosto de programar"
        joao.competencias == ["Java", "Python"]
    }

    def "adicionar empresa"() {
        given:
        def cadastro = new Main()

        when:
        cadastro.adicionarEmpresa("Empresa Teste", "empresa@teste.com", "12345678901234", "Brasil", "SP", 12345678, "Empresa de TI", ["Java", "Python"])

        then:
        cadastro.empresas.size() == 6
        def empresaTeste = cadastro.empresas.find { it.nome == "Empresa Teste" }
        empresaTeste.emailCorporativo == "empresa@teste.com"
        empresaTeste.cnpj == "12345678901234"
        empresaTeste.pais == "Brasil"
        empresaTeste.estado == "SP"
        empresaTeste.cep == 12345678
        empresaTeste.descricaoEmpresa == "Empresa de TI"
        empresaTeste.competencias == ["Java", "Python"]
    }
}
