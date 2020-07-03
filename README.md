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
- [ ] linking the Repository in the lab-report
- [ ] finding the three errors in the code
- [ ] implementing generic Queue implementation
- [ ] implement the five maven tasks clean, validate, compile, test and site
- [ ] filling pom.xml with meta-data
> - [ ] link to git repository
> - [ ] metadata about 
- [ ]reach 100 percent test coverage
## Code Snippet

```
@Override  
public double getAlcoholPercent()  
{  
    double wholeAlcoholPercent=0;  
    double wholeVolume=getVolume();  
    for(Liquid l: liquids)  
    {  
        wholeAlcoholPercent+=l.getAlcoholPercent()*(l.getVolume()/wholeVolume);  
    }  
    return wholeAlcoholPercent;  
} 
```