# Welcome to Duke
---
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
# User Guide
---

Duke is a **Personal Assistant Chatbot that helps a person to keep track of various things via a Command Line Interface** (CLI). If you can type fast, Duke can manage your tdo task list faster than traditional GUI apps.This product is not meant for end-users and therefore there is no user-friendly installer. 

- [Quick Start](#quick-start) 😃
- [Features](#features) 😆
  - [Viewing help](#viewing-help) : `help`
  - [Adding a task](#adding-a-task) : `todo`, `deadline`, `event`
  - [Listing all tasks](#listing-all-tasks) : `list`
  - [Marking a task as done](#marking-a-task-as-done) : `done`
  - [Locating tasks by keyword](#locating-tasks-by-keyword) : `find`
  - [Deleting a task](#deleting-a-task) : `delete`
  - [Existing the program](#existing-the-program) : `bye`
  - [Saving the data](#saving-the-data)
  - [Editing the data file](#editing-the-data-file)
- [FAQ](#faq) 🤣
- [Command Summary](command-summary) 😁

# Quick Start
---
Prerequisites: `JDK 16` or above version installed in your computer.

1. Download the latest `Duke.jar` from [here](https://github.com/Yuxinn-J/ip/releases/download/A-Release/ip.jar).
2. Copy the file to the folder you want to use as the home folder for your Duke.
3. Open a command window in that folder. Run `java -jar {filename}.jar`. Duke should start in a few seconds. 
4. Type the command in the command line and press Enter to execute it. e.g. typing `help` and pressing `Enter`will show help instructions.
  Some example commands you can try:

    - `list` : Lists all contacts.

     - `todo 5km running in src`  : Adds a task, running 5 km, to the Task List.

     - `delete 3` : Deletes the 3rd task shown in the current list.

     - `exit` : Exits the app.

5. Refer to the Features below for details of each command.

# Features
---

> ⚠️ Notes about the command format:
> > - Words in `UPPER_CASE` are the parameters to be supplied by the user.
> > 
> >   e.g., in `done INDEX`, `INDEX` is a paramter which can be used as `done 1`.
> > - Extraneous parameters for commands that do not take in parameters (such as `help`, `list` and `exit`) will be ignored.
> > 
> >   e.g., if the command specifies `help 123`, it will be interpreted as `help`.


## Viewing help
---
🔷 Shows help instructions.

🚩 Format: `help`

## Adding a task
---
🔷 Adds a task to the task list. **Duke provides three types of tasks:**
  1. `todo` : ToDos without any date/time attached to it.
      - 🚩 Format: `todo DESCRIPTION`
      - 🟢 Examples: `todo borrow book`.
      
  2. `deadline` : Deadlines that need to be done before a specific date/time.
      - 🚩 Format: `deadline DESCRIPTION /by DATE`
      - 🟢 Examples: `deadline return book /by Sunday`.  
      
  3. `event` : Events that start at a specific time and ends at a specific time..
      - 🚩 Format: `event DESCRIPTION /at TIME`
      - 🟢 Examples: `event project meeting /at Mon 2-4pm`.
      
## Listing all tasks
---
🔷 Shows a list of all tasks in the list.

🚩 Format: `list`

## Marking a task as done
---
🔷 Marks the task identified by the index number used as done.

🚩 Format: `done INDEX`
  - Marks the task at the specified `INDEX`.
  - The index refers to the index number shown in the displayed task list.
  - The index **must be a positive integer** 1, 2, 3, …

🟢 Examples:
  - `list` followed by `done 2` marks the 2nd task in the task list as done.
  - `find book` followed by `done 1` marks the 1st task in the results of the `find` command.

## Locating tasks by keyword
---
🔷 Finds tasks whose descriptions contain the given keywords.

🚩 Format: `find KEYWORD`
  - The search is case-insensitive. e.g `hans` will match `Hans`.
  - The order of the keywords does matter. e.g. `book read` will not match `read book`.
  - Only the description of task is searched.
  - As long as description contains keyword, it will be matched e.g. `running` will match `run`.

🟢 Examples:
  - `find lab` returns `todo cs2030 lab1` and `deadline review cz2005 lab quiz /by tonight`.

## Deleting a task
---
🔷 Deletes the specified task from the task list.

🚩 Format: `delete INDEX`
  - Deletes the task at the specified `INDEX`.
  - The index refers to the index number shown in the displayed task list.
  - The index **must be a positive integer** 1, 2, 3, …

🟢 Examples:
  - `list` followed by `delete 2` deletes the 2nd task in the task list.
  - `find book` followed by `delete 1` deletes the 1st task in the results of the `find` command.

## Existing the program
---
🔷 Exits the program.

🚩 Format: `bye`

## Saving the data
---
🔷 Duke task list data are saved in the hard disk automatically after any command that changes the data. There is no need to save manually.

## Editing the data file
---
🔷 Duke task list data are saved as a JSON file [JAR file location]/data/duke.json. Advanced users are welcome to update data directly by editing that data file.
> ❗ **Caution:**
>  If your changes to the data file makes its format invalid, AddressBook will discard all data and start with an empty data file at the next run.

# FAQ
---
**Q:** How do I transfer my data to another Computer?

**A:** Install the app in the other computer and overwrite the empty data file it creates with the file that contains the data of your previous Duke home folder.

# Command Summary
---

Action              | Format                         | Example                              |
--------            | ------------------------------ | ------------------------------------ |
**Add_Todo**      | `todo DESCRIPTION`             | `todo borrow book`                   |
**Add_Deadline**  | `deadline DESCRIPTION /by DATE`| `deadline return book /by Sunday`    |
**Add_Event**     | `event DESCRIPTION /at TIME`   | `event project meeting /at Mon 2-4pm`|
**Done**          | `done INDEX`                   | `done 2`                             |
**Delete**        | `delete INDEX`                 | `delete 3`                           |
**Find**          | `find KEYWORD`                 |`find Book`                           |
**List**          |`list`                          |                                      |
**Help**          | `help`                         |                                      |
**Exit**          | `exit`                         |                                      |

