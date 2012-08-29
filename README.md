'LoginPortal' is implementation of login procedure in company with proper database integration.
For demonastration purpose I created it for my company (www.digitalgradient.com)

What It will do :-
This portal will ask the user to input his/her "username" and "password" it will check the existence of this
user in the database if exists, retrieve his/her name and location from the databse and display them.If not registered, Display invalid user.

Tools Used :-

1] JSP Servlet for backend

2] twitter bootstrap for frontend decoration

3] mysql as database

4] eclipse IDE for development


Features :-

1] user authentication from database table

2] dashboard can be used for further enhancement


How to use :-

1] open configuration file (DB.properties) of database present @ LoginPortal / WebContent / config / 

2] update DB.properties with your database username,password and hostname

3] open file (ConnectionHandler.java ) present @ LoginPortal / src / com / digitalgradient / portal / db /

4] change at line no 19 , [ ConfigProperties.initialize("<file path >");] with path of ur dB configuration file
you can give realtive path if project is kept in serrver itself else need to give absolute path

5] create a table in your database ,name it users and create the columns: 'username', 'password', 'name',
and 'location';

6] compile the project, now you are ready to deploy WebContent folder on server



For better understanding and screenshots check out wiki of this project
( https://github.com/deepakmodak/LoginPortal/wiki )