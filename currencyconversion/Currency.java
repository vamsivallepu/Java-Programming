package currencyconversion;

import java.util.*;

public class Currency {
	double inr, usd;
	double euro, yen;
	Scanner in = new Scanner(System.in);

	public void dollartorupee() {
		System.out.println("Enter dollars to convert into Rupees:");
		usd = in.nextInt();
		inr = usd * 73;
		System.out.println("Dollar =" + usd + "equal to INR=" + inr);
	}

	public void rupeetodollar() {
		System.out.println("Enter Rupee to convert into Dollars:");
		inr = in.nextInt();
		usd = inr / 73;
		System.out.println("Rupee =" + inr + "equal to Dollars=" + usd);
	}

	public void eurotorupee() {
		System.out.println("Enter euro to convert into Rupees:");
		euro = in.nextInt();
		inr = euro * 89.69;
		System.out.println("Euro =" + euro + "equal to INR=" + inr);
	}

	public void rupeetoeuro() {
		System.out.println("Enter Rupees to convert into Euro:");
		inr = in.nextInt();
		euro = (inr / 89.69);
		System.out.println("Rupee =" + inr + "equal to Euro=" + euro);
	}

	public void yentorupee() {
		System.out.println("Enter yen to convert into Rupees:");
		yen = in.nextInt();
		inr = yen * 0.71;
		System.out.println("YEN=" + yen + "equal to INR=" + inr);
	}

	public void rupeetoyen() {
		System.out.println("Enter Rupees to convert into Yen:");
		inr = in.nextInt();
		yen = (inr / 0.71);
		System.out.println("INR=" + inr + "equal to YEN" + yen);
	}
}
