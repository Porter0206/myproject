package com.bob;

public class Hello {
    public static void main(String[] args) {
//        System.out.println("Hello world");
        String s = "abcde";
        System.out.println(s.charAt(3));
        System.out.println(s.length());
        System.out.println(s.substring(3));
        System.out.println(s.substring(1,4));
        Person p = new Person("Bob", 66.5f, 1.7f);
        p.hello();
        p.weight = 66.5f;
        p.height = 1.7f;
        System.out.println(p.bmi());
        int score = 88;
        System.out.println(score < 80 || score > 90);
        char c = 'A';
        System.out.println(c > 'a');
       /* int age = 19;
        Integer age2 = 19;
        char c = '我';
        Character c2 = 'A';
        byte b = 120;
        float weight = 66.5f;
        double height = 1.7f;
        boolean adult = true;
        boolean enroll = false;
        String name = "Bob";*/
    }
}
