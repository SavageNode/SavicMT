package classroster;

import classroster.controller.ClassRosterController;
import classroster.dao.ClassRosterDao;
import classroster.dao.ClassRosterDaoFileImpl;
import classroster.ui.ClassRosterView;
import classroster.ui.UserIO;
import classroster.ui.UserIOConsoleImpl;

public class StudentQuizGrades {
	public static void main(String[] args ) {
	    UserIO myIo = new UserIOConsoleImpl();
	    ClassRosterView myView = new ClassRosterView(myIo);
	    ClassRosterDao myDao = new ClassRosterDaoFileImpl();
	    ClassRosterController controller =
	    new ClassRosterController(myDao, myView, myIo);
	    controller.run();
	}
}