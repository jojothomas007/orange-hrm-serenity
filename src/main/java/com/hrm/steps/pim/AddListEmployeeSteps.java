package com.hrm.steps.pim;

import com.hrm.entity.Employee;
import com.hrm.page.pim.AddEmployeePage;
import com.hrm.page.pim.EmployeeDetailsPage;
import com.hrm.page.pim.EmployeeListPage;
import com.hrm.steps.BaseSteps;

import net.thucydides.core.annotations.Step;

public class AddListEmployeeSteps extends BaseSteps {
	AddEmployeePage addEmployeePage;
	EmployeeListPage employeeListPage;
	EmployeeDetailsPage employeeDetailsPage;

	@Step
	public void addNewEmployee(Employee employee) {
		addEmployeePage.navigateToPage();
		if (employee.getUser() == null) {
			addEmployeePage.addNewEmployeeWithoutLoginDetails(employee);
		} else {
			addEmployeePage.addNewEmployeeWithLoginDetails(employee);
		}
		employeeDetailsPage.waitUntilTitleAppears();
	}

	@Step
	public void searchForEmployee(Employee employee) {
		employeeListPage.navigateToPage();
		employeeListPage.searchEmployeeWithId(employee);
	}

	@Step("Get a Random Employee")
	public Employee getARandomEmployee(Employee employee) {
		employeeListPage.navigateToPage();
		employeeListPage.getARandomEmployee(employee);
		return employee;
	}
}
