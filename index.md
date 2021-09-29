# Welcome to Duke

# User Guide

Duke is a **Personal Assistant Chatbot that helps a person to keep track of various things via a Command Line Interface** (CLI) while still having the benefits of a Graphical User Interface (GUI). If you can type fast, Duke can get your contact management tasks done faster than traditional GUI apps..This product is not meant for end-users and therefore there is no user-friendly installer. 

- [Quick Start](#quick-start) 😃
- [Features](#features) 😆
  - [Viewing help](#viewing-help) : `help`
  - [Adding a task](#adding-a-task) : `todo`, `deadline`, `event`
  - [Listing all tasks](#listing-all-tasks) : `list`
  - [Marking a task as done](#marking-a-task-as-done) : `done`
  - [Locating tasks by keyword]() : `find`
  - [Deleting a task]() : `delete`
  - [Existing the program]() : `exit`
  - [Saving the data]()
  - [Editing the data file]()
- [FAQ](#faq) 🤣
- [Command Summary](command-summary) 😁

# Quick Start
Prerequisites: `JDK 11` or above version installed in your computer.

1. Download the latest `Duke.jar` from [here]().
2. Copy the file to the folder you want to use as the home folder for your Duke.
3. Double-click the file to start the app. The GUI similar to the below should appear in a few seconds. Note how the app contains some sample data.
4. Type the command in the command box and press Enter to execute it. e.g. typing help and pressing Enter will show help instructions.
  Some example commands you can try:

  - `list` : Lists all contacts.

   - `todo 5km running in src`  : Adds a task, runninf 5 km, to the Task List.

   - `delete 3` : Deletes the 3rd task shown in the current list.

   - `exit` : Exits the app.

5. Refer to the Features below for details of each command.

   ```
   Hello from
                  ░░░░░░░▄█▄▄▄█▄░░░░░░░
                  ▄▀░░░░▄▌─▄─▄─▐▄░░░░▀▄
                  █▄▄█░░▀▌─▀─▀─▐▀░░█▄▄█
                  ░▐▌░░░░▀▀███▀▀░░░░▐▌
                  ████░▄█████████▄░████
   __     __         _       _     
   \ \   / /        (_)     ( )       ____        _        
    \ \_/ /   ___  ___ _ __ |/ ___   |  _ \ _   _| | _____ 
     \   / | | \ \/ / | '_ \  / __|  | | | | | | | |/ / _ \
      | || |_| |>  <| | | | | \__ \  | |_| | |_| |   <  __/
      |_| \__,_/_/\_\_|_| |_| |___/  |____/ \__,_|_|\_\___|
    
   ```

# Features

> ⚠️ Notes about the command format:
> > - comming soon


## Viewing help
🔷 Shows help instructions.

🚩 Format: `help`

## Adding a task
🔷 Adds a task to the address book.

## Listing all tasks
🔷 Shows a list of all tasks in the list.

🚩 Format: `list`

## Marking a task as done
🔷 Marks the task identified by the index number used as done.

🚩 Format: `done INDEX`
  - Marks the task at the specified `INDEX`.
  - The index refers to the index number shown in the displayed task list.
  - The index **must be a positive integer** 1, 2, 3, …

🟢 Examples:
- `list` followed by `done 2` marks the 2nd task in the task list as done.
- `find book` followed by `done 1` marks the 1st task in the results of the `find` command.

# FAQ
**Q:** How do I transfer my data to another Computer?

**A:** Install the app in the other computer and overwrite the empty data file it creates with the file that contains the data of your previous Duke home folder.

# Command Summary
| **Action** | **Format, Examples**  |
| :---:   | :-: |
| **Add** | 301 |
| **Add** | 301 |
| **Add** | 1 |
| **Done** | 301 |
| **Delete** | `delete INDEX` <br /> e.g., `delete 3` |
| **Find** | `find KEYWORD` <br /> e.g. `find Book` |
| **List** |`list` |
| **Help** | `help` |
| **Exit** | `exit` |
