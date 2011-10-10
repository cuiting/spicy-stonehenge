
package services.v1.tudelft.atlantis.st.ewi.tudelft.nl.exchangeservice.impl.gen;

import org.ebayopensource.turmeric.runtime.common.exceptions.ServiceException;
import org.ebayopensource.turmeric.runtime.common.pipeline.Message;
import org.ebayopensource.turmeric.runtime.common.pipeline.MessageContext;
import org.ebayopensource.turmeric.runtime.spf.impl.internal.pipeline.BaseServiceRequestDispatcher;
import services.v1.tudelft.atlantis.st.ewi.tudelft.nl.ExchCurrencyRequest;
import services.v1.tudelft.atlantis.st.ewi.tudelft.nl.ExchCurrencyResponse;
import services.v1.tudelft.atlantis.st.ewi.tudelft.nl.exchangeservice.ExchangeServiceV1;


/**
 * Note : Generated file, any changes will be lost upon regeneration.
 * 
 */
public class ExchangeServiceV1RequestDispatcher
    extends BaseServiceRequestDispatcher<ExchangeServiceV1>
{


    public ExchangeServiceV1RequestDispatcher() {
        super(ExchangeServiceV1 .class);
        addSupportedOperation("exchCurrency", new Class[] {ExchCurrencyRequest.class }, new Class[] {ExchCurrencyResponse.class });
    }

    public boolean dispatch(MessageContext param0, ExchangeServiceV1 param1)
        throws ServiceException
    {
        MessageContext msgCtx = param0;
        ExchangeServiceV1 service = param1;
        String operationName = msgCtx.getOperationName();
        Message requestMsg = msgCtx.getRequestMessage();
         
        if ("exchCurrency".equals(operationName)) {
            ExchCurrencyRequest param2 = ((ExchCurrencyRequest) requestMsg.getParam(0));
            try {
                Message responseMsg = msgCtx.getResponseMessage();
                ExchCurrencyResponse result = service.exchCurrency(param2);
                responseMsg.setParam(0, result);
            } catch (Throwable th) {
                handleServiceException(msgCtx, th);
            }
            return true;
        }
        return false;
    }

}
