package EmployeeProject;

public class UpdateException extends Exception {
	public String toString() {
		return "Please insert the details ";

	}

	public class AllException extends Exception {
		public String toString() {
			return "Employee Details is Empty";

		}

	}
}