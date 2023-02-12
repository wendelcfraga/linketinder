import modelos.Empresa
import modelos.Candidato

class Main {
    def candidatos = [
            new Candidato(
                    nome: "Fulano de Tal",
                    email: "fulano@gmail.com",
                    cpf: "123.456.789-00",
                    idade: 27,
                    estado: "São Paulo",
                    cep: 123456,
                    descricaoPessoal: "Sou um desenvolvedor full-stack com experiência em Python e React.",
                    competencias: ["Python", "React", "Django", "PostgreSQL"]
            ),
            new Candidato(
                    nome: "Beltrano da Silva",
                    email: "beltrano@gmail.com",
                    cpf: "987.654.321-00",
                    idade: 31,
                    estado: "Rio de Janeiro",
                    cep: 654321,
                    descricaoPessoal: "Sou um desenvolvedor front-end com experiência em Angular e TypeScript.",
                    competencias: ["Angular", "TypeScript", "JavaScript", "HTML", "CSS"]
            ),
            new Candidato(
                    nome: "Ciclano da Rocha",
                    email: "ciclano@gmail.com",
                    cpf: "456.789.123-00",
                    idade: 25,
                    estado: "Minas Gerais",
                    cep: 789123,
                    descricaoPessoal: "Sou um cientista de dados com experiência em Python e R.",
                    competencias: ["Python", "R", "Pandas", "Scikit-learn", "NumPy"]
            ),
            new Candidato(
                    nome: "Amanda Souza",
                    email: "amanda.souza@gmail.com",
                    cpf: "987.654.321-11",
                    idade: 26,
                    estado: "São Paulo",
                    cep: 123456,
                    descricaoPessoal: "Sou uma desenvolvedora back-end com experiência em Java e Spring.",
                    competencias: ["Java", "Spring", "Hibernate", "SQL", "Git"]
            ),
            new Candidato(
                    nome: "José Silva",
                    email: "jose.silva@gmail.com",
                    cpf: "123.456.789-01",
                    idade: 29,
                    estado: "Bahia",
                    cep: 987654,
                    descricaoPessoal: "Sou um desenvolvedor full-stack com experiência em Ruby on Rails e Angular.",
                    competencias: ["Ruby on Rails", "Angular", "JavaScript", "MySQL", "Git"]
            )
    ]

    def empresas = [
            new Empresa(
                    nome: "ACME Inc.",
                    emailCorporativo: "contato@acme.com",
                    cnpj: "12.345.678/0001-90",
                    pais: "Brasil",
                    estado: "São Paulo",
                    cep: 123456,
                    descricaoEmpresa: "A ACME Inc. é uma empresa líder em tecnologia e inovação.",
                    competencias: ["Python", "Java", "Angular", "React", "DevOps"]
            ),
            new Empresa(
                    nome: "Tech Solutions",
                    emailCorporativo: "contato@techsolutions.com",
                    cnpj: "98.765.432/0001-21",
                    pais: "Brasil",
                    estado: "Rio de Janeiro",
                    cep: 654321,
                    descricaoEmpresa: "A Tech Solutions é uma empresa de tecnologia focada em soluções empresariais.",
                    competencias: ["Java", "Spring", "JavaScript", "React", "AWS"]
            ),
            new Empresa(
                    nome: "Inovatech",
                    emailCorporativo: "contato@inovatech.com",
                    cnpj: "11.223.344/0001-55",
                    pais: "Brasil",
                    estado: "Minas Gerais",
                    cep: 789123,
                    descricaoEmpresa: "A Inovatech é uma startup de tecnologia com foco em inovação.",
                    competencias: ["Python", "Django", "JavaScript", "React", "MySQL"]
            ),
            new Empresa(
                    nome: "DevTech",
                    emailCorporativo: "contato@devtech.com",
                    cnpj: "66.777.888/0001-22",
                    pais: "Brasil",
                    estado: "São Paulo",
                    cep: 123456,
                    descricaoEmpresa: "A DevTech é uma empresa de tecnologia especializada em desenvolvimento de software.",
                    competencias: ["Java", "Spring", "Hibernate", "Angular", "PostgreSQL"]
            ),
            new Empresa(
                    nome: "Agiliza TI",
                    emailCorporativo: "contato@agilizati.com",
                    cnpj: "99.888.777/0001-33",
                    pais: "Brasil",
                    estado: "Bahia",
                    cep: 987654,
                    descricaoEmpresa: "A Agiliza TI é uma consultoria de tecnologia especializada em projetos ágeis.",
                    competencias: ["Java", "Spring", "Angular", "MySQL", "DevOps"]
            )
    ]

