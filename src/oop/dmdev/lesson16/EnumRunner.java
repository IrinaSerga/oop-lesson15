package oop.dmdev.lesson16;

import java.util.Arrays;

public class EnumRunner {

    public static void main(String[] args) {
        ProcessorType processorType = ProcessorType.BIT_32;
        System.out.println(processorType.name()); // переопределен toString
        System.out.println(processorType.toString()); // return name
        System.out.println(ProcessorType.valueOf("BIT_32")); // здесь обращение ко всему енуму
        System.out.println(Arrays.toString(ProcessorType.values())); // all names in enum
        System.out.println(processorType.ordinal()); // порядковый номер в массиве
        System.out.println(processorType.getName());
        System.out.println(processorType.getDescription());
    }
}
