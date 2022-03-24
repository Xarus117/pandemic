package panel;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;

public class Marco extends JFrame {

	PanelPrincipal MenuPrincipal;
	Dimension tamaņoPantalla;

	Marco() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Fin del programa al pulsar la X
		setTitle("BIOHAZARD, PANDEMIC");
		Image Logo = Toolkit.getDefaultToolkit().getImage("imagenes\\Logo.png");
        setIconImage(Logo);
		setResizable(false);//Pa k no se pueda maximizar la pantalla
		this.tamaņoPantalla = Toolkit.getDefaultToolkit().getScreenSize();
		setSize(1280,920);
		MenuPrincipal = new PanelPrincipal();
		add(MenuPrincipal);
		setVisible(true);// Modificar la visibilidad del marco
	}
}
