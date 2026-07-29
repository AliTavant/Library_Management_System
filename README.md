#  Library Management System (Java)

A simple **Library Management System** built using **Core Java** and **Object-Oriented Programming (OOP)** concepts. The application allows users to manage books through a menu-driven console interface.

---

## Features

- Add a new book
- Remove a book
- Display all books
- Search a book by title
- Update book details
- Track book availability using Enum
- Menu-driven console application

---

## Technologies Used

- Java
- Object-Oriented Programming (OOP)
- Collections Framework (`ArrayList`)
- Enum
- Exception Handling
- Scanner (Console Input)

---

## Project Structure

```
Library_Book_Management_System/src/
│
├── Main.java
├── Book.java
├── LibraryManagement.java
├── LibraryManagementService.java
├── NobookprsentException.java
├── BookNotFoundException.java
└── README.md
```

---

## Book Attributes

Each book contains the following information:

| Attribute | Description |
|-----------|-------------|
| Book ID | Unique identifier |
| Title | Name of the book |
| Author | Author of the book |
| ISBN | ISBN number |
| Status | A / NA |

---

## Status Enum

```java
public enum Status {
    A,
    NA
}
```

- **A** → Available
- **NA** → Not Available

---

## Menu

```
========== Library Management System ==========
1. Add Book
2. Remove Book
3. Display All Books
4. Search Book
5. Update Book
6. Exit
===============================================
```

---

## OOP Concepts Used

### Classes
- Book
- LibraryManagement

### Interface
- LibraryManagementService

### Encapsulation
Private fields with getters and setters.

### Abstraction
Implemented using the `LibraryManagementService` interface.

### Polymorphism
Method overriding through interface implementation.

### Enum
Used for representing book availability.

### Exception Handling
```
Custom exception for handling book-not-found scenarios.
Custom exception for handling Library Empty scenarios.
```


## Collections Used

```java
ArrayList<Book>
```

Stores all books available in the library.

---

## Search Operations

Search by

- Title

---

## Update Operation

Allows updating:

- Title
- Author
- ISBN
- Status

---

## Sample Output

```
========== Library Management System ==========
1. Add Book
2. Remove Book
3. Display All Books
4. Search Book
5. Update Book
6. Exit

Enter your choice : 1

Enter Book ID : 101
Enter Title : Java Programming
Enter Author : James Gosling
Enter ISBN : 9781234567

```

---

##  How to Run

### Compile

```bash
javac *.java
```

### Run

```bash
java Main
```

---

## Example Workflow

1. Add a book.
2. Display all books.
3. Search a book by title.
4. Update the book details.
5. Remove the book.
6. Exit the application.

---


---
