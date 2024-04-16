package travel.journal.api.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@Table(name = "\"files\"")
public class Files {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "file_id")
    private int fileId;

    @Column(name = "file_name")
    private String fileName;

    @Column(name = "title")
    private String title;

    @Column(name = "file_content")
    private byte[] fileContent;

    @Column(name = "created_date")
    private LocalDate createdDate;
}
