# Design Patterns Project

## Opis

Projekt ten demonstruje implementację popularnych wzorców projektowych w języku Java. Wzorce te są klasyfikowane według
ich zastosowania i pomagają w rozwiązywaniu powszechnych problemów projektowych. Każdy wzorzec przedstawiony w projekcie
jest zaimplementowany zgodnie z jego definicją oraz specyfiką.

Wzorce projektowe są podzielone na trzy główne kategorie:

## Wzorce behawioralne

Skupiają się na sposobie komunikacji między obiektami i organizacji ich współpracy. Wzorce te pomagają w zarządzaniu
przepływem sterowania i delegowaniem zadań w aplikacji.

1. [Chain of Responsibility](src/main/java/com/mtjk/patterns/behavioral/chainofresponsibility/ChainOfResponsibilityPatternDemo.java)
2. [Command](src/main/java/com/mtjk/patterns/behavioral/command/CommandPatternDemo.java)
3. [Iterator](src/main/java/com/mtjk/patterns/behavioral/iterator/IteratorPatternDemo.java)
4. [Mediator](src/main/java/com/mtjk/patterns/behavioral/mediator/MediatorPatternDemo.java)
5. [Memento](src/main/java/com/mtjk/patterns/behavioral/memento/MementoPatternDemo.java)
6. [Observer](src/main/java/com/mtjk/patterns/behavioral/observer/ObserverPatternDemo.java)
7. [State](src/main/java/com/mtjk/patterns/behavioral/state/StatePatternDemo.java)
8. [Strategy](src/main/java/com/mtjk/patterns/behavioral/strategy/StrategyPatternDemo.java)
9. [Template](src/main/java/com/mtjk/patterns/behavioral/template/TemplatePatternDemo.java)
10. [Visitor](src/main/java/com/mtjk/patterns/behavioral/visitor/VisitorPatternDemo.java)

## Wzorce kreacyjne

Koncentrują się na sposobie tworzenia obiektów, zapewniając elastyczność i efektywność w tworzeniu instancji obiektów.
Pomagają one w ukrywaniu skomplikowanego procesu tworzenia obiektów oraz zapewniają jednorodne interfejsy do tworzenia
instancji.

1. [Abstract Factory](src/main/java/com/mtjk/patterns/creative/abstractfactory/AbstractFactoryPatternDemo.java)
2. [Builder](src/main/java/com/mtjk/patterns/creative/builder/BuilderPatternDemo.java)
3. [Factory](src/main/java/com/mtjk/patterns/creative/factory/FactoryPatternDemo.java)
4. [Prototype](src/main/java/com/mtjk/patterns/creative/prototype/PrototypePatternDemo.java)
5. [Singleton](src/main/java/com/mtjk/patterns/creative/singleton/SingletonPatternDemo.java)

## Wzorce strukturalne

Oferują rozwiązania dla problemów związanych z organizacją i kompozycją klas i obiektów. Skupiają się na tym, jak różne
klasy i obiekty są ze sobą powiązane i jak można je łączyć, aby uzyskać bardziej elastyczne i skalowalne struktury.

1. [Adapter](src/main/java/com/mtjk/patterns/structural/adapter/AdapterPatternDemo.java)
2. [Bridge](src/main/java/com/mtjk/patterns/structural/bridge/BridgePatternDemo.java)
3. [Composite](src/main/java/com/mtjk/patterns/structural/composite/CompositePatternDemo.java)
4. [Decorator](src/main/java/com/mtjk/patterns/structural/decorator/DecoratorPatternDemo.java)
5. [Facade](src/main/java/com/mtjk/patterns/structural/facade/FacadePatternDemo.java)
6. [Flyweight](src/main/java/com/mtjk/patterns/structural/flyweight/FlyweightPatternDemo.java)
7. [Proxy](src/main/java/com/mtjk/patterns/structural/proxy/ProxyPatternDemo.java)

Każdy wzorzec jest zaprezentowany z przykładem implementacyjnym, który ilustruje jego użycie w praktycznych
scenariuszach. Przykłady kodu oraz towarzyszące im klasy testowe pomagają zrozumieć, jak wzorce te można zastosować w
rzeczywistych projektach programistycznych.

Zapraszam do zapoznania się z implementacjami wzorców w sekcjach powyżej oraz do eksperymentowania z nimi, aby lepiej
zrozumieć ich zastosowanie i korzyści.

## [Chain of Responsibility](src/main/java/com/mtjk/patterns/behavioral/chainofresponsibility/ChainOfResponsibilityPatternDemo.java)

Wzorzec projektowy "Chain of Responsibility" (łańcuch zobowiązań) jest używany, aby przekazać żądanie przez łańcuch
obiektów, gdzie każdy z obiektów ma szansę obsłużyć żądanie. Dzięki temu wzorcowi unika się ścisłego powiązania nadawcy
żądania z jego odbiorcą.

Załóżmy, że mamy system, który przetwarza różne typy logów (informacyjnych, debugowania, błędów). Każdy typ logów jest
obsługiwany przez różne obiekty.

**Struktura projektu:**

