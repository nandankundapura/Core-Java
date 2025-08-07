class FindNumberArray {
 public static void main(String[] args) {
 int array[]={10,30,40,50,20,60};
 //int[] a;
//int b[];
for(int i=0;i<array.length;i++) {
System.out.println(array[i]);
}
int number = 60;
for(int i=0;i<array.length;i++) {
if(array[i]==number) {
System.out.println("element found "+ number+"at index"+i);
}
}
}
}