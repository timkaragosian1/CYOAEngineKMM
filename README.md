#cCommerce: Cosmic Capitalism
###A Space Travel & Resource Gathering Space Choose Your Own Adventure Game

##Latest Updates
4/2/24 Currently working through capturing User Actions and Overall Game Story to be relayed back to the user on the final screen. Also need cleanup of existing code not following a secure access pattern of getters/setters.

##Introduction
-Work in progress from previous project CYOA Template (https://github.com/timkaragosian1/CYOATemplate)
-Goal is to make and have an MVP in 90 days
-First game developing, first time attempting 30-60-90 milestone experiment

##30-60-90 Day Milestone Experiment

##Productive Tooling Used

##How It Works

##How This Can Be Used

##Additional Information
Video journal detailing first 30-days of work: https://youtu.be/xQfu1FhggGg

This is a Kotlin Multiplatform project targeting Android, iOS.

* `/composeApp` is for code that will be shared across your Compose Multiplatform applications.
  It contains several subfolders:
  - `commonMain` is for code that’s common for all targets.
  - Other folders are for Kotlin code that will be compiled for only the platform indicated in the folder name.
    For example, if you want to use Apple’s CoreCrypto for the iOS part of your Kotlin app,
    `iosMain` would be the right folder for such calls.

* `/iosApp` contains iOS applications. Even if you’re sharing your UI with Compose Multiplatform, 
  you need this entry point for your iOS app. This is also where you should add SwiftUI code for your project.


Learn more about [Kotlin Multiplatform](https://www.jetbrains.com/help/kotlin-multiplatform-dev/get-started.html)…
