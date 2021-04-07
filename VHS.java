import java.util.Date;

public class VHS extends Video {
	public VHS(String title, int priceCode, Date registeredDate) {
		super(title, priceCode, registeredDate);
	}

	@Override
	public int getLateReturnPointPenalty() {
		return 1;
	}

	@Override
	public int getDefaultRentalLimit() {
		// TODO Auto-generated method stub
		return 5;
	}
}
