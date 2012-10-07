package br.com.daemonXmltv.daemon;

import java.io.InputStream;

import br.com.daemonXmltv.daemon.exception.WgetException;

/**
 * Classe tem a mesma finalidade do comando wget, mas nao é executado nativamente e sim
 * usando a api HttpClient da apache.
 *  
 * @author wagner
 *
 */
public interface Wget {

	
	/**
	 * Pega o conteudo de uma ulr
	 * @param url destino
	 * @return Retorno da pagina.
	 * @throws WgetException Caso de algum problema no acesso a url.
	 */
	InputStream get(String url) throws WgetException;

}
