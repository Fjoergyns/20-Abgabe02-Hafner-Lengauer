# 20-Abgabe01-Hafner-Lengauer
This is a project by Nadine Hafner and Johannes Lengauer

The purpose of this project is practicing with Maven.
An existing Java-Project, implemented by our lectors, named "Queue" will be extended.
The project "Queue" already contains:
- StringQueue.java: String implementation for Queue
- IQueue.java: Interface for Queue implementation
- StringQueueTest.java: Empty TestClass to test String implementation of Queue

******

Tasklist:
- [x] starting the lab-report
- [x] copying the project in correct structure 
- [x] summarize project (above)
- [x] linking the Repository in the lab-report
- [x] finding the three errors in the code
- [x] implementing generic Queue implementation
- [ ] implement the five maven tasks clean, validate, compile, test and site
- [x] filling pom.xml with meta-data
> - [x] link to git repository
> - [x] metadata about developers
- [x] reach 100 percent test coverage


## Code Snippet
How to test Exceptions
```
public void testRemoveNull()
    {
        assertThrows(NoSuchElementException.class, () -> genericQueue.remove());
    }
```