package com.company;

import java.util.ArrayList;
import java.util.List;

// Variant 3
public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        int num_of_students = 20;
        int num_of_comps = (int) (num_of_students * 0.25);

        // Генерация случайной очереди студентов
        for (int i = 0; i < num_of_students; i++) {
            if (i % 2 == 0) {
                students.add(new ITISStudent());
            } else {
                students.add(new IVMIITStudent());
            }
        }

        // Студенты сдают задания
        for (Student student : students) {
            student.makeProgramming();
            student.makeElecEngineering();
        }

        // Определение, сколько студентов ИТИС и ИВМиИТ получат макбук
        int itis_count = 0;
        int ivmiit_count = 0;
        for (int i = 0; i < num_of_comps; i++) {
            if (students.get(i) instanceof ITISStudent) {
                itis_count++;
            } else if (students.get(i) instanceof IVMIITStudent) {
                ivmiit_count++;
            }
        }

        System.out.println("Количество студентов ИТИС, получивших макбук: " + itis_count);
        System.out.println("Количество студентов ИВМиИТ, получивших макбук: " + ivmiit_count);
    }
}

/*
1. Абстрактный класс - это тот который содержит абстрактные методы кот. должны быть реализованы в его подклассах.
   но иожет содержать и обычные методы с реализацией. испльзуются для предоставления общего функционала.
2. интерфйс опр только абстрактные методы без реализации, а абстр класс может еще сод методы с реализацией
   Интерфейс исп только для реализации набора методов, а абстр класс - когда нужна общая функциональность
3. Композиция это создание объектов одного класса в другом классе и использование их функционала. композиция может
   использоваться когда один объект яв частью другого или имеет связь с другим объектом.

3. В Java композиция реализуется путем создания объектов одного класса внутри другого класса и использования их функциональных возможностей. Это означает, что один объект состоит из других объектов. Композиция может использоваться, когда один объект является частью другого объекта или имеет связь с другим объектом.

4. Статический полиморфизм позволяет объявить несколько методов с одним и тем же именем, но с разными параметрами или возвращаемым типом.
   Динамический полиморфизм когда у нас есть наследование классов и методы с одним и тем же именем и параметрами. Когда метод вызывается через объект, компилятор определяет, какую реализацию метода использовать на основе типа объекта, а не типа ссылки на объект. Таким образом, реальная реализация метода будет выбрана только во время выполнения программы.

5. Ключевое слово super используется для обращения к родительскому классу внутри подкласса. Оно может быть использовано для вызова конструктора родительского класса, доступа к методам и переменным родительского класса. Например, super() используется для вызова конструктора родительского класса, а super.метод() - для вызова метода родительского класса.



       */