import java.util.ArrayList;
import java.util.List;

public class main {
	static List<person> PList = new ArrayList<>();
	public static void main(String[] args) {
		
		person Owen = new person();
		person Jake = new person("Jake", 22, "manager");
		person Ben = new person("Ben", 28, "cleaner");
		person Tom = new person("Tom", 28, "Rookie");
		
			PList.add(Jake); 
			PList.add(Ben);
			PList.add(Tom);
			
			
			findperson("Jake");
	}
			public static void findperson(String name){ 
				for (person p : PList) { 
					if (p.getName().equals(name)){ 
						System.out.println(name + " found");
					}
				}
			
			
			
			
			}

}
