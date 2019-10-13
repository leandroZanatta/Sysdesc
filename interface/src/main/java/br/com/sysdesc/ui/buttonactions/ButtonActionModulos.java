package br.com.sysdesc.ui.buttonactions;

import java.awt.event.KeyEvent;

import br.com.sysdesc.pesquisa.components.buttonactions.ButtonAction;

public class ButtonActionModulos extends ButtonAction {

	private static final long serialVersionUID = 1L;

	public ButtonActionModulos() {

		super("mapModulos", KeyEvent.VK_M, KeyEvent.VK_CONTROL, "module.png", "Módulos");
	}

	@Override
	public void saveEvent() {
		setEnabled(Boolean.TRUE);
	}

	@Override
	public void editEvent() {
		setEnabled(Boolean.FALSE);
	}

	@Override
	public void newEvent() {
		setEnabled(Boolean.FALSE);
	}

	@Override
	public void searchEvent() {
		setEnabled(Boolean.TRUE);
	}

	@Override
	public void startEvent() {
		setEnabled(Boolean.FALSE);
	}

}
