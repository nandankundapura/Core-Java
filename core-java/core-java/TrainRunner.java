class TrainRunner{
static
{
System.out.println("static block in trainrunner");
}

public static void main(String[] args)
{

Train train=new Train();
System.out.println(train.length);
train.setName("Rajadhani");
System.out.println(train.getName());
train.setCost(2000);
System.out.println(train.getCostOfTrain());
System.out.println(train.getName());
System.out.println(Train.length);

System.out.println("===================================");
Train train1=new Train();
System.out.println(train1.length);
System.out.println(train1.getName());

train.length=300;
System.out.println(train.length);
System.out.println(train1.length);
}
}