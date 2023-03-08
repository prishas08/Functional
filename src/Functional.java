import java.util.List;
import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.Arrays;
//import java.util.Arrays.toList;

public class Functional {
	
	private List<Integer> listOne;
	private List<Integer> listTwo;
	private List<Integer> listThree;
	private List<String> listFour;
	private List<Integer> listFive;
	private List<Double> listSeven;
	private List<Integer> listEight;
	private List<Double> listNine;
	private List<Integer> listTen;




	public Functional()
	{
		//1
		System.out.println("ListOne: ");
		listOne = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
		listOne.forEach(n -> System.out.println(n));
		System.out.println();
		//2
		listTwo = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
		listTwo.removeIf(n-> n%2==0);
		System.out.println("ListTwo: " + listTwo);
		System.out.println();


		
		//3
		System.out.println("ListThree: ");
		listThree = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
		listThree.stream()
				 .filter(n -> n%2==1)
				 .forEach(x -> System.out.println(x));
		//System.out.println((listThree.stream().count()));
		//listThree.filter(<args>);
		System.out.println();

		//4
		System.out.println("ListFour: ");
		listFour = new ArrayList<>(Arrays.asList("apple", "app", "corn", "heart", "ark"));
		listFour.stream()
		  		.filter(n->n.substring(0,1).equals("a"))
		  		.forEach(x -> System.out.println(x));
		//listFour.removeIf(n->n.substring(0,1).equals("a"));
		//listFour.stream().forEach(n->System.out.println(n));
		System.out.println();
		
		//5
		System.out.println("ListFive: ");
		listFive = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
		//listFive.map(x->x*x).collect();
		listFive.replaceAll(x -> x*2);
		listFive.forEach(x -> System.out.println(x));
		System.out.println();

		//7
		System.out.println("ListSeven: ");
		listSeven = new ArrayList<>(Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0, 6.0));
		listSeven.replaceAll(x -> x*1.12);
		listSeven.forEach(x -> System.out.println(x));
		System.out.println();

		//8
		System.out.println("ListEight: ");
		listEight = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
		listEight.stream().reduce((a,b) -> a+b).stream().forEach(x -> System.out.println(x));
		System.out.println();

		//9
		System.out.println("ListNine: ");
		listNine = new ArrayList<>(Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0, 6.0));
		listNine.replaceAll(x -> x*1.12);
		listNine.stream().reduce((a,b) -> a+b).stream().forEach(x -> System.out.println(x));
		System.out.println();
		
		//10
		System.out.println("ListTen: ");
		listEight = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
		
	}
	
	public static void main(String args[])
	{
		Functional f = new Functional();
		
		//System.out.println("ListOne: " + f.listOne);
		//System.out.println("ListTwo: " + f.listTwo);
		//System.out.println("ListThree: " + f.listThree);
		//System.out.println("ListFour: " + f.listFour);


	}
	
	

}
