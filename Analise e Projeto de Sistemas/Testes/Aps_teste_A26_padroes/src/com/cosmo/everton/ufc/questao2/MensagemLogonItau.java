package com.cosmo.everton.ufc.questao2;

import java.awt.Toolkit;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class MensagemLogonItau extends MensagemLogon {

	protected MensagemLogonItau(String logo, String mensagem) {
		super(logo, mensagem);
		
	}

	@Override
	void mostraTelaGrafica() {
		byte[] imageDados = stringToByte(logo);
		
		FileOutputStream imagemSaida = null;
		
		try {
			imagemSaida = new FileOutputStream(new File("itau.png"));
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			imagemSaida.write(imageDados);
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			imagemSaida.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		Icon figure = new ImageIcon(Toolkit.getDefaultToolkit().createImage("itau.png"));
	
		JOptionPane.showMessageDialog(null,"Bem-vindo","Itau",JOptionPane.PLAIN_MESSAGE,figure);
		
		System.out.println(this.getMensagem());


	}

}
