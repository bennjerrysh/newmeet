package kr.co.jhta.dto;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ReviewDTO {

	private int r_no;
	private String rating;
	private Date regdate;
	private String image;
	private String contents;
	private int p_no;
}
