package app.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "student_table")
public class Student {

	@Id
	@Column(name = "student_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer studentId;

	@Column(name = "student_name", length = 100, nullable = false)
	private String studentName;

	@Column(length = 46, name = "email", unique = true)
	private String email;

	@Column(name = "date_of_joing")
	private Date doj;

}