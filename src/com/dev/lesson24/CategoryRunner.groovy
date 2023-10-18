package com.dev.lesson24

class CategoryRunner {

    static void main(String[] args) {
        def student = new Student(age: 19, firstName: "Ivan")
        use(DefaultStudentMethods.class) {
            student.testStr()
            student.anotherMethod("Test ars")
        }
    }
}
