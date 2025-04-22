Java Multiple Choice Quiz Application
A simple Java AWT-based multiple choice quiz application with a login system. This application features a multiple choice quiz on Java programming concepts with a timer, scoring system, and result display.
Application Components
Login System

Requires username "user" and password "123" to access the quiz
Simple authentication interface built with Java AWT

Quiz Features

Multiple choice questions about Java programming concepts
Timer (30 seconds per question)
Visual feedback for correct/incorrect answers using images
Score tracking and percentage calculation
Random question order using Collections.shuffle()

Result Window

Displays final score and percentage
Options to restart the quiz or exit the application

Classes Overview

LoginPMcq: Entry point for the application with login form
PMcq: Main quiz interface with questions, timer, and score tracking
Question: Object class to store question data and answer options
ResWin: Results window showing final score and percentage

How to Run

Compile all Java files:
javac *.java

Run the application:
java LoginPMcq

Login with:

Username: user
Password: 123



Screenshots
The application uses "no.PNG" (sad face) and "yes.JPG" (cool smiley) images for visual feedback during the quiz.
Requirements

Java Runtime Environment (JRE)
The application uses Java AWT for the graphical interface

Notes
This is a simple educational application demonstrating:

Basic Java GUI programming with AWT
Event handling in Java
Object-oriented design principles
Multithreading (for the timer functionality)
