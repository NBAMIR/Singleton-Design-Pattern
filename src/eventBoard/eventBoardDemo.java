package eventBoard;

public class eventBoardDemo {
	public static void main(String[] args) {

	      //illegal construction:
	      //eventBoard eventboard = new eventBoard();

	      eventBoard eventboard = eventBoard.getInstance();

	      eventboard.showMessage();
	      
	      eventboard.getEvents();
	      
	      eventboard.displayEvents();
	      
	      eventboard.orderByCategory();
	      
	      eventboard.orderByDate();
	   }
}
