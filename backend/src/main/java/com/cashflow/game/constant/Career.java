package com.cashflow.game.constant;

import com.cashflow.game.model.Liability;

public enum Career {

    JANITOR("Janitor", 1600
            , new Expenses(280, 200, 0, 60, 60, 50, 300, 70)
            , new Liabilities(new Liability(Liability.Type.MORTGAGE, "Mortgage", 20000)
            , new Liability(Liability.Type.SCHOOL, "School Loans", 0)
            , new Liability(Liability.Type.CAR, "Car Loans", 4000)
            , new Liability(Liability.Type.CREDIT, "Car Loans", 2000)
            , new Liability(Liability.Type.RETAIL, "Retail Debt", 1000)), 560),
    MECHANIC("Mechanic", 2000
            , new Expenses(360, 300, 0, 60, 60, 50, 450, 110)
            , new Liabilities(new Liability(Liability.Type.MORTGAGE, "Mortgage", 31000)
            , new Liability(Liability.Type.SCHOOL, "School Loans", 0)
            , new Liability(Liability.Type.CAR, "Car Loans", 3000)
            , new Liability(Liability.Type.CREDIT, "Car Loans", 2000)
            , new Liability(Liability.Type.RETAIL, "Retail Debt", 1000)), 670),
    SECRETARY("Secretary", 2500
            , new Expenses(460, 400, 0, 80, 60, 50, 570, 140)
            , new Liabilities(new Liability(Liability.Type.MORTGAGE, "Mortgage", 38000)
            , new Liability(Liability.Type.SCHOOL, "School Loans", 0)
            , new Liability(Liability.Type.CAR, "Car Loans", 4000)
            , new Liability(Liability.Type.CREDIT, "Car Loans", 2000)
            , new Liability(Liability.Type.RETAIL, "Retail Debt", 1000)), 710),
    TRUCKER("Truck Driver", 2500
            , new Expenses(460, 400, 0, 80, 60, 50, 570, 140)
            , new Liabilities(new Liability(Liability.Type.MORTGAGE, "Mortgage", 38000)
            , new Liability(Liability.Type.SCHOOL, "School Loans", 0)
            , new Liability(Liability.Type.CAR, "Car Loans", 4000)
            , new Liability(Liability.Type.CREDIT, "Car Loans", 2000)
            , new Liability(Liability.Type.RETAIL, "Retail Debt", 1000)), 750),
    POLICEMAN("Police Officer", 3000
            , new Expenses(580, 400, 0, 100, 60, 50, 690, 160)
            , new Liabilities(new Liability(Liability.Type.MORTGAGE, "Mortgage", 46000)
            , new Liability(Liability.Type.SCHOOL, "School Loans", 0)
            , new Liability(Liability.Type.CAR, "Car Loans", 5000)
            , new Liability(Liability.Type.CREDIT, "Car Loans", 2000)
            , new Liability(Liability.Type.RETAIL, "Retail Debt", 1000)), 520),
    NURSE("Nurse", 3100
            , new Expenses(600, 400, 30, 100, 90, 50, 710, 170)
            , new Liabilities(new Liability(Liability.Type.MORTGAGE, "Mortgage", 47000)
            , new Liability(Liability.Type.SCHOOL, "School Loans", 6000)
            , new Liability(Liability.Type.CAR, "Car Loans", 5000)
            , new Liability(Liability.Type.CREDIT, "Car Loans", 3000)
            , new Liability(Liability.Type.RETAIL, "Retail Debt", 1000)), 480),
    TEACHER("Teacher (K-12)", 3300
            , new Expenses(630, 500, 60, 100, 90, 50, 760, 180)
            , new Liabilities(new Liability(Liability.Type.MORTGAGE, "Mortgage", 50000)
            , new Liability(Liability.Type.SCHOOL, "School Loans", 12000)
            , new Liability(Liability.Type.CAR, "Car Loans", 5000)
            , new Liability(Liability.Type.CREDIT, "Car Loans", 3000)
            , new Liability(Liability.Type.RETAIL, "Retail Debt", 1000)), 400),
    MANAGER("Business Manager", 4600
            , new Expenses(910, 700, 60, 120, 90, 50, 1000, 240)
            , new Liabilities(new Liability(Liability.Type.MORTGAGE, "Mortgage", 75000)
            , new Liability(Liability.Type.SCHOOL, "School Loans", 12000)
            , new Liability(Liability.Type.CAR, "Car Loans", 6000)
            , new Liability(Liability.Type.CREDIT, "Car Loans", 3000)
            , new Liability(Liability.Type.RETAIL, "Retail Debt", 1000)), 400),
    ENGINEER("Engineer", 4900
            , new Expenses(1050, 700, 60, 140, 120, 50, 1090, 250)
            , new Liabilities(new Liability(Liability.Type.MORTGAGE, "Mortgage", 75000)
            , new Liability(Liability.Type.SCHOOL, "School Loans", 12000)
            , new Liability(Liability.Type.CAR, "Car Loans", 7000)
            , new Liability(Liability.Type.CREDIT, "Car Loans", 4000)
            , new Liability(Liability.Type.RETAIL, "Retail Debt", 1000)), 400),
    LAWYER("Lawyer", 7500
            , new Expenses(1830, 1100, 390, 220, 180, 50, 1650, 380)
            , new Liabilities(new Liability(Liability.Type.MORTGAGE, "Mortgage", 115000)
            , new Liability(Liability.Type.SCHOOL, "School Loans", 78000)
            , new Liability(Liability.Type.CAR, "Car Loans", 11000)
            , new Liability(Liability.Type.CREDIT, "Car Loans", 6000)
            , new Liability(Liability.Type.RETAIL, "Retail Debt", 1000)), 400),
    PILOT("Airline Pilot", 9500
            , new Expenses(2350, 1330, 0, 300, 660, 50, 2210, 480)
            , new Liabilities(new Liability(Liability.Type.MORTGAGE, "Mortgage", 143000)
            , new Liability(Liability.Type.SCHOOL, "School Loans", 0)
            , new Liability(Liability.Type.CAR, "Car Loans", 15000)
            , new Liability(Liability.Type.CREDIT, "Car Loans", 22000)
            , new Liability(Liability.Type.RETAIL, "Retail Debt", 1000)), 400),
    DOCTOR("Doctor (MD)", 13200
            , new Expenses(3420, 1900, 750, 380, 270, 50, 2880, 640)
            , new Liabilities(new Liability(Liability.Type.MORTGAGE, "Mortgage", 202000)
            , new Liability(Liability.Type.SCHOOL, "School Loans", 150000)
            , new Liability(Liability.Type.CAR, "Car Loans", 19000)
            , new Liability(Liability.Type.CREDIT, "Car Loans", 9000)
            , new Liability(Liability.Type.RETAIL, "Retail Debt", 1000)), 400);

    private final String name;
    private final Expenses expenses;
    private final Liabilities liabilities;
    private final float salary, savings;

    Career(String name, float salary, Expenses expenses, Liabilities liabilities, float savings) {
        this.name = name;
        this.salary = salary;
        this.expenses = expenses;
        this.liabilities = liabilities;
        this.savings = savings;
    }

    public String getName() {
        return name;
    }

    public float getSalary() {
        return salary;
    }

    public Expenses getExpenses() {
        return expenses;
    }

    public Liabilities getLiabilities() {
        return liabilities;
    }

    public float getSavings() {
        return savings;
    }

    public record Liabilities(Liability mortgage, Liability school,
                              Liability car,
                              Liability credit, Liability retail) {
    }

    public record Expenses(float taxes, float mortgage, float school, float car,
                           float credit, float retail, float other,
                           float child) {
    }
}