package lab3;

interface Asset {
    public Integer computeProfit();
    default public Integer computeFinancialRisk() {
		return 0;
	}
}