package Limpeza;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class Metodo {
	public void limpa() {
		try {
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(KeyEvent.VK_F10);
			robot.keyPress(KeyEvent.VK_R);
			robot.keyRelease(KeyEvent.VK_SHIFT);
		}catch(AWTException e) {
		e.printStackTrace();
		}
	}
	//Metodo L = new Metodo();
	//L.limpa();
}
