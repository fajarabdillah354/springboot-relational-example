package spring_boot_lesson_example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;
import spring_boot_lesson_example.entity.Author;

import java.util.List;

public interface AuthorRepository extends JpaRepository<Author, String> {
    /**
     * kita bisa membuat query SQL langsung dengan menambahkan annotation @Query pada field yang ingin kita beri
     * pada saat pemanggilan kita cukup mengisikan parameternya saja
     * @Transactional berfunggi untuk menjaga konsistensi database
     * @param age
     * @param id
     * @return
     */


    @Modifying
    @Transactional
    @Query("UPDATE Author a set a.age = :age WHERE a.id = :id")
    int updateAuthor(int age, String id);
}
