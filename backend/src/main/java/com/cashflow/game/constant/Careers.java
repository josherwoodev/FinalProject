package com.cashflow.game.constant;

import com.cashflow.game.model.Expenses;
import com.cashflow.game.model.Liability;

public enum Careers {

    JANITOR("Janitor", 1600
            , new Expenses(280f, 200f, 0f, 60f, 60f, 50f, 300f, 70f)
            , new Liabilities(new Liability(Liability.Types.MORTGAGE, "Mortgage", 20000f)
            , new Liability(Liability.Types.SCHOOL, "School Loans", 0f)
            , new Liability(Liability.Types.CAR, "Car Loans", 4000f)
            , new Liability(Liability.Types.CREDIT, "Car Loans", 2000f)
            , new Liability(Liability.Types.RETAIL, "Retail Debt", 1000f)), 560f),
    MECHANIC("Mechanic", 2000
            , new Expenses(360f, 300f, 0f, 60f, 60f, 50f, 450f, 110f)
            , new Liabilities(new Liability(Liability.Types.MORTGAGE, "Mortgage", 31000f)
            , new Liability(Liability.Types.SCHOOL, "School Loans", 0f)
            , new Liability(Liability.Types.CAR, "Car Loans", 3000f)
            , new Liability(Liability.Types.CREDIT, "Car Loans", 2000f)
            , new Liability(Liability.Types.RETAIL, "Retail Debt", 1000f)), 670f),
    SECRETARY("Secretary", 2500
            , new Expenses(460f, 400f, 0f, 80f, 60f, 50f, 570f, 140f)
            , new Liabilities(new Liability(Liability.Types.MORTGAGE, "Mortgage", 38000f)
            , new Liability(Liability.Types.SCHOOL, "School Loans", 0f)
            , new Liability(Liability.Types.CAR, "Car Loans", 4000f)
            , new Liability(Liability.Types.CREDIT, "Car Loans", 2000f)
            , new Liability(Liability.Types.RETAIL, "Retail Debt", 1000f)), 710f),
    TRUCKER("Truck Driver", 2500
            , new Expenses(460f, 400f, 0f, 80f, 60f, 50f, 570f, 140f)
            , new Liabilities(new Liability(Liability.Types.MORTGAGE, "Mortgage", 38000f)
            , new Liability(Liability.Types.SCHOOL, "School Loans", 0f)
            , new Liability(Liability.Types.CAR, "Car Loans", 4000f)
            , new Liability(Liability.Types.CREDIT, "Car Loans", 2000f)
            , new Liability(Liability.Types.RETAIL, "Retail Debt", 1000f)), 750f),
    POLICEMAN("Police Officer", 3000
            , new Expenses(580f, 400f, 0f, 100f, 60f, 50f, 690f, 160f)
            , new Liabilities(new Liability(Liability.Types.MORTGAGE, "Mortgage", 46000f)
            , new Liability(Liability.Types.SCHOOL, "School Loans", 0f)
            , new Liability(Liability.Types.CAR, "Car Loans", 5000f)
            , new Liability(Liability.Types.CREDIT, "Car Loans", 2000f)
            , new Liability(Liability.Types.RETAIL, "Retail Debt", 1000f)), 520f),
    NURSE("Nurse", 3100
            , new Expenses(600f, 400f, 30f, 100f, 90f, 50f, 710f, 170f)
            , new Liabilities(new Liability(Liability.Types.MORTGAGE, "Mortgage", 47000f)
            , new Liability(Liability.Types.SCHOOL, "School Loans", 6000f)
            , new Liability(Liability.Types.CAR, "Car Loans", 5000f)
            , new Liability(Liability.Types.CREDIT, "Car Loans", 3000f)
            , new Liability(Liability.Types.RETAIL, "Retail Debt", 1000f)), 480f),
    TEACHER("Teacher (K-12f)", 3300
            , new Expenses(630f, 500f, 60f, 100f, 90f, 50f, 760f, 180f)
            , new Liabilities(new Liability(Liability.Types.MORTGAGE, "Mortgage", 50000f)
            , new Liability(Liability.Types.SCHOOL, "School Loans", 12000f)
            , new Liability(Liability.Types.CAR, "Car Loans", 5000f)
            , new Liability(Liability.Types.CREDIT, "Car Loans", 3000f)
            , new Liability(Liability.Types.RETAIL, "Retail Debt", 1000f)), 400f),
    MANAGER("Business Manager", 4600
            , new Expenses(910f, 700f, 60f, 120f, 90f, 50f, 1000f, 240f)
            , new Liabilities(new Liability(Liability.Types.MORTGAGE, "Mortgage", 75000f)
            , new Liability(Liability.Types.SCHOOL, "School Loans", 12000f)
            , new Liability(Liability.Types.CAR, "Car Loans", 6000f)
            , new Liability(Liability.Types.CREDIT, "Car Loans", 3000f)
            , new Liability(Liability.Types.RETAIL, "Retail Debt", 1000f)), 400f),
    ENGINEER("Engineer", 4900
            , new Expenses(1050f, 700f, 60f, 140f, 120f, 50f, 1090f, 250f)
            , new Liabilities(new Liability(Liability.Types.MORTGAGE, "Mortgage", 75000f)
            , new Liability(Liability.Types.SCHOOL, "School Loans", 12000f)
            , new Liability(Liability.Types.CAR, "Car Loans", 7000f)
            , new Liability(Liability.Types.CREDIT, "Car Loans", 4000f)
            , new Liability(Liability.Types.RETAIL, "Retail Debt", 1000f)), 400f),
    LAWYER("Lawyer", 7500
            , new Expenses(1830f, 1100f, 390f, 220f, 180f, 50f, 1650f, 380f)
            , new Liabilities(new Liability(Liability.Types.MORTGAGE, "Mortgage", 115000f)
            , new Liability(Liability.Types.SCHOOL, "School Loans", 78000f)
            , new Liability(Liability.Types.CAR, "Car Loans", 11000f)
            , new Liability(Liability.Types.CREDIT, "Car Loans", 6000f)
            , new Liability(Liability.Types.RETAIL, "Retail Debt", 1000f)), 400f),
    PILOT("Airline Pilot", 9500
            , new Expenses(2350f, 1330f, 0f, 300f, 660f, 50f, 2210f, 480f)
            , new Liabilities(new Liability(Liability.Types.MORTGAGE, "Mortgage", 143000f)
            , new Liability(Liability.Types.SCHOOL, "School Loans", 0f)
            , new Liability(Liability.Types.CAR, "Car Loans", 15000f)
            , new Liability(Liability.Types.CREDIT, "Car Loans", 22000f)
            , new Liability(Liability.Types.RETAIL, "Retail Debt", 1000f)), 400f),
    DOCTOR("Doctor (MD)", 13200
            , new Expenses(3420f, 1900f, 750f, 380f, 270f, 50f, 2880f, 640f)
            , new Liabilities(new Liability(Liability.Types.MORTGAGE, "Mortgage", 202000f)
            , new Liability(Liability.Types.SCHOOL, "School Loans", 150000f)
            , new Liability(Liability.Types.CAR, "Car Loans", 19000f)
            , new Liability(Liability.Types.CREDIT, "Car Loans", 9000f)
            , new Liability(Liability.Types.RETAIL, "Retail Debt", 1000f)), 400f);

    private final String name;
    private final Expenses expenses;
    private final Liabilities liabilities;
    private final float salary, savings;

    Careers(String name, float salary, Expenses expenses, Liabilities liabilities, float savings) {
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

}