package main;

import operaciones.OpBasicas;


import java.util.Properties;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.varia.NullAppender;

import operaciones.Comprar;

public class Main {
	
	
	public static Logger logger = LogManager.getLogger(Main.class);

	String log4JPropertyFile = "resources/log4j.properties";
	Properties p = new Properties();
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		org.apache.log4j.BasicConfigurator.configure(new NullAppender());

		OpBasicas inicio = new OpBasicas();

		inicio.inicio();

		Comprar comprar = new Comprar();

		comprar.comprarAleatorio(OpBasicas.vagon);

		comprar.comprarAleatorio(OpBasicas.vagon);

		//inicio.limpiar();

		comprar.comprarAleatorio(OpBasicas.vagon);

		comprar.comprarAleatorio(OpBasicas.vagon);

		comprar.comprarNominal(OpBasicas.vagon);

		comprar.comprarAleatorio(OpBasicas.vagon);

		comprar.comprarAleatorio(OpBasicas.vagon);

		comprar.comprarAleatorio(OpBasicas.vagon);

		comprar.comprarAleatorio(OpBasicas.vagon);
		
	}

}
