package tutsviews.lms;

import com.ninja_squad.dbsetup.operation.Operation;

import static com.ninja_squad.dbsetup.Operations.*;


public class CommonOperations {
	
	
    public static final Operation DELETE_ALL =  deleteAllFrom("text");

    
    public static final Operation INSERT_REFERENCE_DATA =
            sequenceOf(
                insertInto("text")
                    .columns("id","created_at","updated_at", "html_text", "simple_text")
                    .values(1,null,null, "FRA", "France")
                    .values(2,null,null, "USA", "United States")
                    .build()
//                    ,
//                insertInto("USER")
//                    .columns("ID", "LOGIN", "NAME")
//                    .values(1L, "jbnizet", "Jean-Baptiste Nizet")
//                    .values(2L, "clacote", "Cyril Lacote")
//                    .build()
                    );
    
}