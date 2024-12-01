package spring_boot_lesson_example.embedded;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * untuk mempersingkat boilerplate atau penulisan code yang terlalu banyak kita dapat menggunakan fitur @Embeddable
 * jika kita menggunakan ini kita dapat membuat class entity yang dapat di embedd atau disematkan ke class lain
 * untuk melakukanya field yang ingin kita sematkan class @Embeddable harus memiliki annotation @Embededd
 * maka secara otomatis class yang memiliki @Embedded akan memiliki semua field yang ada di class @Embeddable nya
 */

@Embeddable
public class Address {

    private String jalan;

    private String kota;

    private String kodePos;

}
