class BirdRunner{
	public static void main(String[] args){
	Bird bird= new Bird();
	System.out.println(bird.getName());
	bird.setName("Parrot");
	String name=bird.getName();
	System.out.println(name);

	System.out.println("___________________________________________________");
	Bird bird1=new Bird("Parrot",18);
	System.out.println(bird1.getName());
	System.out.println(bird1.getAge());
	bird1.setAge(10);
	System.out.println(bird1.getAge());
	
}
}