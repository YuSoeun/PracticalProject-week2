import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String args[]) {
		
		List<Fruit> fl = new ArrayList<Fruit>();
		System.out.println("Fruit List (ordered by name");
		Fruit s1 = new Fruit(101, "Apple", 100);
		fl.add((s1));
		Fruit s2 = new Fruit(102, "Orange", 401);
		fl.add((s2));
		Fruit s3 = new Fruit(103, "Kiwi", 403);
		fl.add((s3));
		Fruit s4 = new Fruit(104, "Banana", 500);
		fl.add((s4));
		Fruit s5 = new Fruit(105, "Pineapple", 200);
		fl.add((s5));
		Fruit s6 = new Fruit(106, "Watermelon", 404);
		fl.add((s6));
		Fruit s7 = new Fruit(107, "Melon", 201);
		fl.add((s7));
		Fruit s8 = new Fruit(108, "Grape", 204);
		fl.add((s8));
		Fruit s9 = new Fruit(109, "Cherry", 206);
		fl.add((s9));
		Fruit s10 = new Fruit(110, "낑깡", 301);
		fl.add((s10));
		
		Collections.sort(fl, new FruitComparator());
		
		for (Fruit s : fl) {
			System.out.println(s.toString());
		}
	}
}