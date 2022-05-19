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
