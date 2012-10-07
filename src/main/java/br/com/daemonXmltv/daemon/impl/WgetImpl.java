package br.com.daemonXmltv.daemon.impl;

import java.io.InputStream;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.springframework.stereotype.Component;

import br.com.daemonXmltv.daemon.Wget;
import br.com.daemonXmltv.daemon.exception.WgetException;

/**
 *  
 * @author wagner
 *
 */
@Component
public class WgetImpl implements Wget {

	private static Log LOG = LogFactory.getLog(WgetImpl.class);
	
	/**
	 * {@inheritDoc}
	 */
	public InputStream get(String url) throws WgetException{
		HttpClient client = new DefaultHttpClient();
		HttpGet get =  new HttpGet(url);
		try {
			HttpResponse response = client.execute(get);
			
			if ( response.getStatusLine().getStatusCode() == 200 ){
				return response.getEntity().getContent();
			}else{
				throw new Exception("Metodo GET nao retornou 200, status code = " + response.getStatusLine().getStatusCode());
			}
		}catch(Exception e){
			LOG.error("Erro ao executar o WGET:", e);
			throw new WgetException("Erro ao acessar a url [" + url + "]");
		}
	}

}
