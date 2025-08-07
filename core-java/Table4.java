class Table4 {
public static void main(String[] args) {
int[] threeTable = new int[10];
for (int i=0;i<threeTable.length;i++) {
threeTable[i]=4*(i+1);
}
for(int i=1;i<threeTable.length;i++) {
 threeTable[i-1]=4*i;
}
System.out.println("4's Multiplication table");
for(int i=0;i<threeTable.length;i++)
{
System.out.println(threeTable[i]);
}
}
}