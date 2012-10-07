package br.com.daemonXmltv.daemon;

import br.com.daemonXmltv.daemon.exception.DaemonException;


/**
 * 
 * @author wagner
 *
 */
public interface Daemon{

	void start() throws DaemonException;
	

}
