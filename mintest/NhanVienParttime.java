package mintest;

public class NhanVienParttime extends NhanVien{
    private int workingHours;

    public NhanVienParttime(int workingHours) {
        this.workingHours = workingHours;
    }

    public NhanVienParttime(int employeeCode, String fullName, int age, int phoneNumber, String email, int workingHours) {
        super(employeeCode, fullName, age, phoneNumber, email);
        this.workingHours = workingHours;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }

    public int calculateSalaryP() {
        return workingHours * 100000;  // each hour = 100000
    }


}
