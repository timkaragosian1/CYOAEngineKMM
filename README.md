# cCommerce: Cosmic Capitalism (now 2135: Resource Crisis)
### A Space Travel & Resource Gathering Choose Your Own Adventure Game

![alt text](https://github.com/timkaragosian1/CYOAEngineKMM/blob/main/composeApp/src/commonMain/composeResources/drawable/open_screen_bkg1.jpeg)

## Quick Start
To use this application, clone this repsitory to a local directory and open and build using Android Studio. Open the CYOAEngineKMM folder and run the composeApp. If you have Xcode and a Simulator device installed on a Mac computer, you can also run the iosApp from Android Studio. Alternatively, you can run the iosApp through Xcode by opening iosApp.xcodeproj in the iosApp folder of the project.

Main branch will be the last stable feature update. An unmerged branch will be the current "work-in-progress" branch and may not be stable.

## Latest Updates
4/15/24 Database work is prepared with some fixes for the Facial Scan Screen as well being merged into the Main branch. DB features are currently disabled as there is no API to tie in to at this time. This was enabler patterns and PoC. Next up is creating a new private repo and creating the end-to-end game. This repo will remain open as a code base for reference and as a base template CYOA game engine to create others from or tune to different stories.

## Introduction
- Work in progress from previous project CYOA Template (https://github.com/timkaragosian1/CYOATemplate) and the CYOATemplate concept came from a Text-Based Adventure Tutorial (https://www.youtube.com/watch?v=_NRVn2JJ1JM&list=PL_QPQmz5C6WVWGhGVlT25UGYFUt7k9DGX).
- Created in Android Studio and builds an iOS and Android application via Kotlin Multiplatform Mobile.
- Goal is to make and have an MVP in 90 days with an option of continuing development further
- First game ever that I'm developing, first time attempting 30-60-90 milestone experiment
- This repo will continue its existence as a kind of CYOA game engine that I will build complete games from

## 30-60-90 Day Milestone Experiment
- First 30 validates feasibility of concept (30-day Milestone Video: https://youtu.be/xQfu1FhggGg)
- Second 30 validates if it will work end-to-end (day 31-60 Video Journal: https://youtu.be/REyL-21i8g4)
- Final 30 days is polishing the MVP and feedback from users to determine if there's value in continuing development
- Repeat final 30-day task of polishing and feedback from users/audience to continue growth

![alt text](https://github.com/timkaragosian1/CYOAEngineKMM/blob/main/composeApp/src/commonMain/composeResources/drawable/considering_rockets.jpeg)

## Productive Tooling Used
Productivity tooling so far has been Google and Jetbrains Android and KMM docs and training (https://developer.android.com/jetpack, https://developer.android.com/courses, https://developer.android.com/courses, https://www.jetbrains.com/help/kotlin-multiplatform-dev/multiplatform-getting-started.html), DALL-E for AI Image generation for art (https://create.microsoft.com/en-us/features/ai-image-generator), ChatGPT for quick information I don't know and resource searches (https://chat.openai.com/), Trello and Google Drive docs for organization, sharing, structure, and priority of work(https://trello.com/, https://www.google.com/drive/). I have also been leaning on the teachings of Philipp Lackner YT (https://www.youtube.com/@UCKNTZMRHPLXfqlbdOI7mCkg).
I am searching for more and will add as I discover them. Even tools that only increase productivity a little (0.01%) are considered as the more productive the tools can make me, the better prepared I will be for more efficient work.

## How It Works/Will Work
- User Opens Application
- One Time Functionality: Application checks for updates while uploading user actions on previous adventures, if ver is different, downloads and applies new game events
- Title screen to start game
- User CEO Name and Company Name
- Facial Scan Screen
- Game event starts and all the magic happens. Driven from Event and decision objects. Events are the most complex thing and have to have their data accessible from a number of levels to pass between screens. Event type will determine if the user action and story elements are captured.
- Game over user is treated to a story of their adventure
- Goes back to title screen and the loop can begin again

## How This Can Be Used
- Driven by Events and decisions, can be easily replaced with anything
- Removing the event folder and redoing the UI for the first few screen could make this into an entire different thing. Could be a biz app showing product solutions for various issues that can drill them down into.
- Anything that's a flowchart can be applied and made into this.
- I could craft thousands of adventures from this
- If this is successful, the future versions of this will have animations, sound, and more cinematic interactivity as I expand my capabilities 

![alt text](https://github.com/timkaragosian1/CYOAEngineKMM/blob/main/composeApp/src/commonMain/composeResources/drawable/rocket_blueprint.jpeg)

## High Level Development Plan
* Establish Structure - DONE
* Prove out gameplay - DONE
* Organize with "Core" resources - DONE
* Audio Functionality - DONE
* End Game Features (Screen & Dates System) - DONE
* Capture User Actions in DB - DONE
### FROM HERE, PROGRESS WILL CONTINUE ON A PRIVATE BRANCH  WITH:
* Intial Story Events to Prove Out Positive End Game Path (time runs out without ship lost)
* Intial Story Events to Prove Out Negative End Game Path (ship lost)
* Refinement of Features & Tech debt
* Story Event Expansion and Developnment
* Interactivity Feature Updates

## Additional Information
Email me to discuss anything at timkaragosian@gmail.com.

Video journal detailing first 30-days of work: https://youtu.be/xQfu1FhggGg

![alt text](https://github.com/timkaragosian1/CYOAEngineKMM/blob/main/composeApp/src/commonMain/composeResources/drawable/usa_resource_company.jpeg)

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
