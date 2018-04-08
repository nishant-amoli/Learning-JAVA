package nestedClass;
interface Identity {
	   String name();
	}

	public class AnonymousClassAsArguement {
	   public void displayMessage(Identity n) {
	      System.out.println("Demonstration of anonymous inner class as an argument.\n@Nishant Amoli,B.Tech IT\n\n"+n.name() );  
	   }

	   public static void main(String args[]) {
		   AnonymousClassAsArguement obj = new AnonymousClassAsArguement();

	      // Passing an anonymous inner class as an argument
	      obj.displayMessage(new Identity() {
	         public String name() {
	            return "Nishant";
	         }
	      });
	   }
	}