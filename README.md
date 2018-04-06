<img alt="Logo" src="http://coderslab.pl/svg/logo-coderslab.svg" width="400">

#  Java Podstawy - Metody
Pamiętaj aby rozwiązania do zadań umieszczać w odpowiednich plikach `java`, przygotowanych do zadań.  


#### Zadanie 1 - rozwiązywane z wykładowcą.

W pliku `Main1.java`

1. Napisz metodę `static int square(int num)`, która zwróci wartość `num` podniesioną do kwadratu.

#### Zadanie 2 - rozwiązywane z wykładowcą.

W pliku `Main2.java`

1. Napisz metodę `static int multiply(int multipler, int index)`,
która zwróci wartość zmiennej `multipler` pomnożoną przez wartość argumentu `index`.


-----------------------------------------------------------------------------

#### Zadanie 3

W pliku `Main3.java`
Napisz metodę `convertToUsd`, która przyjmuje parametr `zlotys`, czyli kwotę w złotówkach.
 Funkcja ma zwrócić podaną kwotę w dolarach amerykańskich. Jako przelicznik przyjmij wartość 4.04 PLN = 1 USD.

#### Zadanie 4

W pliku `Main4.java`
Napisz metodę `createName`, która przyjmie następujące parametry:

* `name`: imię,
* `surname`: nazwisko,
* `nickname`: pseudonim.

Funkcja ma zwrócić łańcuch tekstowy z połączonymi parametrami w postaci Imię "Pseudonim" Nazwisko.

#### Zadanie 5

W pliku `Main5.java`
Napisz metodę `calculateNet`, która przyjmie argumenty:

* `gross`, czyli kwotę brutto ceny zakupu,
* `vat`, czyli wartość podatku VAT. Możesz założyć, że VAT ma być liczbą zmiennoprzecinkową z zakresu 0 &ndash; 1.

Funkcja ma zwrócić wartość netto ceny. Jakie obliczenia musisz wykonać?

#### Zadanie 6

W pliku `Main6.java`
Napisz metodę `checkMaturity`, która:

* przyjmie parametr liczbowy `age`, który oznacza wiek użytkownika,
* sprawdzi czy użytkownik jest pełnoletni,
* jeśli jest &ndash; zwróci wartość `true`,
* jeśli nie &ndash; zwróci wartość `false`.

#### Zadanie 7

W pliku `Main7.java`
Napisz metodę `checkEven`, która:

* przyjmie parametr liczbowy `number`,
* będzie zwracać wartość typu `String`,
* jeśli liczba jest parzysta, zwróci wynik "even",
* jeśli liczba jest nieparzysta, zwróci wynik "odd".

#### Zadanie 8

W pliku `Main8.java`
Napisz metodę `maxOfThree`, która przyjmie trzy parametry liczbowe. Funkcja ma zwrócić największą liczbę.

### Zadanie 9

W pliku `Main9.java`
Napisz metodę `factorial`, która przyjmie jako parametr liczbę naturalną `n`. Funkcja ma zwrócić wartość *n!*, 
czyli wynik mnożenia wszystkich liczb naturalnych w zakresie 1..n .

#### Zadanie 10 (*).

Gdy klub piłkarski A gra dwumecz z klubem piłkarskim B, oznacza to, że grają jeden mecz na boisku drużyny A i jeden na boisku drużyny B.

Wygrywa ta drużyna, która zdobędzie więcej goli w obu meczach.

W przypadku, gdy drużyny zdobyły tyle samo bramek, gole zdobyte na wyjeździe liczą się jako "trochę ważniejsze" 
i wygrywa ta drużyna, która zdobyła więcej bramek na wyjeździe.

Remis w dwumeczu wypada wtedy, gdy obie drużyny mają tyle samo bramek na wyjeździe.

----
**Na przykład:**

W Pucharze Polski grają dwa zespoły: **Grom** i **Błyskawica**. Zespoły rozegrały następujące mecze:

**Gospodarz: Grom.**

Grom 0:2 Błyskawica

**Gospodarz: Błyskawica.**

Błyskawica 1:3 Grom

Sumaryczny wynik dwumeczu wynosi 3:3. Jednak Grom na wyjeździe zdobył 3 bramki, a Błyskawica tylko 2. Zatem wygrywa Grom.

----

Napisz metodę, `footballWin`, która przyjmie następujące parametry:

* Gole zdobyte przez zespół A w pierwszym meczu (na boisku zepołu A),
* Gole zdobyte przez zespół B w pierwszym meczu (na boisku zepołu A),
* Gole zdobyte przez zespół A w drugim meczu (na boisku zespołu B),
* Gole zdobyte przez zespół B w drugim meczu (na boisku zespołu B),

po czym zwróci `1`, jeśli dwumecz wygrał zespół A, `2` &ndash; jeśli B. W przypadku remisu, zwróć `X`. 
Wynik ma być łańcuchem tekstowym, nie liczbą!
