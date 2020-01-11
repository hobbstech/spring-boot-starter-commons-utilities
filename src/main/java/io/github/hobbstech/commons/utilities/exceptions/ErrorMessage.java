package io.github.hobbstech.commons.utilities.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ErrorMessage {

    private Date date;
    private String message;
    private String description;

}
