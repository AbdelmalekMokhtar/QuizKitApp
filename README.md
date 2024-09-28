# Quiz Application

![License](https://img.shields.io/github/license/AbdelmalekMokhtar/quizapp)
![Platform](https://img.shields.io/badge/platform-Android-blue)
![Kotlin](https://img.shields.io/badge/kotlin-%230095D5.svg?style=for-the-badge&logo=kotlin&logoColor=white)

## Overview

Quiz Application is an Android-based app that allows users to take quizzes on various topics. The app fetches quiz data from an API and presents it to the user in a fun and interactive manner. Users can select the number of questions, category, difficulty, and type of questions they want to answer.

## Features

- Fetches quiz questions dynamically from an API.
- Customizable quiz options: amount of questions, category, difficulty, and question type.
- Real-time scoring system.
- Clean and user-friendly interface built with **Jetpack Compose**.
- Supports multiple quiz categories.

## Screenshots

### Screenshot 1
![Screenshot 1](https://github.com/username/repo_name/raw/main/screenshot1.png)

### Screenshot 2
![Screenshot 2](https://github.com/username/repo_name/raw/main/screenshot2.png)

### Screenshot 3
![Screenshot 3](https://github.com/username/repo_name/raw/main/screenshot3.png)

### Screenshot 4
![Screenshot 4](https://github.com/username/repo_name/raw/main/screenshot4.png)

### Screenshot 5
![Screenshot 5](https://github.com/username/repo_name/raw/main/screenshot5.png)


## Technologies Used

- **Kotlin**: Main programming language.
- **Jetpack Compose**: UI toolkit for building native Android apps.
- **Retrofit**: For handling network requests and API integration.
- **Coroutines**: For managing background threads and asynchronous programming.
- **ViewModel**: For managing UI-related data in a lifecycle-conscious way.
- **KOIN**: For dependency injection.

## Architecture

The application follows the **MVVM** (Model-View-ViewModel) architecture pattern:

- **Model**: Responsible for managing the app's data (e.g., fetching data from the quiz API).
- **View**: The UI layer displaying the data to the user.
- **ViewModel**: Acts as a bridge between the Model and View, ensuring the separation of concerns.

## How to Run the Project

1. **Clone the repository**:
   ```bash
   git clone https://github.com/AbdelmalekMokhtar/quizapp.git
