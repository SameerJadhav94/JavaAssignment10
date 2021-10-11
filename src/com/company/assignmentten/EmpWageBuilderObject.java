package com.company.assignmentten;

public class EmpWageBuilderObject {
    public static final int isPartTime = 1;
    public static final int isFullTime = 2;

    private final String company;
    private final int empRatePerHour;
    private final int numOfWorkingDays;
    private final int maxHoursPerMonth;
    private int totalEmpWage;

    public EmpWageBuilderObject(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
        this.company = company;
        this.empRatePerHour = empRatePerHour;
        this.numOfWorkingDays = numOfWorkingDays;
        this.maxHoursPerMonth = maxHoursPerMonth;
    }
    public void computeEmpWage(){
        int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
        while (totalEmpHrs <= maxHoursPerMonth && totalWorkingDays < numOfWorkingDays){
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random()*10)%3;
            switch (empCheck){
                case isPartTime:
                    empHrs = 4;
                    break;
                case isFullTime:
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;

            }
            totalEmpHrs += empHrs;
            System.out.println("Total Working Days" + totalWorkingDays + "Employee Hours" + empHrs);

        }
        totalEmpWage = totalEmpHrs*empRatePerHour;


    }
    @Override
    public String toString(){
        return "Total Emp Wage For Company: " + company + " is " + totalEmpWage;


    }

    public static void main(String[] args) {
        EmpWageBuilderObject dmart = new EmpWageBuilderObject("Dmart", 20, 2, 10);
        EmpWageBuilderObject reliance = new EmpWageBuilderObject("Reliance",18, 4, 20 );
        dmart.computeEmpWage();
        System.out.println(dmart);
        reliance.computeEmpWage();
        System.out.println(reliance);

    }
}
