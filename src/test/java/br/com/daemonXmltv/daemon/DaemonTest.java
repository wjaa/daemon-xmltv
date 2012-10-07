package br.com.daemonXmltv.daemon;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import br.com.daemonXmltv.daemon.Daemon;
import br.com.daemonXmltv.daemon.exception.DaemonException;


/**
 * 
 * @author wagner
 *
 */
@ContextConfiguration(locations = {"classpath:/xmlconsumer-context.xml"})
public class DaemonTest extends AbstractJUnit4SpringContextTests {

	
	
	
	@Autowired
	private Daemon daemon;
	
	@Test
	public void start() {
		try{
			this.daemon.start();
		}catch(DaemonException ex){
			fail("Erro ao buscar iniciar o daemon");
		}
	}

}
