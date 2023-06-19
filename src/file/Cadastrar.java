package file;

import fixture.*;

import java.io.File;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Cadastrar {

    public void CadastrarNomes(PessoaFixture pessoaFixture, ContatoFixture contatoFixture, EnderecoFixture enderecoFixture,
                               DadosProfissionalFixture dadosProfissionalFixture, HabilidadesFixture habilidadesFixture,
                               PretencaoSalariaFixture pretencaoSalariaFixture, String url) {
        CriarArquivo(url);
        try {
            List<String> existentes = LinhaExistentes(url);
            String linha = pessoaFixture + "; " + contatoFixture + "; " + enderecoFixture + "; " + dadosProfissionalFixture
                    + "; " + habilidadesFixture + "; " + pretencaoSalariaFixture;
            existentes.add(linha);

            String todasAsLinhas = UnicaLinha(existentes);
            FileWriter arquivo = new FileWriter(url);
            arquivo.write(todasAsLinhas);
            arquivo.close();

        }catch (Exception error) {
            System.out.println("Erro ao gerar o arquivo " + url);
        }

    }
    public String UnicaLinha(List<String> existentes) {
        String unicaLinha = "";
        for (String linha : existentes) {
            unicaLinha += linha + "\n";
        }
        return unicaLinha;
    }
    public void CriarArquivo(String url) {
        try {
            File arquivo = new File(url);
            arquivo.createNewFile();

        }catch (Exception erro) {
            System.out.println("Erro ao criar arquivo");
        }
    }
    public List<String> LinhaExistentes(String url) {
        List<String> result = new ArrayList<>();

        try {
            Path path = Paths.get(url);
            result = Files.readAllLines(path);

        }catch (Exception erro) {
            System.out.println("Erro ao criar arquivo");
        }


        return result;
    }
}
