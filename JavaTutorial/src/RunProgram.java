import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RunProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Games game = new Games();
		game.setId(1);
		System.out.println("enter the name of month");
		game.setMonth(sc.next());
		System.out.println("enter the name of game");
		game.setName(sc.next());

		List<Por> p = new ArrayList<Por>();
		List<String> pName = new ArrayList<String>();
		System.out.println("enter the number of players:");
		int a =  sc.nextInt();
		Por por = new Por();
		por.setId(1);
		for (int i = 0; i < a; i++) {
			String name = sc.next();
			pName.add(name);
		}
		por.setName(pName);
		p.add(por);
		Navchari nv = new Navchari();
		nv.setId(1);
		nv.setName(game);
		nv.setPor(p);
		
		System.out.println(nv);

	}
	

}
