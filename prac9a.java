import java.util.Scanner;
interface Story{
    	void showStory();
}

interface Direction{
    	void showDirection();
}
class Movie implements Story, Direction
{
    	String movieName;

 void getMovie()
    	{
        	Scanner sc = new Scanner(System.in);

		System.out.println("====Multiple Inheritance using the interface====");

        	System.out.print("Enter movie name: ");
        	movieName = sc.nextLine();
    	}
		public void showStory(){	
        	getMovie();
        	System.out.println("Movie Story: Excellent and engaging");
    	}

    	public void showDirection(){
        	System.out.println("Movie Direction: Outstanding and well executed");
    	}
}

public class prac9a
{
    	public static void main(String[] args)
    	{
        	Movie m = new Movie();
		
        	m.showStory();
        	m.showDirection();
    	}
}