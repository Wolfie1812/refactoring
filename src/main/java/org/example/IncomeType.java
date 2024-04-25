package org.example;

enum IncomeType {
    CAR_WASHING("Car washing", 15), GARDENING("Gardening", 25), GIFTS("Gifts", 0), DISHWASHING("Dishwashing", 0);
    private final String incomeName;
    private final int goal;

    IncomeType(String incomeName, int goal) {
        this.incomeName = incomeName;
        this.goal = goal;
    }

    public String getIncomeName() {
        return incomeName;
    }

    public int getGoal() {
        return goal;
    }
}