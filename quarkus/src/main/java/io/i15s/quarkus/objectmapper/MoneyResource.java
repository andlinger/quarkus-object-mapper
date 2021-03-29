package io.i15s.quarkus.objectmapper;

import org.javamoney.moneta.Money;

import javax.enterprise.context.RequestScoped;
import javax.money.Monetary;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@RequestScoped
@Path("/money")
public class MoneyResource {

    @GET
    public Response get() {
        var money = Money.zero(Monetary.getCurrency("EUR"));

        return Response.ok(money)
                .build();
    }
}
