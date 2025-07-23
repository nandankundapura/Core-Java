class Train{
private String name;
private int cost;
private int speed;
 
public static int length;
static
{
System.out.println("static block in train");
length=100;
}
{
System.out.println("non-static block in train");
length=200;
}

public void setName(String trainName){
name=trainName;
}

public String getName(){
return name;
}
public void setCost(int trainCost){
cost=trainCost;
}
public int getCostOfTrain(){
return cost;
}
}


