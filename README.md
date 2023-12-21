Intro:
MyFamilyApplication is a Spring Boot Web App using a database connected with MySQL to manage a list of appointments for your children. 

App Functionality:
Log in with username 'guest' and passsword of 'password123' to demo. Database running with MySQL with Docker. 
After logging in, you will be taken to the Home Page where your username is displayed along with a link to the list of appointments page.
The list of appointments page displays each provider/service for each child, the appointment date, if it is overdue, a button to edit, and a button to delete the appointment/service. 
Below the list of appointments is a button to add another provider/service with an appointment date calendar using Bootstrasp Datepicker.
With the Navigation Bar at the top you are able to navigate to the Home Page, Appointments Page, and Log Out.  

ReadMe Folder:
Included you will see an album of screenshots from using the app, the data showing in MySQL, and the calendar usage with updating appointments.

Resources/Tools Used to Develop App:
Eclipse IDE
Java Code
Spring Boot - Frameworks within made it easier to build and implement features in the app.
Spring Security - Authentication and access-control framework used for login authentication. 
JPA/Hibernate - Mapped attributes to tables and implemented them. (@Entity for rows, @Id, @GeneratedValue for the primary keys in the table)
Docker, MySQL
