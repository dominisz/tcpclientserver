# Design patterns - TCP client and server

Zadanie na podstawie http://www-home.fh-konstanz.de/~haase/lehre/patterns/exercises/exercise3.pdf

## Zadanie

* zapoznać się z kodem aplikacji, sprawdzić jakie są klasy, interfejsy oraz jakie są zależności pomiędzy nimi,
* uruchomić aplikacje `TcpServer` oraz `TcpClient`,
* wykonać refaktoring stosując odpowiednie wzorce projektowe,
* jeżeli klasa A korzysta z klasy B, to zamienić to na wykorzystanie odpowiedniego interfejsu,
    * wykorzystać wzorzec fabryki,
    * wykorzystać wzorzec fabryki abstrakcyjnej tworzonej bezpośrednio,
    * wykorzystać wzorzeć fabryki abstrakcyjnej przekazywanej poprzez wstrzykiwanie zależności,
* zamień klasę `TcpServer` na singleton,
* zamień klasę `TcpClient` na singleton.