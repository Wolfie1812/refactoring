package org.example;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class RefactorIncomeReportTest {
    Income incomeCar = new Income();
    Income incomeGift = new Income();

    @Test
public void testIsIncomeGoalAchieved(){
    incomeCar.amount = 20;
    incomeCar.type = IncomeType.CAR_WASHING;
    boolean incomeGoalAchieved = RefactorIncomeReport.isIncomeGoalAchieved(incomeCar);
    assertTrue(incomeGoalAchieved);
}

@Test
    public void testIsIncomeGoalNotAchieved(){
        incomeCar.amount = 5;
        incomeCar.type = IncomeType.CAR_WASHING;
        boolean incomeGoalAchieved = RefactorIncomeReport.isIncomeGoalAchieved(incomeCar);
        assertFalse(incomeGoalAchieved);
    }

@Test
public void testCalculationTotalAmountEarned(){
    incomeCar.amount = 20;
    incomeCar.type = IncomeType.CAR_WASHING;
    incomeGift.amount = 50;
    incomeGift.type = IncomeType.GIFTS;
    List<Income> incomes = Arrays.asList(incomeCar, incomeGift);
    int totalAmountEarned = 0;
    for(Income income : incomes) {
        totalAmountEarned = RefactorIncomeReport.calculateTotalIncomeEarned(income, totalAmountEarned);
        assertEquals(20, totalAmountEarned);
    }
}

@Test
    public void testGetIncomeName(){
    incomeCar.amount = 20;
    incomeCar.type = IncomeType.CAR_WASHING;
    String incomeName = RefactorIncomeReport.getIncomeName(incomeCar);
    assertEquals("Car washing", incomeName);
}
}