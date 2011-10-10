
package services.v1.tudelft.atlantis.st.ewi.tudelft.nl.exchangeservice.impl;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;

import com.google.gson.Gson;

import services.v1.tudelft.atlantis.st.ewi.tudelft.nl.ExchCurrencyRequest;
import services.v1.tudelft.atlantis.st.ewi.tudelft.nl.ExchCurrencyResponse;
import services.v1.tudelft.atlantis.st.ewi.tudelft.nl.exchangeservice.ExchangeServiceV1;

public class ExchangeServiceV1Impl
    implements ExchangeServiceV1
{


    public ExchCurrencyResponse exchCurrency(ExchCurrencyRequest param0){
    	   	
    	String google = "http://www.google.com/ig/calculator?hl=en&q=";
	    String charset = "UTF-8";
	    String result = null;
	    
	    String baseCurrency = param0.getBaseType();
	    String termCurrency = param0.getTermtype();
	    int exchangedValue = param0.getExchAmount();
	    
	    		
		try {
			
			URL url = new URL(google + exchangedValue + baseCurrency + "%3D%3F" + termCurrency);	

		    Reader reader = new InputStreamReader(url.openStream(), charset);
		    Result res = new Gson().fromJson(reader, Result.class);
	
		    // Get the value without the term currency.
		    result = res.getRhs().split("\\s+")[0];
	    
		} catch (IOException e) {
			e.printStackTrace();
		}
	    
	    ExchCurrencyResponse exResp = new ExchCurrencyResponse();
	    exResp.setResult(result);    	
    	
        return exResp;
    }

}
