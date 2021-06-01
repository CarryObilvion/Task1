# Назначение программы 

Данная программа предназначена для отображения структурных елементов карт Константайна, таких как: Модуль, Подсистема, библиотека. Отображение вызывается нажатием соответствующий кнопок.

# Область применения программы

* Дает возможность просмотреть вид выбранного элемента;

* Позволяет отображать элементы по порядку;

* Дает понимание работы абстраткного суперкласса.

# Описание проекта

Проект представляет собой оконное приложение. Изначальный вид проекта - BorderPane. Внизу реализован HBox с разположенными на ней 3 кнопками отрисовки, которые рисут изображение, особенное для каждой кнопки.

# Абстрастный Суперкласс - гарантирует ,что поведение связанных классов одинаково.

Общая логика связанных классов определяется в суперклассе. 
Варианты поведения, зависящие от конкретного наследника, размещаются в методах с одинаковой сигнатурой и эти методы абстрактные. 
Abstract Superclass. Класс, выступающий в этой роли, представляет собой абстрактный суперкласс, в котором инкапсулирована общая логика связанных классов. Связанные классы расширяют этот класс. Таким образом, они могут наследовать его методы. Методы с одинаковыми сигнатурами и общей логикой для всех связанных классов помещаются в суперкласс, поэтому логика этих методов может наследоваться всеми подклассами данного суперкласса. Методы с зависящей от конкретного подкласса данного суперкласса логикой, но с одинаковыми сигнатурами, объявляются в абстрактном классе как абстрактные методы, тем самым гарантируя, что каждый конкретный подкласс будет иметь методы с такими же сигнатурами.

# Реализация проекта

Проект построен согласно диаграмме классов.

![image](https://user-images.githubusercontent.com/80450495/120206344-c5a55700-c233-11eb-8aed-39c923455a29.png)

Скриншоты рабочего окна приложения:

![image](https://user-images.githubusercontent.com/80450495/120206417-d950bd80-c233-11eb-8bb9-2cb5e96244bc.png)
![image](https://user-images.githubusercontent.com/80450495/120206456-e2da2580-c233-11eb-871d-d2acdcb4c3ec.png)
![image](https://user-images.githubusercontent.com/80450495/120206509-f4bbc880-c233-11eb-8958-f37a7785e69c.png)

