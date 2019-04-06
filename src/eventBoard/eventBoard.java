package eventBoard;

public class eventBoard {
	
	   private static eventBoard instance = new eventBoard();

	   private eventBoard(){}

	   public static eventBoard getInstance(){
	      return instance;
	   }

	   public void showMessage(){
	      System.out.println("Event Board created using Singleton Design Pattern.");
	   }
	   
	   public void displayEvents(){
		      System.out.println("Events Displayed.");
		   }
	   
	   public void getEvents(){
		      System.out.println("Retreiving Event Information.");
		   }
	   
	   public void orderByCategory(){
		      System.out.println("Events ordered by category.");
		   }
	   
	   public void orderByDate(){
		      System.out.println("Events ordered by Date.");
		   }
}
