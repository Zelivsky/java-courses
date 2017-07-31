import java.util.Scanner;
public class InteractRunner {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		try {
			Calculator calc = new Calculator();
			String exit = "нет";
			while (!exit.equals("да")) {
				System.out.println("Введите первый аргумент: ");
				String first = reader.next();
				System.out.println("Введите второй аргумент: ");
				String second = reader.next();
				calc.add(Integer.valueOf(first), Integer.valueOf(second));
				System.out.println("Результат: " + calc.getResult());
				calc.cleanResult();
				System.out.println("Выйти: да/нет ");
				exit = reader.next();
			}

		}
		finally {
			reader.close();
		}
	}



}