package org.example;
import java.util.Arrays;

public class main {
    public static void main(String args[]) {
        RefactorIncomeReport refactorIncomeReport = new RefactorIncomeReport(); //can we make this simpeler?
        Income carWash020424 = Income.createIncome(20, IncomeType.CAR_WASHING);
        Income carWash120424 = Income.createIncome(14, IncomeType.CAR_WASHING);
        Income carWash140424 = Income.createIncome(16, IncomeType.CAR_WASHING);
        Income gardening050424 = Income.createIncome(20, IncomeType.GARDENING);
        Income gardening250424 = Income.createIncome(30, IncomeType.GARDENING);
        Income birthday01 = Income.createIncome(20, IncomeType.GIFTS);
        Income birthday02 = Income.createIncome(20, IncomeType.GIFTS);
        Income dishwashing220424 = Income.createIncome(10, IncomeType.DISHWASHING);
        refactorIncomeReport.printIncomeReport(Arrays.asList(carWash020424, carWash120424, carWash140424, gardening050424, gardening250424, birthday01, birthday02, dishwashing220424));
    }
}
