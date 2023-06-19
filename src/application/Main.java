package application;



import file.Cadastrar;
import fixture.*;


public class Main {
    public static void main(String[] args) {

        Cadastrar cadastrar = new Cadastrar();
        String url = "file/nome.csv";
        cadastrar.CadastrarNomes(PessoaFixture.criarPessoaDeTeste(), ContatoFixture.criaContato(),
                EnderecoFixture.criaEndereco(), DadosProfissionalFixture.criarDadosProfissionais(),
                HabilidadesFixture.criaHabilidades(), PretencaoSalariaFixture.criaPretencaoSalarial(), url);

        System.out.println("Arquivo foi gerado com sucesso!");
    }
}