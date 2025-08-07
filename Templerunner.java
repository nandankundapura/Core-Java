class TempleRunner {
 public static void main(String[] args) {
 Temple[] temples=new Temple[2];
 
Temple temple1=new Temple();
temple1.setName("Isckon");
temple1.setAddress("Rajajinagar");
 
Temple temple2=new Temple();
temple2.setName("Circle Maramma");
temple2.setAddress("BTM");

for(int i=0;i<temples.length;i++) {
if(i==0) {
temples[i]=temple1;
} else if (i==1) {
temples[i]=temple2;
}
}
for(int i=0;i<temples.length;i++) {
Temple temple=temples[i];
if(temple !=null) {
System.out.println(temple.getName());
System.out.println(temple.getAddress());
}
}
}
}