package mintest;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<NhanVien> employees = getNhanViens();


        double averageSalary = calculateAverageSalary(employees);
        System.out.println("Mức lương trung bình của công ty: " + averageSalary);

         listOfemployess(employees,averageSalary);

         double totalSalary = allEmployess(employees);
        System.out.println("Tổng lương thực nhân viên bán thời gian " + totalSalary);




//        // sử lý thêm theo mảng
//
//        NhanVien[] empnv = {nvFulltime1,nvFulltime2,nvParttime1,nvParttime2};
//
//        double sumemp = sumEMP(empnv);
//        System.out.println("Mức lương trung bình của công ty" + sumemp);
//
//        listOfemp(empnv,sumemp);
//        double sumEmp = allEmpPo(empnv);
//        System.out.println("Tổng lương thực nhân viên bán thời gian " + sumEmp);
//



    }


//    // sử lý theo mảng
//    private static double allEmpPo(NhanVien[] empnv) {
//        double sumn = 0;
//        for (NhanVien nv : empnv) {
//            if (nv instanceof  NhanVienFulltime){
//                NhanVienFulltime nvFulltime = (NhanVienFulltime) nv;
//                sumn += nvFulltime.calculateSalary();
//            }
//        }
//        return sumn;
//    }
//
//
//    private static void listOfemp(NhanVien[] empnv, double sumemp) {
//       double salary = 0;
//        for (NhanVien nv : empnv) {
//            if (nv instanceof NhanVienFulltime){
//                NhanVienFulltime nhanVienFulltime = (NhanVienFulltime) nv;
//                salary = nhanVienFulltime.calculateSalary();
//                if (salary > sumemp){
//                    System.out.println(nhanVienFulltime.getFullName() + " số tiền " + salary);
//                }
//            }
//        }
//    }
//
//    private static double sumEMP(NhanVien[] empnv) {
//        double sum = 0;
//        int nvem = 0;
//        for (NhanVien nv : empnv) {
//            if (nv instanceof NhanVienFulltime){
//                sum += nv.calculateSalary();
//                nvem++;
//            }else if (nv instanceof NhanVienParttime){
//                nvem++;
//            }
//        }
//
//        return nvem == 0 ? 0 : sum / nvem;
//    }


    private static List<NhanVien> getNhanViens() {
        NhanVienFulltime nvFulltime1 = new NhanVienFulltime(1, "Dung A", 30, 123456789, "dung@gmail.com", 1000000, 200000, 5000000);
        NhanVienFulltime nvFulltime2 = new NhanVienFulltime(2, "Son B", 28, 987654321, "son@gmail.com", 800000, 100000, 6000000);
        NhanVienParttime nvParttime1 = new NhanVienParttime(3, "Quan C", 25, 123123123, "quan@gmail.com", 50);
        NhanVienParttime nvParttime2 = new NhanVienParttime(4, "VietAnh D", 22, 321321321, "vietanh@gmail.com", 30);

        List<NhanVien> employees = new ArrayList<>();
        employees.add(nvFulltime1);
        employees.add(nvFulltime2);
        employees.add(nvParttime1);
        employees.add(nvParttime2);
        return employees;
    }


    // sử lý theo list

    private static double allEmployess(List<NhanVien> employees) {
        double toatl = 0;
        for (NhanVien nv : employees) {
           toatl += nv.calculateSalary();
        }

        return toatl;
    }


    private static void listOfemployess(List<NhanVien> employees, double averageSalary) {
        double salary = 0;
        for (NhanVien employee : employees) {
             salary += employee.calculateSalary();
        }

    }



    public static double calculateAverageSalary(List<NhanVien> emplo) {
        double totalSalary = 0;
        int totalEmployees = 0;

        for (NhanVien employee : emplo) {
            totalSalary += employee.calculateSalary();
            totalEmployees++;
        }

        return totalEmployees == 0 ? 0 : totalSalary / totalEmployees;
    }


}
