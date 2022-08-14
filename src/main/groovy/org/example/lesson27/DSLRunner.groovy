package org.example.lesson27
import static org.example.lesson27.DslBuilder.*

mail{
    from "from@mail.ru"
    to "to@mail.ru"
    title "title"
    body {
        text "text of the letter"
        images (['image1.jpg', 'image2.png'])
    }
}