- [`Logger`](src/main/java/com/mtjk/patterns/behavioral/chainofresponsibility/Logger.java) — abstrakcyjna klasa bazowa
  definiująca strukturę łańcucha oraz sposób logowania.
- [`ConsoleLogger`](src/main/java/com/mtjk/patterns/behavioral/chainofresponsibility/ConsoleLogger.java), [
  `ErrorLogger`](src/main/java/com/mtjk/patterns/behavioral/chainofresponsibility/ErrorLogger.java), [
  `FileLogger`](src/main/java/com/mtjk/patterns/behavioral/chainofresponsibility/FileLogger.java) — konkretne klasy
  implementujące sposób zapisu logów.
- [
  `getChainOfLoggers()`](src/main/java/com/mtjk/patterns/behavioral/chainofresponsibility/ChainOfResponsibilityPatternDemo.java) —
  metoda tworzy łańcuch odpowiedzialności, ustawia następników w odpowiedniej kolejności.
- [`logMessage()`](src/main/java/com/mtjk/patterns/behavioral/chainofresponsibility/Logger.java) — metoda wywoływana na
  łańcuchu, która przekazuje żądanie wzdłuż łańcucha, aż do momentu, gdy zostanie ono obsłużone lub dotrze do końca
  łańcucha.
- [
  `ChainOfResponsibilityPatternDemo`](src/main/java/com/mtjk/patterns/behavioral/chainofresponsibility/ChainOfResponsibilityPatternDemo.java) —
  klasa demo
- [
  `ChainOfResponsibilityPatternDemoTest`](src/test/java/com/mtjk/patterns/behavioral/chainofresponsibility/ChainOfResponsibilityPatternDemoTest.java) —
  klasa testowa

## [Command](src/main/java/com/mtjk/patterns/behavioral/command/CommandPatternDemo.java)

Wzorzec projektowy "Command" (polecenie) jest używany do enkapsulacji żądania jako obiektu, pozwalając na parametryzację
klientów z różnymi żądaniami, kolejki lub logowanie żądań, oraz wsparcie dla odwracalnych operacji.

Załóżmy, że mamy aplikację, która symuluje prostą kontrolę pilota zdalnego sterowania dla urządzeń, takich jak światło i
telewizor.

**Struktura projektu:**

- [`Command`](src/main/java/com/mtjk/patterns/behavioral/command/Command.java) — interfejs Command
- [`Light`](src/main/java/com/mtjk/patterns/behavioral/command/Light.java) — klasa odbiorcy Light
- [`TV`](src/main/java/com/mtjk/patterns/behavioral/command/TV.java) — klasa odbiorcy TV
- [`LightOnCommand`](src/main/java/com/mtjk/patterns/behavioral/command/LightOnCommand.java) — konkretne polecenie
  LightOnCommand
- [`LightOffCommand`](src/main/java/com/mtjk/patterns/behavioral/command/LightOffCommand.java) — konkretne polecenie
  LightOffCommand
- [`TVOnCommand`](src/main/java/com/mtjk/patterns/behavioral/command/TVOnCommand.java) — konkretne polecenie TVOnCommand
- [`TVOffCommand`](src/main/java/com/mtjk/patterns/behavioral/command/TVOffCommand.java) — konkretne polecenie
  TVOffCommand
- [`RemoteControl`](src/main/java/com/mtjk/patterns/behavioral/command/RemoteControl.java) — klasa wywołująca
  RemoteControl
- [`CommandPatternDemo`](src/main/java/com/mtjk/patterns/behavioral/command/CommandPatternDemo.java) — klasa demo
- [`CommandPatternDemoTest`](src/test/java/com/mtjk/patterns/behavioral/command/CommandPatternDemoTest.java) — klasa
  testowa

## [Iterator](src/main/java/com/mtjk/patterns/behavioral/iterator/IteratorPatternDemo.java)

Wzorzec projektowy "Iterator" jest używany do sekwencyjnego przeglądania elementów w kolekcji bez ujawniania jej
wewnętrznej reprezentacji. Implementacja wzorca "Iterator" pozwala na tworzenie różnych iteracji dla tej samej kolekcji
lub różnych implementacji kolekcji z tą samą iteracją.

Załóżmy, że mamy własną kolekcję "Biblioteka książek" (`BookCollection`), a każda książka (`Book`) ma swoje informacje,
które chcemy przeglądać przy użyciu własnego iteratora.

**Struktura projektu:**

- [`Book`](src/main/java/com/mtjk/patterns/behavioral/iterator/Book.java) — klasa Book
- [`Iterator`](src/main/java/com/mtjk/patterns/behavioral/iterator/Iterator.java) — interfejs Iterator
- [`BookIterator`](src/main/java/com/mtjk/patterns/behavioral/iterator/BookIterator.java) — konkretna implementacja
  iteratora BookIterator
- [`BookCollection`](src/main/java/com/mtjk/patterns/behavioral/iterator/BookCollection.java) — klasa kolekcji
  BookCollection
- [`BookCollectionIterator`](src/main/java/com/mtjk/patterns/behavioral/iterator/BookCollectionIterator.java) — klasa
  implementująca interfejs Iterable
