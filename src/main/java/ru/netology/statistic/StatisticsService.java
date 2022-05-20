package ru.netology.statistic;

public class StatisticsService {
    /**
     * Calculate index of max income
     *
     * @param incomes - array of incomes
     * @return - index of first max value
     */

    //Calculate index of max income
    public long findMax(long[] incomes) {
        long current_max = incomes[0];
        for (long income : incomes)
            if (current_max < income)
                current_max = income;
        return current_max;
    }

    //Calculate last month number with max income
    public long findLastMaxIncome(long[] incomes) {
        int maxIncome = 0;
        int month = 0;
        for (long income : incomes) {
            if (income >= incomes[maxIncome]) {
                maxIncome = month;
            }
            month = month + 1;
        }
        return maxIncome + 1;
    }

    //Calculate last month number with min income
    public long findLastMinIncome(long[] incomes) {
        int minIncome = 0;
        int month = 0;
        for (long income : incomes) {
            if (income <= incomes[minIncome]) {
                minIncome = month;
            }
            month = month + 1;
        }
        return minIncome + 1;
    }


    //Calculate index of min income
    public long findMin(long[] incomes) {
        long current_min = incomes[0];
        for (long income : incomes)
            if (current_min > income)
                current_min = income;
        return current_min;
    }

    //Calculate index of sum income
    public long findSum(long[] incomes) {
        long sum = 0;
        for (long income : incomes)
            sum += income;
        return sum;
    }

    //Calculate index of average income
    public double findAverage(double[] incomes) {
        double average = 0;
        for (double income : incomes) {
            average += income;
        }
        return average / incomes.length;
    }
}