    static def lerString(texto) {
        print "$texto: "
        return new Scanner(System.in).nextLine()
    }

    static def lerInt(texto) {
        print "$texto: "
        return new Scanner(System.in).nextInt()
    }

    def listarCandidatos() {
        println "Candidatos cadastrados:"
        candidatos.eachWithIndex { candidato, index ->
            println "${index + 1}) ${candidato.nome}, ${candidato.email}, ${candidato.cpf}, ${candidato.idade}, ${candidato.estado}, ${candidato.cep}, ${candidato.descricaoPessoal}, competências: ${candidato.competencias}"
        }
        println ""
    }

    def listarEmpresas() {
        println "Empresas cadastradas:"
        empresas.eachWithIndex { empresa, index ->
            println "${index + 1}) ${empresa.nome}, ${empresa.emailCorporativo}, ${empresa.cnpj}, ${empresa.pais}, ${empresa.estado}, ${empresa.cep}, ${empresa.descricaoEmpresa}, competências desejadas: ${empresa.competencias}"
        }
        println ""
    }

    def adicionarCandidato() {
        println "Novo candidato:"
        def nome = lerString("Nome")
        def email = lerString("Email")
        def cpf = lerString("CPF")
        def idade = lerInt("Idade")
        def estado = lerString("Estado")
        def cep = lerInt("CEP")
        def descricaoPessoal = lerString("Descrição pessoal")
        def competencias = lerString("Competências (separadas por vírgula)").split(",")
        candidatos << new Candidato(nome: nome, email: email, cpf: cpf, idade: idade, estado: estado, cep: cep, descricaoPessoal: descricaoPessoal, competencias: competencias)
        println "Candidato adicionado com sucesso."
        println ""
    }

    def adicionarEmpresa() {
        println "Nova empresa:"
        def nome = lerString("Nome")
        def emailCorporativo = lerString("Email corporativo")
        def cnpj = lerString("CNPJ")
        def pais = lerString("País")
        def estado = lerString("Estado")
        def cep = lerInt("CEP")
        def descricaoEmpresa = lerString("Descrição da empresa")
        def competencias = lerString("Competências desejadas (separadas por vírgula)").split(",")
        empresas << new Empresa(nome: nome, emailCorporativo: emailCorporativo, cnpj: cnpj, pais: pais, estado: estado, cep: cep, descricaoEmpresa: descricaoEmpresa, competencias: competencias)
        println "Empresa adicionada com sucesso."
        println ""
    }

    def menu() {
        loopMenu:
        while (true) {
            println "LinkeTinder!"
            println "Selecione uma opção:"
            println "1 - Listar candidatos"
            println "2 - Listar empresas"
            println "3 - Adicionar candidato"
            println "4 - Adicionar empresa"
            println "5 - Sair"
            def opcao = lerInt("Opção")
            switch (opcao) {
                case 1:
                    listarCandidatos()
                    break
                case 2:
                    listarEmpresas()
                    break
                case 3:
                    adicionarCandidato()
                    break
                case 4:
                    adicionarEmpresa()
                    break
                case 5:
                    break loopMenu
                default:
                    println "Opção inválida."
                    println ""
            }
        }
    }

    def static main(args) {
        def main = new Main()
        main.menu()
    }
}