- [`IteratorPatternDemo`](src/main/java/com/mtjk/patterns/behavioral/iterator/IteratorPatternDemo.java) — klasa demo
- [`IteratorPatternDemoTest`](src/test/java/com/mtjk/patterns/behavioral/iterator/IteratorPatternDemoTest.java) — klasa
  testowa

## [Mediator](src/main/java/com/mtjk/patterns/behavioral/mediator/MediatorPatternDemo.java)

Wzorzec projektowy "Mediator" służy do centralizacji komunikacji pomiędzy wieloma obiektami w systemie, minimalizując
wzajemne zależności między nimi. Zamiast komunikować się bezpośrednio, obiekty wysyłają komunikaty do mediatora, który
przekazuje je do odpowiednich obiektów.

Załóżmy, że mamy prostą aplikację do czatu, w której użytkownicy mogą wysyłać wiadomości za pośrednictwem mediatora.
Będziemy implementować klasę `ChatMediator`, która zarządza komunikacją między różnymi obiektami `User`.

**Struktura projektu:**

- [`Mediator`](src/main/java/com/mtjk/patterns/behavioral/mediator/Mediator.java) — interfejs Mediator
- [`ChatMediator`](src/main/java/com/mtjk/patterns/behavioral/mediator/ChatMediator.java) — konkretna implementacja
  mediatora ChatMediator
- [`User`](src/main/java/com/mtjk/patterns/behavioral/mediator/User.java) — klasa abstrakcyjna User
- [`ConcreteUser`](src/main/java/com/mtjk/patterns/behavioral/mediator/ConcreteUser.java) — konkretna implementacja
  użytkownika ConcreteUser
- [`MediatorPatternDemo`](src/main/java/com/mtjk/patterns/behavioral/mediator/MediatorPatternDemo.java) — klasa demo
- [`MediatorPatternDemoTest`](src/test/java/com/mtjk/patterns/behavioral/mediator/MediatorPatternDemoTest.java) — klasa
  testowa

## [Memento](src/main/java/com/mtjk/patterns/behavioral/memento/MementoPatternDemo.java)

Wzorzec projektowy "Memento" jest używany do przechowywania i odtwarzania stanu obiektu bez naruszania enkapsulacji.
Pomaga to wrócić do poprzednich stanów obiektu (np. "cofnięcie" operacji).

Załóżmy, że tworzymy edytor tekstu, który może zapisywać i przywracać różne stany tekstu. Stworzymy trzy główne klasy:

**Struktura projektu:**

- [`Memento`](src/main/java/com/mtjk/patterns/behavioral/memento/Memento.java) — klasa przechowująca stan
- [`TextEditor`](src/main/java/com/mtjk/patterns/behavioral/memento/TextEditor.java) — klasa reprezentująca edytor
  tekstu
- [`Caretaker`](src/main/java/com/mtjk/patterns/behavioral/memento/Caretaker.java) — klasa zarządzająca zapisanymi
  stanami
- [`MementoPatternDemo`](src/main/java/com/mtjk/patterns/behavioral/memento/MementoPatternDemo.java) — klasa demo
- [`MementoPatternDemoTest`](src/test/java/com/mtjk/patterns/behavioral/memento/MementoPatternDemoTest.java) — klasa
  testowa

## [Observer](src/main/java/com/mtjk/patterns/behavioral/observer/ObserverPatternDemo.java)

Wzorzec projektowy "Observer" pozwala na powiadamianie wielu obiektów o zmianach stanu obiektu, na którym się
obserwują (ang. "subject" - obiekt obserwowany). Kiedy stan obiektu obserwowanego się zmienia, automatycznie
powiadamiani są wszyscy jego obserwatorzy.

Przykład implementacji wzorca "Observer" w Java może dotyczyć systemu, który powiadamia użytkowników o aktualizacjach
stanu tematu, takiego jak cena produktu w sklepie internetowym. Załóżmy, że mamy `Subject` jako temat obserwowany i
`Observer` jako interfejs dla obserwatorów.

**Struktura projektu:**

- [`Observer`](src/main/java/com/mtjk/patterns/behavioral/observer/Observer.java) — interfejs dla obserwatorów
- [`Subject`](src/main/java/com/mtjk/patterns/behavioral/observer/Subject.java) — interfejs dla obiektu obserwowanego
- [`ConcreteSubject`](src/main/java/com/mtjk/patterns/behavioral/observer/ConcreteSubject.java) — konkretna
  implementacja tematu obserwowanego
- [`ConcreteObserver`](src/main/java/com/mtjk/patterns/behavioral/observer/ConcreteObserver.java) — konkretna
  implementacja obserwatora
- [`ObserverPatternDemo`](src/main/java/com/mtjk/patterns/behavioral/observer/ObserverPatternDemo.java) — klasa demo
- [`ObserverPatternDemoTest`](src/test/java/com/mtjk/patterns/behavioral/observer/ObserverPatternDemoTest.java) — klasa
  testowa

## [State](src/main/java/com/mtjk/patterns/behavioral/state/StatePatternDemo.java)

Wzorzec projektowy "State" pozwala obiektowi zmieniać swoje zachowanie, gdy jego wewnętrzny stan się zmienia. Wzorzec
ten jest użyteczny, gdy obiekt ma wiele różnych stanów, a każdy stan ma swoje własne zachowanie.

