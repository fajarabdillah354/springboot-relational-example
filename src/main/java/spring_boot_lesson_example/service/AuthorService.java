package spring_boot_lesson_example.service;


import org.springframework.stereotype.Service;
import spring_boot_lesson_example.entity.Author;
import spring_boot_lesson_example.repository.AuthorRepository;

import java.util.List;

@Service
public class AuthorService {

    private final AuthorRepository authorRepository;

    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    private List<Author> authorList(){
        return authorRepository.findAll();
    }

}
