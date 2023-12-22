package collectionsframework;

public class Employee_03
{
	private int empId;
	private String empName;
	private int empSalary;
	private int empDeptNum;
	private String empLocation;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}
	public int getEmpDeptNum() {
		return empDeptNum;
	}
	public void setEmpDeptNum(int empDeptNum) {
		this.empDeptNum = empDeptNum;
	}
	public String getEmpLocation() {
		return empLocation;
	}
	public void setEmpLocation(String empLocation) {
		this.empLocation = empLocation;
	}
	@Override
	public String toString() {
		return "Employee_03 [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + ", empDeptNum="
				+ empDeptNum + ", empLocation=" + empLocation + "]";
	}
	
}