Załóżmy, że mamy system do zarządzania stanem maszyny do sprzedaży napojów. Maszyna może być w jednym z trzech stanów:
gotowa do sprzedaży, brak napoju, brak monety.

**Struktura projektu:**

- [`State`](src/main/java/com/mtjk/patterns/behavioral/state/State.java) — interfejs stanu
- [`VendingMachine`](src/main/java/com/mtjk/patterns/behavioral/state/VendingMachine.java) — klasa kontekstowa
- [`ReadyState`](src/main/java/com/mtjk/patterns/behavioral/state/ReadyState.java) — konkretna klasa stanu - gotowa do
  sprzedaży
- [`NoCoinState`](src/main/java/com/mtjk/patterns/behavioral/state/NoCoinState.java) — konkretna klasa stanu - brak
  monety
- [`SoldOutState`](src/main/java/com/mtjk/patterns/behavioral/state/SoldOutState.java) — konkretna klasa stanu - brak
  napoju
- [`StatePatternDemo`](src/main/java/com/mtjk/patterns/behavioral/state/StatePatternDemo.java) — klasa demo
- [`StatePatternDemoTest`](src/test/java/com/mtjk/patterns/behavioral/state/StatePatternDemoTest.java) — klasa testowa

## [Strategy](src/main/java/com/mtjk/patterns/behavioral/strategy/StrategyPatternDemo.java)

Wzorzec projektowy "Strategy" pozwala na definiowanie rodziny algorytmów, które można wymieniać w trakcie działania
programu. Dzięki temu można zmieniać sposób realizacji algorytmu bez modyfikacji klienta, który z niego korzysta.

Załóżmy, że mamy system sortowania, który może używać różnych strategii sortowania (np. sortowanie przez wstawianie i
sortowanie przez scalanie). Wzorzec "Strategy" pozwoli nam na wybór algorytmu sortowania w czasie działania programu.

**Struktura projektu:**

- [`Strategy`](src/main/java/com/mtjk/patterns/behavioral/strategy/Strategy.java) — interfejs dla strategii sortowania
- [`InsertionSortStrategy`](src/main/java/com/mtjk/patterns/behavioral/strategy/InsertionSortStrategy.java) — konkretna
  implementacja sortowania przez wstawianie
- [`MergeSortStrategy`](src/main/java/com/mtjk/patterns/behavioral/strategy/MergeSortStrategy.java) — konkretna
  implementacja sortowania przez scalanie
- [`Context`](src/main/java/com/mtjk/patterns/behavioral/strategy/Context.java) — klasa kontekstowa, która używa
  strategii
- [`StrategyPatternDemo`](src/main/java/com/mtjk/patterns/behavioral/strategy/StrategyPatternDemo.java) — klasa demo
- [`StrategyPatternDemoTest`](src/test/java/com/mtjk/patterns/behavioral/strategy/StrategyPatternDemoTest.java) — klasa
  testowa

## [Template](src/main/java/com/mtjk/patterns/behavioral/template/TemplatePatternDemo.java)

Wzorzec projektowy "Template Method" definiuje szkielet algorytmu w klasie bazowej, a klasy pochodne implementują
niektóre kroki algorytmu. Wzorzec ten pozwala na zdefiniowanie szkieletu algorytmu, pozostawiając niektóre kroki do
zaimplementowania przez podklasy.

Załóżmy, że mamy system, który przetwarza różne rodzaje dokumentów, np. PDF i Word. Proces przetwarzania dokumentu może
mieć kilka wspólnych kroków, ale szczegóły dotyczące renderowania i zapisywania dokumentu mogą się różnić w zależności
od typu dokumentu.

**Struktura projektu:**

- [`AbstractDocumentProcessor`](src/main/java/com/mtjk/patterns/behavioral/template/AbstractDocumentProcessor.java) —
  klasa bazowa z metodą szablonową
- [`PDFDocumentProcessor`](src/main/java/com/mtjk/patterns/behavioral/template/PDFDocumentProcessor.java) — konkretna
  implementacja dla dokumentów PDF
- [`WordDocumentProcessor`](src/main/java/com/mtjk/patterns/behavioral/template/WordDocumentProcessor.java) — konkretna
  implementacja dla dokumentów Word
- [`TemplatePatternDemo`](src/main/java/com/mtjk/patterns/behavioral/template/TemplatePatternDemo.java) — klasa demo
- [`TemplatePatternDemoTest`](src/test/java/com/mtjk/patterns/behavioral/template/TemplatePatternDemoTest.java) — klasa
  testowa

## [Visitor](src/main/java/com/mtjk/patterns/behavioral/visitor/VisitorPatternDemo.java)

Wzorzec projektowy "Visitor" umożliwia dodanie nowych operacji do obiektów bez zmieniania ich klas. Wzorzec ten jest
użyteczny, gdy trzeba wykonywać różne operacje na różnych elementach struktury obiektów, ale nie chce się modyfikować
klas tych elementów.

