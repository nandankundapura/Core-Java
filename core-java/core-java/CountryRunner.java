class CountryRunner {
public static void main(String[] args) {
Country county=new Country();
country.setName("India");
State[] states=new State[0];
State state1=new State();
state1.setName("Karnataka");
state1.setChiefMinister("Siddharamaiah");

state[0]=state1;

country.setStates(states);

System.out.println("Country names and its states");

System.out.println(country.getName());
State[] countryStates=country.getStates();
for(int i=0;i<countrySates.length;i++) {
State state =countryStates[i]);
if(state!=null) {
System.out.println(state.getName();
}
}
}
}
}