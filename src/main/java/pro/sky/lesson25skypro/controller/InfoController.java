package pro.sky.lesson25skypro.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class InfoController {

    @GetMapping
    String greeting() {
        return "Приложение запущено";
    }

    @GetMapping("/info")
    String info() {
        return "Автор: Андрей <br>" +
                "Название проекта: Книга рецептов <br>" +
                "Проект создан 23.01.23 <br>" +
                "Проект посвящен описанию рецептов <br>";
    }
}
