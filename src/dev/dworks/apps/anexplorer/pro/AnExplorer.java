package dev.dworks.apps.anexplorer.pro;

import android.preference.PreferenceManager;
import dev.dworks.apps.anexplorer.pro.util.ExplorerOperations;
import dev.dworks.libs.actionbarplus.SherlockApplication;

public class AnExplorer extends SherlockApplication {

	@Override
	public void onCreate() {
		Integer themeType = Integer.valueOf(PreferenceManager.getDefaultSharedPreferences(this).getString("ThemePref", "2"));
		setTheme(ExplorerOperations.THEMES[themeType]);
		super.onCreate();
	}
}
