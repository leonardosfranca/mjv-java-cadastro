package fixture;

import domain.entities.Endereco;

public class EnderecoFixture {
    public static EnderecoFixture criaEndereco() {
        Endereco endereco = new Endereco("Rua P",
                "11",
                "Felicidade",
                "Ceu",
                "São José de Ribamar");
//        return endereco;
        return null;
    }

}