Załóżmy, że mamy strukturę drzewiastą z różnymi typami węzłów, np. Book i Magazine. Wzorzec "Visitor" pozwoli nam na
dodanie operacji takich jak obliczanie wartości lub generowanie raportów, bez zmieniania klas węzłów.

**Struktura projektu:**

- [`Visitor`](src/main/java/com/mtjk/patterns/behavioral/visitor/Visitor.java) — interfejs dla wizytatora
- [`Element`](src/main/java/com/mtjk/patterns/behavioral/visitor/Element.java) — interfejs dla elementów, które odwiedza
  wizytator
- [`Book`](src/main/java/com/mtjk/patterns/behavioral/visitor/Book.java) — konkretna klasa reprezentująca książkę
- [`Magazine`](src/main/java/com/mtjk/patterns/behavioral/visitor/Magazine.java) — konkretna klasa reprezentująca
  magazyn
- [`ValueVisitor`](src/main/java/com/mtjk/patterns/behavioral/visitor/ValueVisitor.java) — konkretna implementacja
  wizytatora, która oblicza wartość
- [`ReportVisitor`](src/main/java/com/mtjk/patterns/behavioral/visitor/ReportVisitor.java) — konkretna implementacja
  wizytatora, która generuje raport
- [`VisitorPatternDemo`](src/main/java/com/mtjk/patterns/behavioral/visitor/VisitorPatternDemo.java) — klasa demo
- [`VisitorPatternDemoTest`](src/test/java/com/mtjk/patterns/behavioral/visitor/VisitorPatternDemoTest.java) — klasa
  testowa

## [Abstract Factory](src/main/java/com/mtjk/patterns/creative/abstractfactory/AbstractFactoryPatternDemo.java)

Wzorzec projektowy "Abstract Factory" pozwala na tworzenie rodzin powiązanych ze sobą obiektów bez określania ich
konkretnych klas. Wzorzec ten jest użyteczny, gdy trzeba tworzyć obiekty z kilku powiązanych klas, a klienci nie powinni
być świadomi, jakiej dokładnie klasy obiektów są tworzone.

Załóżmy, że mamy system do tworzenia interfejsów użytkownika, który może tworzyć różne rodzaje przycisków i pól
tekstowych w zależności od tego, czy jest używany styl "light" czy "dark".

**Struktura projektu:**

- [`Button`](src/main/java/com/mtjk/patterns/creative/abstractfactory/Button.java) — interfejs dla przycisków
- [`TextField`](src/main/java/com/mtjk/patterns/creative/abstractfactory/TextField.java) — interfejs dla pól tekstowych
- [`LightThemeButton`](src/main/java/com/mtjk/patterns/creative/abstractfactory/LightThemeButton.java) — implementacja
  przycisku dla stylu "light"
- [`DarkThemeButton`](src/main/java/com/mtjk/patterns/creative/abstractfactory/DarkThemeButton.java) — implementacja
  przycisku dla stylu "dark"
- [`LightThemeTextField`](src/main/java/com/mtjk/patterns/creative/abstractfactory/LightThemeTextField.java) —
  implementacja pola tekstowego dla stylu "light"
- [`DarkThemeTextField`](src/main/java/com/mtjk/patterns/creative/abstractfactory/DarkThemeTextField.java) —
  implementacja pola tekstowego dla stylu "dark"
- [`GUIFactory`](src/main/java/com/mtjk/patterns/creative/abstractfactory/GUIFactory.java) — interfejs fabryki GUI
- [`LightThemeFactory`](src/main/java/com/mtjk/patterns/creative/abstractfactory/LightThemeFactory.java) — konkretna
  fabryka dla stylu "light"
- [`DarkThemeFactory`](src/main/java/com/mtjk/patterns/creative/abstractfactory/DarkThemeFactory.java) — konkretna
  fabryka dla stylu "dark"
- [
  `AbstractFactoryPatternDemo`](src/main/java/com/mtjk/patterns/creative/abstractfactory/AbstractFactoryPatternDemo.java) —
  klasa demo
- [
  `AbstractFactoryPatternDemoTest`](src/test/java/com/mtjk/patterns/creative/abstractfactory/AbstractFactoryPatternDemoTest.java) —
  klasa testowa

## [Builder](src/main/java/com/mtjk/patterns/creative/builder/BuilderPatternDemo.java)

Wzorzec projektowy "Builder" pozwala na tworzenie złożonych obiektów krok po kroku. Wzorzec ten jest użyteczny, gdy
obiekt ma wiele opcjonalnych części lub konfiguracji, które są zależne od siebie.

Załóżmy, że mamy klasę `Computer`, którą można skonfigurować różnymi opcjami, takimi jak CPU, RAM i dysk twardy.
Wzorzec "Builder" umożliwi nam budowanie obiektów `Computer` z różnymi konfiguracjami.

**Struktura projektu:**

- [`Computer`](src/main/java/com/mtjk/patterns/creative/builder/Computer.java) — klasa produktu
- [`ComputerBuilder`](src/main/java/com/mtjk/patterns/creative/builder/ComputerBuilder.java) — klasa budowniczego
- [`ComputerDirector`](src/main/java/com/mtjk/patterns/creative/builder/ComputerDirector.java) — klasa dyrektora, która
  używa budowniczego
