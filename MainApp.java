public class MainApp {
    public static void main(String[] args) {
        // creating Attendance System object and its adapter
        AttendanceSystem attendanceSystem = new AttendanceSystem();
        SchoolManagementApp attendanceApp = new AttendanceSystemAdapter(attendanceSystem);

        // creating Grading System object and its adapter
        GradingSystem gradingSystem = new GradingSystem();
        SchoolManagementApp gradingApp = new GradingSystemAdapter(gradingSystem);

        // creating Library System object and its adapter
        LibrarySystem librarySystem = new LibrarySystem();
        SchoolManagementApp libraryApp = new LibrarySystemAdapter(librarySystem);

        // integrating 3 systems to the app
        System.out.println(attendanceApp.integrateSystem());
        System.out.println(gradingApp.integrateSystem());
        System.out.println(libraryApp.integrateSystem());
    }
}