
package services.v1.tudelft.atlantis.st.ewi.tudelft.nl.exchangeservice.test;

import junit.framework.TestCase;
import org.ebayopensource.turmeric.runtime.common.exceptions.ServiceException;
import org.ebayopensource.turmeric.runtime.sif.service.Service;
import org.ebayopensource.turmeric.runtime.sif.service.ServiceFactory;
import services.v1.tudelft.atlantis.st.ewi.tudelft.nl.ExchCurrencyResponse;
import services.v1.tudelft.atlantis.st.ewi.tudelft.nl.exchangeservice.ExchangeServiceV1;

public class ExchangeServiceV1Test
    extends TestCase
{

    private ExchangeServiceV1 m_proxy = null;

    public ExchangeServiceV1Test(String testcaseName) {
        super(testcaseName);
    }

    private ExchangeServiceV1 getProxy()
        throws ServiceException
    {
        if (m_proxy == null) {
            String svcAdminName = "ExchangeServiceV1";
            String envName = "production";
            String clientName = "ExchangeServiceV1_Test";
            Service service = ServiceFactory.create(svcAdminName, envName, clientName, null);
            m_proxy = service.getProxy();
        }
        return m_proxy;
    }

    public void testExchCurrency()
        throws Exception
    {
        ExchCurrencyResponse result = null;
        // TODO: REPLACE PARAMETER(S) WITH ACTUAL VALUE(S)
        result = getProxy().exchCurrency(null);
        if (result == null) {
            throw new Exception("Response is Null");
        }
        // TODO: FIX FOLLOWING ASSERT STATEMENT
        assertTrue(false);
    }

}
