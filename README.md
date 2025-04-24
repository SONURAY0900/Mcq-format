# Java Multiple Choice Quiz Application

A GUI-based quiz application built using Java AWT. Allows users to take timed quizzes, view results, and retake the test.

## Features 🚀

- 🔒 **Login Screen**: Predefined credentials (Username: `user`, Password: `123`)
- ⏳ **Timed Questions**: 30-second timer with color-coded warnings
- 🔀 **Randomized Questions**: Shuffled order for each attempt
- 📊 **Result Summary**: Displays score, percentage, and options
- 🔄 **Retest Option**: Quick restart capability
- 🖼️ **Visual Feedback**: Icons indicate selection (`yes.JPG`/`no.PNG`)

## Prerequisites 📋

- Java JDK 8+
- Basic command line knowledge
- Image files: `yes.JPG` and `no.PNG` in root folder

## Installation & Usage 🛠️

1. **Clone repository**:
   ```bash
   git clone https://github.com/your-username/java-quiz-app.git
   cd java-quiz-app
   Compile files:

## bash
javac LoginPMcq.java PMcq.java Question.java ResWin.java
Run application:

## bash
java LoginPMcq
Use credentials:


## Quiz controls:
Single-select answers
Next button progresses quiz
Auto-submit when timer expires

## Notes 📝
Questions are hardcoded in PMcq.java (modify loadQue() to update)
UI uses legacy AWT components
Ensure image files exist in project root
Percentage calculated as (score/9)*100

## License 📜
  MIT License - free for educational/modification use
     This version:
       - Maintains all key information from both versions
       - Uses modern emoji headings
       - Combines installation/usage steps
       - Presents requirements clearly
       - Keeps important notes about limitations
       - Uses consistent markdown formatting
