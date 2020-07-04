

*Was ist eine Queue?* ![Queue](images/queue.jpg)
Eine Datenstruktur, die Elemente nach First-In-First-Out-Prinzip bearbeitet. 

*Wofür werden Queues verwendet?*
Computer-Kartenspiele wie zum Beispiel Hearthstone, bei dem Aktionen nacheinander abgearbeitet werden. 
![Hearthstone Beschreibung](images/hearthstone.jpg)
Ein anderes Beispiel wären Tastatureingaben, Multitasksysteme, Druckerwarteschlangen, bei denen Tasks immer der Reihe nach ausgeführt werden.

*Wie kann eine Queue getestet werden?*
Am besten mithilfe von der Software J-Unit. Beispiel für die Methode poll:
~~~
 @Test
    @DisplayName("Testing: poll")
    public void testPoll()
    {
        genericQueue.offer("Hello this is the first string.");
        genericQueue.offer("This is the second string.");
        assertEquals("Hello this is the first string.", genericQueue.poll());
    }
~~~

*Was sind Generics?*
Unbestimmte Datentypen, die erst bei der Implementierung spezifiziert werden. Sie ermöglichen Typsichere Programmierung.

*Was ist eine Code Coverage bei Source Code Tests?*
Die Code Coverage zeigt prozentual an wieviel Code die Testcases abdecken.



