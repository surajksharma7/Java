class main {

    class MarksException extends Exception {
        public MarksException(String message) {
            super(message);
        }
    }

    public void checkMarks(int marks) throws MarksException {
        if (marks < 40) {
            throw new MarksException("below the passing grade: " + marks);
        } else {
            System.out.println("Marks are : " + marks);
        }
    }
}

public class Main{
    public static void main(String[] args) {
        MarksChecker checker = new MarksChecker();
        int marks = 35;

        try {
            checker.checkMarks(marks); 
        } catch (MarksException e) {
            System.out.println(e.getMessage());
        }
    }
}
