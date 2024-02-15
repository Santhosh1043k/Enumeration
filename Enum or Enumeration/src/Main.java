
enum Day{
    SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY;
    private Day (){
        System.out.println("constructor called");
    }
}
public class Main {
    public static void main(String[] args) {
      Day day = Day.MONDAY;
        switch (day){
            case MONDAY : System.out.print("Its a work starts day");
            break;

            case SUNDAY : System.out.print("Its a holiday");
            break;
        }
    }
}