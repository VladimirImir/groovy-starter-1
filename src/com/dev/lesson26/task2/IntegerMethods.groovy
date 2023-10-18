package com.dev.lesson26.task2

@Category(Integer)
class IntegerMethods {

    def getCm() {
        /**
         * this - автоматически обращается к классу Integer потому что это Категория.
         */
        this * 10
    }

    def getMm() {
        this
    }

    def getM() {
        getCm() * 100
    }
}
