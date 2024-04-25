package org.example;

import java.util.Date;
import java.util.List;

enum IncomeType {
    CAR_WASHING, GARDENING, GIFTS, DISHWASHING
}



public class RefactorIncomeReport {
    public void printIncomeReport(List<Income> incomes) {
        // Bedragen worden afgerond in hele euro's
        int totalIncome = 0;
        int totalIncomeEarned = 0;
        System.out.println("Income " + new Date());
        for (Income income : incomes) {
            String incomeName = getIncomeName(income);
            String achievedIncomeGoalMarker = (isIncomeGoalAchieved(income))? "V" : " ";
            totalIncome += income.amount;
            totalIncomeEarned = calculateTotalIncomeEarned(income, totalIncomeEarned);
            System.out.println(incomeName + "\t" + income.amount + "\t" + achievedIncomeGoalMarker);
        }
        System.out.println("----------------------"
                + "\nEarned income:\t" + totalIncomeEarned
                + "\nTotal income: \t" + totalIncome);
    }

    public static String getIncomeName(Income income) {
        String incomeName = "";
        switch (income.type) {
            case CAR_WASHING:
                incomeName = "Car washing";
                break;
            case GARDENING:
                incomeName = "Gardening";
                break;
            case GIFTS:
                incomeName = "Gifts";
                break;
            case DISHWASHING:
                incomeName = "Dishwashing";
        }
        return incomeName;
    }

    public static int calculateTotalIncomeEarned(Income income, int totalIncomeEarned) {
        if (!(income.type == IncomeType.GIFTS)) {
                totalIncomeEarned += income.amount;
            }
        return totalIncomeEarned;
    }

    public static boolean isIncomeGoalAchieved(Income income) {
        return income.type == IncomeType.CAR_WASHING && income.amount > 15 || income.type == IncomeType.GARDENING && income.amount > 25 ? true : false;
    }
}

