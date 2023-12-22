package collectionsframework;


import java.util.ArrayList;
import java.util.List;

public class DataMerging_09 {

	public static void main(String[] args) 
	{
		ArrayList<String> mammals=new ArrayList<String>();
		mammals.add("Lion");
		mammals.add("Elephant");
		mammals.add("Gorilla");
		mammals.add("Kanagaroo");
		mammals.add("Cheetah");
		mammals.add("Chimpanzee");
		
		ArrayList<String> birds=new ArrayList<String>(mammals);
		birds.add("Eagles");
		birds.add("Parrot");
		birds.add("Sparrow");
		birds.add("Penguin");
		birds.add("Hen");
		birds.add("Peacock");
		List<String> animals=new ArrayList<String>(birds);
		
		for(String animal : animals)
		{
			System.out.print(animal+" ");
		}
	}

}
