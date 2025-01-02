package spring_boot_lesson_example.embedded;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class EmbeddAddress {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String username;

    private String email;

    @Embedded
    private Address address;


    //kita juga dapat mencustom field yang kita inginkan dengan @AttributeOverride(namaField, column)
    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "jalan", column = @Column(name = "jalan_alamat_rumah")),
            @AttributeOverride(name = "kota", column = @Column(name = "alamat_kota")),
            @AttributeOverride(name = "kodePos", column = @Column(name = "nomor_kodepos"))
    })
    private Address homeAddress;



}
