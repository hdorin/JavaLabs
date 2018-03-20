package lab3;

interface Asset {
    double computeProfit();
    default double computeFinancialRisk(){
        return 0.2;
    }
}