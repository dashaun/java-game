package com.javagrunt.fivehe.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.javagrunt.fivehe.Game;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "Fivehe";
		config.width = 800;
		config.height = 480;
		new LwjglApplication(new Game(), config);
	}
}
