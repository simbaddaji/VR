import java.util.Date;

public class DVD extends Video {
	public DVD(String title, int priceCode, Date registeredDate) {
		super(title, priceCode, registeredDate);
	}

	@Override
	public int getLateReturnPointPenalty() {
		return 3;
	}
	
	@Override
	public int getDefaultRentalLimit() {
		// TODO Auto-generated method stub
		return 2;
	}
}
