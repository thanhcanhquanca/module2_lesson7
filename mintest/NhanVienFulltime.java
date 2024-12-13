package mintest;

public class NhanVienFulltime extends NhanVien{
    private int bonusAmount;
    private int penaltyAmount;
    private int fixedSalary;

    public NhanVienFulltime(int employeeCode, String fullName, int age, int phoneNumber, String email, int bonusAmount, int penaltyAmount, int fixedSalary) {
        super(employeeCode, fullName, age, phoneNumber, email);
        this.bonusAmount = bonusAmount;
        this.penaltyAmount = penaltyAmount;
        this.fixedSalary = fixedSalary;
    }

    public NhanVienFulltime(int bonusAmount, int penaltyAmount, int fixedSalary) {
        this.bonusAmount = bonusAmount;
        this.penaltyAmount = penaltyAmount;
        this.fixedSalary = fixedSalary;
    }

    public NhanVienFulltime(){

    }

    public int getBonusAmount() {
        return bonusAmount;
    }

    public void setBonusAmount(int bonusAmount) {
        this.bonusAmount = bonusAmount;
    }

    public int getPenaltyAmount() {
        return penaltyAmount;
    }

    public void setPenaltyAmount(int penaltyAmount) {
        this.penaltyAmount = penaltyAmount;
    }

    public int getFixedSalary() {
        return fixedSalary;
    }

    public void setFixedSalary(int fixedSalary) {
        this.fixedSalary = fixedSalary;
    }

    public int calculateSalary() {
        return fixedSalary + (bonusAmount - penaltyAmount);
    }


}
