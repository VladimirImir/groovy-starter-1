package com.dev.lesson27

import static com.dev.lesson27.DslBuilder.*

/**def email = new Email()
 email.setFrom("from@gmail.com")
 email.setTo("to@gmail.com")
 email.setTitle("title@gmail.com")

 def body = new EmailBody()
 body.setText("asasa")
 body.setImage(List.of("image.jpg"))
 email.setBody(body)*/

// builder
mail {
    from "from@mail.ru"
    to "to@mail.ru"
    title "title"
    body {
        text "text of the letter"
        images(['image.jpg', 'image2.png'])
        image 'test.jpeg'
    }
}
