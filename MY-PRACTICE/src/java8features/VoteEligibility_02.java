package java8features;

interface Service
{
	public String voteCheck(String name,int age,String location);
}
public class VoteEligibility_02 
{
	public static void main(String[] args) 
	{
		Service s = (name,age,location)->{
			if(age>=18 && location.equalsIgnoreCase("hyderabad")
					) {
				System.out.println(name+" You are Eligible for Voting...");
			}
			else
			{
				System.out.println(name+" You are not Eligigble for Voting...");
			}
			return  name;
		};
		s.voteCheck("Mahesh", 17, "Hyderabad");
	}
}
