package java8features;

public class Country_04 
{
	private String name;
	private int population;
	private String currency;
	private String capital;
	private int states;
	public Country_04(String name, int population, String currency, String capital, int states) {
		super();
		this.name = name;
		this.population = population;
		this.currency = currency;
		this.capital = capital;
		this.states = states;
	}
	@Override
	public String toString() {
		return "Country_04 [name=" + name + ", population=" + population + ", currency=" + currency + ", capital="
				+ capital + ", states=" + states + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPopulation() {
		return population;
	}
	public void setPopulation(double d) {
		this.population = (int) d;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	public int getStates() {
		return states;
	}
	public void setStates(int states) {
		this.states = states;
	}
	

}
