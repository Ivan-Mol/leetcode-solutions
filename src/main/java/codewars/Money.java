package codewars;

public interface Money {
    //1000,0.01625,0.18,1200
     static int calculateYears(double principal, double interest,  double tax, double desired) {
         int year=0;
         while (principal<desired){
             year++;
             principal=principal+((principal*interest)-(principal*interest*tax));
         }
         return year;
    }
}
