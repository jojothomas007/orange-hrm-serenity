package com.hrm.enums;

import java.util.HashSet;
import java.util.Set;

public enum MenuItems {
	// TODO enums items to be updated according to the user menus
	ADMIN_USERS("Admin", "User Management", "Users"), ADMIN_LOCALIZATION("Admin", "Configuration", "Localization"),
	PIM_EMP_LIST("PIM", "Employee List", ""), PIM_ADD_EMP("PIM", "Add Employee", ""), PIM_REPORTS("PIM", "Reports", ""),
	LEAVE_ADD_ENTITLEMENTS("Leave", "Entitlements", "Add Entitlements"),
	LEAVE_EMP_ENTITLEMENTS("Leave", "Entitlements", "Employee Entitlements"),
	LEAVE_REPORT("Leave", "Reports", "Leave Entitlements and Usage Report"),
	LEAVE_MY_REPORT("Leave", "Reports", "My Leave Entitlements and Usage Report"),
	LEAVE_TYPES("Leave", "Configure", "Leave Types"), LEAVE_ASSIGN("Leave", "Assign Leave", ""), TIME("Time", "", ""),
	RECRUITMENT("Recruitment", "", ""), MY_INFO("My Info", "", ""), PERFORMANCE("Performance", "", ""),
	DASHBOARD("Dashboard", "", ""), DIRECTORY("Directory", "", ""), MAINTENANCE("Maintenance", "", ""),
	BUZZ("Buzz", "", "");

	String mainMenu, secondLvlMenu, thirdLvlMenu;

	private MenuItems(String mainMenu, String secondLvlMenu, String thirdLvlMenu) {
		this.mainMenu = mainMenu;
		this.secondLvlMenu = secondLvlMenu;
		this.thirdLvlMenu = thirdLvlMenu;
	}

	public String getMainMenu() {
		return mainMenu;
	}

	public String getSecondLvlMenu() {
		return secondLvlMenu;
	}

	public String getThirdLvlMenu() {
		return thirdLvlMenu;
	}

	public static Set<String> getMainMenuSet() {
		HashSet<String> mainMenuSet = new HashSet<>();
		for (MenuItems item : MenuItems.values()) {
			mainMenuSet.add(item.mainMenu);
		}
		return mainMenuSet;
	}
}