- [`BuilderPatternDemo`](src/main/java/com/mtjk/patterns/creative/builder/BuilderPatternDemo.java) — klasa demo
- [`BuilderPatternDemoTest`](src/test/java/com/mtjk/patterns/creative/builder/BuilderPatternDemoTest.java) — klasa
  testowa

## [Factory](src/main/java/com/mtjk/patterns/creative/factory/FactoryPatternDemo.java)

Wzorzec projektowy "Factory Method" pozwala na tworzenie obiektów bez określania ich konkretnych klas. Wzorzec ten jest
użyteczny, gdy mamy do czynienia z rodziną obiektów, które są tworzone w różny sposób w zależności od potrzeb.

Załóżmy, że mamy system do tworzenia różnych rodzajów dokumentów, takich jak PDF i Word. Wzorzec "Factory Method"
umożliwi nam tworzenie obiektów dokumentów w zależności od typu żądanego dokumentu.

**Struktura projektu:**

- [`Document`](src/main/java/com/mtjk/patterns/creative/factory/Document.java) — interfejs dla dokumentów
- [`PDFDocument`](src/main/java/com/mtjk/patterns/creative/factory/PDFDocument.java) — konkretna klasa dla dokumentów
  PDF
- [`WordDocument`](src/main/java/com/mtjk/patterns/creative/factory/WordDocument.java) — konkretna klasa dla dokumentów
  Word
- [`DocumentFactory`](src/main/java/com/mtjk/patterns/creative/factory/DocumentFactory.java) — interfejs fabryki
  dokumentów
- [`PDFDocumentFactory`](src/main/java/com/mtjk/patterns/creative/factory/PDFDocumentFactory.java) — konkretna fabryka
  dla dokumentów PDF
- [`WordDocumentFactory`](src/main/java/com/mtjk/patterns/creative/factory/WordDocumentFactory.java) — konkretna fabryka
  dla dokumentów Word
- [`FactoryPatternDemo`](src/main/java/com/mtjk/patterns/creative/factory/FactoryPatternDemo.java) — klasa demo
- [`FactoryPatternDemoTest`](src/test/java/com/mtjk/patterns/creative/factory/FactoryPatternDemoTest.java) — klasa
  testowa

## [Prototype](src/main/java/com/mtjk/patterns/creative/prototype/PrototypePatternDemo.java)

Wzorzec projektowy "Prototype" pozwala na tworzenie nowych obiektów poprzez klonowanie istniejących, co jest przydatne,
gdy tworzenie obiektów jest kosztowne lub złożone.

Poniżej przedstawiam przykład implementacji wzorca "Prototype" w Java, który demonstruje tworzenie różnych typów
`Vehicle` (np. `Car` i `Motorcycle`) poprzez klonowanie istniejących obiektów.

**Struktura projektu:**

- [`Vehicle`](src/main/java/com/mtjk/patterns/creative/prototype/Vehicle.java) — interfejs prototypu
- [`Car`](src/main/java/com/mtjk/patterns/creative/prototype/Car.java) — konkretna klasa dla samochodów
- [`Motorcycle`](src/main/java/com/mtjk/patterns/creative/prototype/Motorcycle.java) — konkretna klasa dla motocykli
- [`PrototypePatternDemo`](src/main/java/com/mtjk/patterns/creative/prototype/PrototypePatternDemo.java) — klasa demo
- [`PrototypePatternDemoTest`](src/test/java/com/mtjk/patterns/creative/prototype/PrototypePatternDemoTest.java) — klasa
  testowa

## [Singleton](src/main/java/com/mtjk/patterns/creative/singleton/SingletonDemo.java)

Wzorzec projektowy "Singleton" zapewnia, że dana klasa ma tylko jedną instancję i udostępnia globalny punkt dostępu do
tej instancji. Jest to przydatne, gdy potrzebujemy tylko jednego obiektu w całej aplikacji, na przykład do zarządzania
konfiguracją, połączeniami z bazą danych czy logowaniem.

**Struktura projektu:**

- [`Singleton`](src/main/java/com/mtjk/patterns/creative/singleton/Singleton.java) — klasa singleton
- [`SingletonDemo`](src/main/java/com/mtjk/patterns/creative/singleton/SingletonDemo.java) — klasa demo
- [`SingletonDemoTest`](src/test/java/com/mtjk/patterns/creative/singleton/SingletonDemoTest.java) — klasa testowa

## [Adapter](src/main/java/com/mtjk/patterns/structural/adapter/AdapterPatternDemo.java)

Wzorzec projektowy "Adapter" pozwala na integrację klas o niekompatybilnych interfejsach. Działa jako pomost, który
przekształca interfejs jednej klasy na interfejs innej klasy, umożliwiając współpracę obiektów, które normalnie nie
mogłyby współpracować ze sobą.

Załóżmy, że mamy system, który używa nowego interfejsu `Target`, ale mamy również starą klasę `Adaptee` z innym
interfejsem. Adapter umożliwia korzystanie z `Adaptee` za pomocą interfejsu `Target`.

**Struktura projektu:**

