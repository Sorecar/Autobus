package com.servicio;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@EnableWs
@Configuration
@ComponentScan
public class Configuracion extends WsConfigurerAdapter {

	@Bean

	public XsdSchema Schema() {
		return new SimpleXsdSchema(new ClassPathResource("autobus.xsd"));
	}

	@Bean
	public ServletRegistrationBean messageDispatcherServlet(ApplicationContext applicationContext) {
		MessageDispatcherServlet servlet = new MessageDispatcherServlet();
		servlet.setApplicationContext(applicationContext);
		servlet.setTransformWsdlLocations(true);
		return new ServletRegistrationBean(servlet, "/*");
	}

	@Bean(name = "autobus")
	public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema AutobusSchema) {
		DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
		wsdl11Definition.setPortTypeName("autobusPort");
		wsdl11Definition.setLocationUri("/autobus");
		wsdl11Definition.setTargetNamespace("http://www.servicio.com/autobus");
		wsdl11Definition.setSchema(AutobusSchema);
		return wsdl11Definition;
	}
}