package br.com.daemonXmltv.daemon;

import java.io.InputStream;

import junit.framework.Assert;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import br.com.daemonXmltv.daemon.Wget;
import br.com.daemonXmltv.daemon.exception.WgetException;

/**
 * 
 * @author wagner
 *
 */
@ContextConfiguration(locations = {"classpath:/xmlconsumer-context.xml"})
public class WgetTest extends AbstractJUnit4SpringContextTests{

	@Autowired
	private Wget wget;
	
	@Test
	public void testGet() {
		
		try {
			InputStream in = this.wget.get("http://bankline.itau.com.br");
			Assert.assertNotNull(in);
		} catch (WgetException e) {
			Assert.fail("Falha no teste:" + e.getMessage());
		}
	}

}
