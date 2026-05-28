# SALIE AI (Android - Java + XML)

SALIE AI is a 3-mode university student assistant:

- **Study Mode**: AI tutor, notes, quizzes, flashcards, pomodoro, GPA.
- **Style Mode**: outfits, weather-based fashion, campus looks, color matching.
- **Life Mode**: planner, reminders, habits, water/sleep, expenses, mood tracking.

This repository is a **working scaffold** built with **Java + XML** and prepared for:

- Firebase Auth / Firestore / Storage (currently **mocked** so it runs without keys)
- OpenAI API (currently **stubbed**)

## Open in Android Studio

1. Android Studio → **Open** → select this folder (`SALIE-AI`)
2. Let Gradle sync.

If Gradle wrapper files are missing on your machine, Android Studio will prompt to create/update them.

## What’s implemented (v1 scaffold)

- Authentication screens (mock login)
- Main app with Bottom Navigation: Home / Study / Style / Life / Profile
- Home dashboard UI with purple gradient + rounded cards
- Settings toggle for Dark Mode is planned (theme already split light/dark)
