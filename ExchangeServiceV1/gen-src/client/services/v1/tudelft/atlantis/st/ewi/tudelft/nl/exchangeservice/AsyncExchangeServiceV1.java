
package services.v1.tudelft.atlantis.st.ewi.tudelft.nl.exchangeservice;

import java.util.List;
import java.util.concurrent.Future;
import javax.xml.ws.AsyncHandler;
import javax.xml.ws.Response;
import services.v1.tudelft.atlantis.st.ewi.tudelft.nl.ExchCurrencyRequest;
import services.v1.tudelft.atlantis.st.ewi.tudelft.nl.ExchCurrencyResponse;

public interface AsyncExchangeServiceV1
    extends ExchangeServiceV1
{


    public Future<?> exchCurrencyAsync(ExchCurrencyRequest param0, AsyncHandler<ExchCurrencyResponse> handler);

    public Response<ExchCurrencyResponse> exchCurrencyAsync(ExchCurrencyRequest param0);

    public List<Response<?>> poll(boolean block, boolean partial)
        throws InterruptedException
    ;

}
