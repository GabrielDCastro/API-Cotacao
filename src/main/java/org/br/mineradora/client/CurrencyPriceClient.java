package org.br.mineradora.client;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import org.br.mineradora.dto.CurrencyPriceDTO;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@Path("/last")
@RegisterRestClient //Permite que a gente registre esse serviço como uma aplicação rest
@ApplicationScoped //Diz que a interface faz parte do quarkus framework
public interface CurrencyPriceClient {

    @GET
    @Path("/{pair}") //o que está entre {} é variável
    CurrencyPriceDTO getPriceByPair(@PathParam("pair") String pair);
    //esse método vai trazer um objeto do tipo PriceDTO, mas o PriceDTO é um USDBRL
}
