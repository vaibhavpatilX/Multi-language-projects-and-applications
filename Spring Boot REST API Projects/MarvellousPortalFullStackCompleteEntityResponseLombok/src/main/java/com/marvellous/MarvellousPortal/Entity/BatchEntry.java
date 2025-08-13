package com.marvellous.MarvellousPortal.Entity;

import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "BatchDetails")
@Data
//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
//@Builder      //for design patterns

public class BatchEntry
{
    private ObjectId id;
    private String name;
    private int fees;

}
