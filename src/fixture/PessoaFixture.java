package fixture;

import domain.entities.Pessoa;
import domain.entities.Sexo;

import java.time.LocalDate;

public class PessoaFixture {
    public static PessoaFixture criarPessoaDeTeste() {
        Pessoa criarPessoaDeTeste = new Pessoa("José",
                "111",
                LocalDate.of(1989,10,10),
                Sexo.MASCULINO);
        //return criarPessoaDeTeste;
        return null;
    }
}