- [`Target`](src/main/java/com/mtjk/patterns/structural/adapter/Target.java) — interfejs docelowy
- [`Adaptee`](src/main/java/com/mtjk/patterns/structural/adapter/Adaptee.java) — klasa, której interfejs ma być
  dostosowany
- [`Adapter`](src/main/java/com/mtjk/patterns/structural/adapter/Adapter.java) — adapter, który dostosowuje interfejs
- [`AdapterPatternDemo`](src/main/java/com/mtjk/patterns/structural/adapter/AdapterPatternDemo.java) — klasa demo
- [`AdapterPatternDemoTest`](src/test/java/com/mtjk/patterns/structural/adapter/AdapterPatternDemoTest.java) — klasa
  testowa

## [Bridge](src/main/java/com/mtjk/patterns/structural/bridge/BridgePatternDemo.java)

Wzorzec projektowy "Bridge" pozwala na oddzielenie abstrakcji od jej implementacji, co pozwala na rozwijanie obu
niezależnie. Wzorzec ten jest użyteczny, gdy mamy kilka różnych implementacji dla jednej abstrakcji i chcemy móc je
niezależnie zmieniać.

Poniżej znajduje się przykład implementacji wzorca "Bridge" w Java. W tym przykładzie mamy system graficzny, w którym
różne kształty (np. `Circle` i `Square`) mogą być rysowane za pomocą różnych implementacji rysowników (np. `RedDrawer` i
`BlueDrawer`).

**Struktura projektu:**

- [`Shape`](src/main/java/com/mtjk/patterns/structural/bridge/Shape.java) — abstrakcja
- [`Color`](src/main/java/com/mtjk/patterns/structural/bridge/Color.java) — interfejs implementacji
- [`Circle`](src/main/java/com/mtjk/patterns/structural/bridge/Circle.java) — konkretna klasa abstrakcji
- [`Square`](src/main/java/com/mtjk/patterns/structural/bridge/Square.java) — konkretna klasa abstrakcji
- [`RedDrawer`](src/main/java/com/mtjk/patterns/structural/bridge/RedDrawer.java) — konkretna implementacja
- [`BlueDrawer`](src/main/java/com/mtjk/patterns/structural/bridge/BlueDrawer.java) — konkretna implementacja
- [`BridgePatternDemo`](src/main/java/com/mtjk/patterns/structural/bridge/BridgePatternDemo.java) — klasa demo
- [`BridgePatternDemoTest`](src/test/java/com/mtjk/patterns/structural/bridge/BridgePatternDemoTest.java) — klasa
  testowa

## [Composite](src/main/java/com/mtjk/patterns/structural/composite/CompositePatternDemo.java)

Wzorzec projektowy "Composite" umożliwia traktowanie pojedynczych obiektów i ich kompozycji w sposób jednorodny. Jest
przydatny do tworzenia struktur drzewiastych, w których zarówno pojedyncze obiekty, jak i ich grupy są traktowane w ten
sam sposób.

Poniżej znajduje się przykład implementacji wzorca "Composite" w Java. Przykład przedstawia strukturę folderów i plików,
gdzie foldery mogą zawierać inne foldery i pliki.

**Struktura projektu:**

- [`Component`](src/main/java/com/mtjk/patterns/structural/composite/Component.java) — interfejs kompozycji
- [`Leaf`](src/main/java/com/mtjk/patterns/structural/composite/Leaf.java) — klasa liścia - plik
- [`Composite`](src/main/java/com/mtjk/patterns/structural/composite/Composite.java) — klasa kompozycji - folder
- [`CompositePatternDemo`](src/main/java/com/mtjk/patterns/structural/composite/CompositePatternDemo.java) — klasa demo
- [`CompositePatternDemoTest`](src/test/java/com/mtjk/patterns/structural/composite/CompositePatternDemoTest.java) —
  klasa testowa

## [Decorator](src/main/java/com/mtjk/patterns/structural/decorator/DecoratorPatternDemo.java)

Wzorzec projektowy "Decorator" pozwala na dynamiczne dodawanie nowych funkcjonalności do obiektów bez zmieniania ich
struktury. Jest to przydatne, gdy chcemy rozszerzać funkcjonalność obiektów w sposób elastyczny.

Poniżej przedstawiam przykład implementacji wzorca "Decorator" w Java. Załóżmy, że mamy prosty system do rysowania
tekstów, który możemy rozszerzać o różne style dekoracyjne, takie jak pogrubienie i kursywa.

**Struktura projektu:**

- [`Text`](src/main/java/com/mtjk/patterns/structural/decorator/Text.java) — interfejs komponentu
- [`SimpleText`](src/main/java/com/mtjk/patterns/structural/decorator/SimpleText.java) — konkretna klasa komponentu
- [`TextDecorator`](src/main/java/com/mtjk/patterns/structural/decorator/TextDecorator.java) — klasa abstrakcyjna
  dekoratora
- [`BoldDecorator`](src/main/java/com/mtjk/patterns/structural/decorator/BoldDecorator.java) — konkretna klasa
  dekoratora - pogrubienie
- [`ItalicDecorator`](src/main/java/com/mtjk/patterns/structural/decorator/ItalicDecorator.java) — konkretna klasa
  dekoratora - kursywa
