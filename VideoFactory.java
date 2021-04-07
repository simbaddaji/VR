import java.util.Date;

public class VideoFactory {
	public static Video create(int type, String title, int priceCode, Date registeredDate) {
		switch (type) {
		case VideoType.VHS:
			return new VHS(title, priceCode, registeredDate);

		case VideoType.CD:
			return new CD(title, priceCode, registeredDate);

		case VideoType.DVD:
			return new DVD(title, priceCode, registeredDate);

		default:
			return null;
		}
	}
}
