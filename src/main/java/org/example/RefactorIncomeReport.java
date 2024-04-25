package org.example;

import java.util.Date;
import java.util.List;

public class RefactorIncomeReport {
    public void printIncomeReport(List<Income> incomes) {
        // Bedragen worden afgerond in hele euro's
        int totalIncome = 0;
        int totalIncomeEarned = 0;
        System.out.println("Income " + new Date());
        for (Income income : incomes) {
            String incomeName = income.type.getIncomeName();
            String achievedIncomeGoalMarker = (isIncomeGoalAchieved(income))? "V" : " ";
            totalIncome += income.amount;
            totalIncomeEarned = calculateTotalIncomeEarned(income, totalIncomeEarned);
            System.out.println(incomeName + "\t" + income.amount + "\t" + achievedIncomeGoalMarker);
        }
        System.out.println("----------------------"
                + "\nEarned income:\t" + totalIncomeEarned
                + "\nTotal income: \t" + totalIncome);
    }

    public static int calculateTotalIncomeEarned(Income income, int totalIncomeEarned) {
        if (!(income.type == IncomeType.GIFTS)) {
                totalIncomeEarned += income.amount;
            }
        return totalIncomeEarned;
    }

    public static boolean isIncomeGoalAchieved(Income income) {
        return income.type.getGoal() != 0 && income.amount > income.type.getGoal();
    }
}

