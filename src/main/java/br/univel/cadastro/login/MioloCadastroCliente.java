package br.univel.cadastro.login;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.Insets;

public class MioloCadastroCliente extends JPanel {
	protected JTextField txfid;
	protected JTextField txfnome;
	protected JTextField txfend;
	protected JTextField txftel;
	protected JTextField txfcidade;

	/**
	 * Create the panel.
	 */
	public MioloCadastroCliente() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblId = new JLabel("ID:");
		GridBagConstraints gbc_lblId = new GridBagConstraints();
		gbc_lblId.insets = new Insets(0, 0, 5, 5);
		gbc_lblId.anchor = GridBagConstraints.EAST;
		gbc_lblId.gridx = 0;
		gbc_lblId.gridy = 0;
		add(lblId, gbc_lblId);
		
		txfid = new JTextField();
		GridBagConstraints gbc_txfid = new GridBagConstraints();
		gbc_txfid.insets = new Insets(0, 0, 5, 0);
		gbc_txfid.fill = GridBagConstraints.HORIZONTAL;
		gbc_txfid.gridx = 1;
		gbc_txfid.gridy = 0;
		add(txfid, gbc_txfid);
		txfid.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome:");
		GridBagConstraints gbc_lblNome = new GridBagConstraints();
		gbc_lblNome.anchor = GridBagConstraints.EAST;
		gbc_lblNome.insets = new Insets(0, 0, 5, 5);
		gbc_lblNome.gridx = 0;
		gbc_lblNome.gridy = 1;
		add(lblNome, gbc_lblNome);
		
		txfnome = new JTextField();
		GridBagConstraints gbc_txfnome = new GridBagConstraints();
		gbc_txfnome.insets = new Insets(0, 0, 5, 0);
		gbc_txfnome.fill = GridBagConstraints.HORIZONTAL;
		gbc_txfnome.gridx = 1;
		gbc_txfnome.gridy = 1;
		add(txfnome, gbc_txfnome);
		txfnome.setColumns(10);
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o:");
		GridBagConstraints gbc_lblEndereo = new GridBagConstraints();
		gbc_lblEndereo.anchor = GridBagConstraints.EAST;
		gbc_lblEndereo.insets = new Insets(0, 0, 5, 5);
		gbc_lblEndereo.gridx = 0;
		gbc_lblEndereo.gridy = 2;
		add(lblEndereo, gbc_lblEndereo);
		
		txfend = new JTextField();
		GridBagConstraints gbc_txfend = new GridBagConstraints();
		gbc_txfend.insets = new Insets(0, 0, 5, 0);
		gbc_txfend.fill = GridBagConstraints.HORIZONTAL;
		gbc_txfend.gridx = 1;
		gbc_txfend.gridy = 2;
		add(txfend, gbc_txfend);
		txfend.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Telefone:");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 3;
		add(lblNewLabel, gbc_lblNewLabel);
		
		txftel = new JTextField();
		GridBagConstraints gbc_txftel = new GridBagConstraints();
		gbc_txftel.insets = new Insets(0, 0, 5, 0);
		gbc_txftel.fill = GridBagConstraints.HORIZONTAL;
		gbc_txftel.gridx = 1;
		gbc_txftel.gridy = 3;
		add(txftel, gbc_txftel);
		txftel.setColumns(10);
		
		JLabel lblCidade = new JLabel("Cidade");
		GridBagConstraints gbc_lblCidade = new GridBagConstraints();
		gbc_lblCidade.anchor = GridBagConstraints.EAST;
		gbc_lblCidade.insets = new Insets(0, 0, 0, 5);
		gbc_lblCidade.gridx = 0;
		gbc_lblCidade.gridy = 4;
		add(lblCidade, gbc_lblCidade);
		
		txfcidade = new JTextField();
		GridBagConstraints gbc_txfcidade = new GridBagConstraints();
		gbc_txfcidade.fill = GridBagConstraints.HORIZONTAL;
		gbc_txfcidade.gridx = 1;
		gbc_txfcidade.gridy = 4;
		add(txfcidade, gbc_txfcidade);
		txfcidade.setColumns(10);

	}

}
