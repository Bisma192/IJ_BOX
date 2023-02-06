public class Main {
    public static void main(String[] args)
    {
/*        Write a Java method that will display the length of a film in the format
1h 35 mins. The method will be passed the length in minutes (i.e. 95
= 1hr 35mins)

 */
    //95mins to hours
        length(195);

    }

    public static void length(int minutes)
    {
        //double totalHours = minutes / 60 ;
        int totalHours = minutes / 60;
        int totalMinutes= minutes % 60;


        System.out.println(totalHours + "h " + totalMinutes);
    }


}