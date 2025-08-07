class CompanyRunner {
 public static void main(String[] args) {

Company comapny=new Company("Infosys", 123456,"bengaluru", 2000);
System.out.println("Printing company details");
System.out.println(Company.getName());
System.out.println(Company.getCity());

Ceo ceo= new Ceo("Shryas",100000.0f, "bangalore");
company.setCeo(ceo);

Ceo ceo1=company.getCeo();
System.out.println("Printing company's Ceo details");
System.out.println(ceo1.getName());
System.out.println(ceo1.getCity());
System.out.println(ceo1.getSalary());
}
}