- [`DecoratorPatternDemo`](src/main/java/com/mtjk/patterns/structural/decorator/DecoratorPatternDemo.java) — klasa demo
- [`DecoratorPatternDemoTest`](src/test/java/com/mtjk/patterns/structural/decorator/DecoratorPatternDemoTest.java) —
  klasa testowa

## [Facade](src/main/java/com/mtjk/patterns/structural/facade/FacadePatternDemo.java)

Wzorzec projektowy "Facade" upraszcza interakcję z złożonym systemem, oferując uproszczony interfejs do jego
skomplikowanych części. Jest użyteczny, gdy chcemy zredukować liczbę interakcji z systemem i zapewnić łatwiejszy sposób
korzystania z jego funkcji.

Poniżej znajduje się przykład implementacji wzorca "Facade" w Java. Załóżmy, że mamy system, który obsługuje różne
funkcje związane z komputerem, takie jak uruchamianie systemu, ładowanie oprogramowania i uruchamianie aplikacji.
Wzorzec "Facade" zapewni uproszczony interfejs do tych funkcji.

**Struktura projektu:**

- [`Computer`](src/main/java/com/mtjk/patterns/structural/facade/Computer.java) — system, który jest złożony
- [`CPU`](src/main/java/com/mtjk/patterns/structural/facade/CPU.java) — część systemu
- [`Memory`](src/main/java/com/mtjk/patterns/structural/facade/Memory.java) — część systemu
- [`HardDrive`](src/main/java/com/mtjk/patterns/structural/facade/HardDrive.java) — część systemu
- [`ComputerFacade`](src/main/java/com/mtjk/patterns/structural/facade/ComputerFacade.java) — klasa facade
- [`FacadePatternDemo`](src/main/java/com/mtjk/patterns/structural/facade/FacadePatternDemo.java) — klasa demo
- [`FacadePatternDemoTest`](src/test/java/com/mtjk/patterns/structural/facade/FacadePatternDemoTest.java) — klasa
  testowa

## [Flyweight](src/main/java/com/mtjk/patterns/structural/flyweight/FlyweightPatternDemo.java)

Wzorzec projektowy "Flyweight" jest używany do efektywnego zarządzania dużą liczbą obiektów o podobnych właściwościach,
dzieląc wspólne dane między obiektami. Wzorzec ten jest szczególnie przydatny w przypadkach, gdy tworzymy dużą liczbę
obiektów, które mają wspólne cechy i różnią się tylko niektórymi szczegółami.

Poniżej znajduje się przykład implementacji wzorca "Flyweight" w Java. Załóżmy, że mamy system do zarządzania rysowaniem
różnych kształtów (np. okręgów) w różnych kolorach. Obiekty okręgów będą dzielić wspólne właściwości (np. promień) i
będą różnić się tylko kolorem.

**Struktura projektu:**

- [`Shape`](src/main/java/com/mtjk/patterns/structural/flyweight/Shape.java) — interfejs flyweight
- [`Circle`](src/main/java/com/mtjk/patterns/structural/flyweight/Circle.java) — konkretna klasa flyweight
- [`ShapeFactory`](src/main/java/com/mtjk/patterns/structural/flyweight/ShapeFactory.java) — fabryka flyweight
- [`FlyweightPatternDemo`](src/main/java/com/mtjk/patterns/structural/flyweight/FlyweightPatternDemo.java) — klasa demo
- [`FlyweightPatternDemoTest`](src/test/java/com/mtjk/patterns/structural/flyweight/FlyweightPatternDemoTest.java) —
  klasa testowa

## [Proxy](src/main/java/com/mtjk/patterns/structural/proxy/ProxyPatternDemo.java)

Wzorzec projektowy "Proxy" jest używany do kontrolowania dostępu do obiektów. Może pełnić różne role, takie jak
opóźnione ładowanie (lazy loading), logowanie, kontrola dostępu czy cache'owanie. Proxy działa jako zastępca dla
obiektów rzeczywistych, umożliwiając dodatkowe operacje przed lub po wywołaniu metod obiektu rzeczywistego.

Poniżej znajduje się przykład implementacji wzorca "Proxy" w Java. Załóżmy, że mamy system, który zarządza dostępem do
zasobów o dużym ciężarze (np. dokumentów). Wzorzec "Proxy" pomoże nam kontrolować dostęp do tych dokumentów i ładować je
tylko wtedy, gdy są rzeczywiście potrzebne.

**Struktura projektu:**

- [`Document`](src/main/java/com/mtjk/patterns/structural/proxy/Document.java) — interfejs
- [`RealDocument`](src/main/java/com/mtjk/patterns/structural/proxy/RealDocument.java) — konkretna klasa dokumentu
- [`DocumentProxy`](src/main/java/com/mtjk/patterns/structural/proxy/DocumentProxy.java) — klasa proxy
- [`ProxyPatternDemo`](src/main/java/com/mtjk/patterns/structural/proxy/ProxyPatternDemo.java) — klasa demo
- [`ProxyPatternDemoTest`](src/test/java/com/mtjk/patterns/structural/proxy/ProxyPatternDemoTest.java) — klasa testowa
