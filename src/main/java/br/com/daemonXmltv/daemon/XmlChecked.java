package br.com.daemonXmltv.daemon;

import java.io.InputStream;


/**
 * Faz a checagem do xml.
 * 
 * @author wagner
 *
 */
public interface XmlChecked {
	
	/**
	 * Verifica se a existencia de uma nova versão do xml.
	 * @return true caso exista e false caso contrario.
	 */
	boolean existsNewVersion();
	
	/**
	 * Retorna o xml consultado.
	 * @return Xml
	 */
	InputStream getXml();
	
	

}
