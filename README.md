# Student Management System

## Overview

The **Student Management System** is a Java-based application that allows users to manage student grades and login information. The system provides a secure login, displays personal and class averages, and allows the user to change their password. This project uses file handling to store and read data, including student grades and passwords.

## Features

- **User Login**: Secure login system where users can enter their credentials (student IDs and passwords).
- **Grade Display**: Displays individual and class averages for subjects.
- **Password Management**: Users can change their passwords through the application.
- **User Interface**: Built using Java Swing for a graphical user interface (GUI) to display grades, personal averages, and more.

## Project Structure

- **Main.java**: The entry point of the application, handles user login and initialization of the main menu.
- **Mainmenu.java**: Displays the user's grades and other details like class averages, absence, and personal average.
- **Login.java**: Handles the login functionality and redirects users to the main menu if credentials are correct.
- **Grades.java**: Reads and processes student grade data from files.
- **PasswordHashmap.java**: Manages reading and updating passwords for users stored in a text file.
## Example Usage

### Login

Upon running the program, the user will be prompted with:

![My Image](java-projects/github1.png)

```plaintext
Enter Student ID:
> Student1

Enter Password:
> password123
```
If the credentials are correct, the user will be redirected to the main menu where they can view their grades, averages, and more. The color of the text that indicates the average of the student is written depends on whether it is greater or smaller than the class average.

## Code Explanation

### `PasswordHashmap.java`

This class is responsible for handling the user authentication and password management.

- **Attributes**:
  - `userInfo`: A `HashMap` that stores student IDs as keys and their corresponding passwords as values.
  - `fileReader`, `reader`, `file`: These handle file reading and writing to the `passwords.txt` file.

- **Methods**:
  - `userInfos()`: Reads the `passwords.txt` file and loads the student IDs and their passwords into the `userInfo` HashMap.
  - `ChangePassword(String studentNo, String newPass)`: Changes the password for a specified student by updating the `userInfo` HashMap and writing the new password to the file.

### `Main.java`

This class is the entry point of the application. It handles the user interaction and invokes the `PasswordHashmap` methods to manage login and password changes.

### `passwords.txt`

This file contains the student credentials. The file follows a simple format:

```plaintext
Student1
password123
Student2
password456
Student3
password789
