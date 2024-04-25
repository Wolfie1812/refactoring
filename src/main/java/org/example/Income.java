package org.example;

public class Income {
    IncomeType type;
    int amount;

    public static Income createIncome(int amount, IncomeType type){
        Income income = new Income ();
        income.amount = amount;
        income.type = type;
        return income;
    }
}