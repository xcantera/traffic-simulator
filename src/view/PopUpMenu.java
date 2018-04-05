package view;

import event.constructor.EventConstructor;
import util.EventParser;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PopUpMenu extends JPopupMenu{

	public PopUpMenu(MainWindow mainWindow){

		JMenu templates = new JMenu("New template");
		this.add(templates);

		// Agregar las opciones con sus listeners
		for(EventConstructor eventConstructor : EventParser.getEvents()){
			JMenuItem menuItem = new JMenuItem(eventConstructor.toString());
			menuItem.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					mainWindow.insert(eventConstructor.template() + System.lineSeparator());
				}
			});
			templates.add(menuItem);
		}
	}
}