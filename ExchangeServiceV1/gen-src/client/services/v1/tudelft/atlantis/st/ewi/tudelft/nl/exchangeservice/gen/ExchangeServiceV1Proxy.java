
package services.v1.tudelft.atlantis.st.ewi.tudelft.nl.exchangeservice.gen;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import javax.xml.ws.AsyncHandler;
import javax.xml.ws.Dispatch;
import javax.xml.ws.Response;
import org.ebayopensource.turmeric.runtime.common.exceptions.ServiceInvocationException;
import org.ebayopensource.turmeric.runtime.sif.impl.internal.service.BaseServiceProxy;
import org.ebayopensource.turmeric.runtime.sif.service.Service;
import services.v1.tudelft.atlantis.st.ewi.tudelft.nl.ExchCurrencyRequest;
import services.v1.tudelft.atlantis.st.ewi.tudelft.nl.ExchCurrencyResponse;
import services.v1.tudelft.atlantis.st.ewi.tudelft.nl.exchangeservice.AsyncExchangeServiceV1;


/**
 * Note : Generated file, any changes will be lost upon regeneration.
 * 
 */
public class ExchangeServiceV1Proxy
    extends BaseServiceProxy<AsyncExchangeServiceV1>
    implements AsyncExchangeServiceV1
{


    public ExchangeServiceV1Proxy(Service service) {
        super(service);
    }

    public Future<?> exchCurrencyAsync(ExchCurrencyRequest param0, AsyncHandler<ExchCurrencyResponse> param1) {
        Dispatch dispatch = m_service.createDispatch("exchCurrency");
        Future<?> result = dispatch.invokeAsync(param0, param1);
        return result;
    }

    public Response<ExchCurrencyResponse> exchCurrencyAsync(ExchCurrencyRequest param0) {
        Dispatch dispatch = m_service.createDispatch("exchCurrency");
        Response<ExchCurrencyResponse> result = dispatch.invokeAsync(param0);
        return result;
    }

    public List<Response<?>> poll(boolean block, boolean partial)
        throws InterruptedException
    {
        return m_service.poll(block, partial);
    }

    public ExchCurrencyResponse exchCurrency(ExchCurrencyRequest param0) {
        Object[] params = new Object[ 1 ] ;
        params[ 0 ] = param0;
        List<Object> returnParamList = new ArrayList<Object>();
        try {
            m_service.invoke("exchCurrency", params, returnParamList);
        } catch (ServiceInvocationException svcInvocationEx) {
            throw wrapInvocationException(svcInvocationEx);
        }
        ExchCurrencyResponse result = ((ExchCurrencyResponse) returnParamList.get(0));
        return result;
    }

}
