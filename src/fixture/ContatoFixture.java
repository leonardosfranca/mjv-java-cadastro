package fixture;

import domain.entities.Contato;

public class ContatoFixture {
    public static ContatoFixture criaContato() {
        Contato contato = new Contato("jose@mjvschool.com",
                "(098) 3231-3231 ",
                "(098) 98845-5565",
                true);
        //return contato;
        return null;
    }

}
