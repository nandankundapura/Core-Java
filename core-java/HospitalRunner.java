class HospitalRunner{
 public static void main(String[] args) {
String[] doctorNames=Hospital.getDoctorNames();
System.out.println(doctorNames);
for(int j=0;j<doctorNames.length;j++) {
 System.out.println(doctorNames[j]);
}
}
}