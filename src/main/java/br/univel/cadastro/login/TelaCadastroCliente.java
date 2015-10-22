package br.univel.cadastro.login;

import java.awt.BorderLayout;

import javax.swing.JPanel;

public class TelaCadastroCliente extends MolduraAbstrata {

	/**
	 * Extende de MolduraAbstrata
	 * Configura o MioloCadastroCliente e o DAOCLiente na mesma classe
	 */
	public TelaCadastroCliente() {

	}

	@Override
	protected void configuraMiolo() {
		super.add(new MioloCadastroCliente(), BorderLayout.CENTER);
	}

}
