import java.util.Scanner;

public class JavaConvertCurrency
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Enter A to convert dollars to euros\nor B to convert euros to dollars: ");
		char convert = keyboard.next().charAt(0);

		System.out.println("Enter amount: ");
		double currency = keyboard.nextDouble();

		switch(convert)
		{
			case 'A':
			case 'a':
				System.out.printf("%f dollars is %.2f euros%n", currency, (currency * 0.86143522));
				break;

			case 'b':
			case 'B':
				System.out.printf("%f euros is %.2f dollars%n", currency, (currency / 0.86143522));
				break;
		}

	}
}