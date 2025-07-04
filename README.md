# Виктор Стојковски 236042

## Control Flow Graph

![CFG](https://github.com/user-attachments/assets/a6e30ead-7655-4b77-bbd3-2690d0894671)

## Цикломатската Комплексност

### Цикломатската комплексност се пресметува така што се зимаат рабовите (Edges) <sub>во овој случај 35</sub> од нив се одзимаат јазлите (Nodes) <sub>во овој случај 28</sub> и се додава 2

35 - 28 + 2 = 9

## Тест случаи според критериумот Every Statement

1. Првиот тест случај се случува ако листата *allItems* е **null** што значи дека на променливата *allItems* не и е додадено листа. Ова ке фрли *RuntimeException("allItems list can't be null!")*
2. Вториот тест случај се случува во *for loop* во *if* така што ако еден од елементите во листата нема име, односно е **null**, или името и е со должина од 0 карактери. Ова ке фрли *RuntimeException("Invalid item!")*
3. Третиот тест случај се случува во *for loop* во *if* така што се проверува дали во бројот на картичката сите карактери се валидни, односно дали се користат само броевите од 0-9. Ако не тогаш фрла *RuntimeException("Invalid character in card number!")*
4. Четвртиот тест случај се сличува во *else* од претходната *if* која вели да влезе во *else* aко бројот на картичката е **null** или ако бројот на карактери во бројот на картичката не е точно **16**. Ова ке фрли *RuntimeException("Invalid card number!")*
5. Петтиот тест случај се случува ако се помине точно и се врати сума односно *return sum*

(Со ова се докажува дека се потребно минимум 5 тест случаи)

## Тест случаи според критериумот Multiple Condition

![testing_page-0001](https://github.com/user-attachments/assets/610a66fd-601c-46b0-96c2-680ea263850c)

### За да стигнеме до овој критериум потребно ни се минимум 4 тест случаи. 
1. Еден случај каде што сите три се неточни и нема да се изврши **if** кондиција, односно ке даде **false**
2. Еден случај каде што првите две ке бидат неточни а третото точно па ке се изврши поради третото
3. Еден случај каде што првото е неточно, второто е точно, а третото не е важни поради тоа што второто е точни и ке се изврши
4. Еден случај каде што првото е точно, а другите не се важни поради тоа што од првата кондиција ке се изврши

## Објаснување на напишаните unit tests

### Напишани се 5 тестови за секој од по претходните прашања

1. Во првиот тест има 4 работи во листата кои се валидни и ке дадат резултат
   
   1.1 Првата работа има елементи од кои сите се **false** во делот кај што се проверува за *sum-=30* (FFF)
   
   1.2 Втората работа првите два елементи се неточни а последниот е точен (FFT) со што се добива -30 на сумата
   
   1.3 Третата работа првиот елемент е неточен додека другите два се точни (FTT)
   
   1.4 Четвртата работа сите точни (TTT)
   
3. Во вториот тест има листа што е **null** што ќе фрли *RuntimeException("allItems list can't be null!")*
4. Во третиот тест има листа што е валидна но името на еден или повеќе елементи во листата е невалидно (null или 0). Тоа фрла *RuntimeException("Invalid item!")*
5. Во четвртиот тест има валидна листа но во бројот на картичката има карактери што не се броеви од 0-9. Тоа ке фрли *RuntimeException("Invalid character in card number!")*
6. Во петтиот тест има валидна листа но бројот на картичката е **null** или должината не е еднаква со **16**. Тоа фрла *RuntimeException("Invalid card number!")*
