package dev.dworks.apps.anexplorer.pro;

import android.preference.PreferenceManager;
import dev.dworks.apps.anexplorer.pro.util.ExplorerOperations;
import dev.dworks.libs.actionbarplus.app.ActionBarApplication;

public class AnExplorer extends ActionBarApplication {

	@Override
	public void onCreate() {
		Integer themeType = Integer.valueOf(PreferenceManager.getDefaultSharedPreferences(this).getString("ThemePref", "2"));
		setTheme(ExplorerOperations.THEMES[themeType]);
		super.onCreate();
	}
}
