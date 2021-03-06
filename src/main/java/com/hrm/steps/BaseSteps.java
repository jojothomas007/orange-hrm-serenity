package com.hrm.steps;

import com.hrm.enums.UserRole;
import com.hrm.page.DashboardPage;
import com.hrm.page.LoginPage;

import net.thucydides.core.annotations.Step;

public class BaseSteps {
	LoginPage loginPage;
	DashboardPage dashboardPage;

	@Step
	public void logout() {
		dashboardPage.logout();
	}

	@Step
	public void checkAvailableMenuOptions(UserRole userRole) {
		dashboardPage.checkForMenusDisplayed(userRole);
	}

	@Step("{0}")
	public void postInformationInReport(String logString0) {

	}

	@Step("{0} {1}")
	public void postInformationInReport(String logString0, String logString1) {

	}

	@Step("{0} {1} {2}")
	public void postInformationInReport(String logString0, String logString1, String logString2) {

	}

}
