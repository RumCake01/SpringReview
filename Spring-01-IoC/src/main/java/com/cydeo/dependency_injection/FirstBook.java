package com.cydeo.dependency_injection;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FirstBook {

    private final AdditionalNote additionalNote; // interface
    private final AdditionalNote additionalNote2; // variable we created so that we can use multiple @Qualifier and passed different values.

    private final SecondBook secondBook; // class // 200

    public FirstBook(@Qualifier("home") AdditionalNote additionalNote, @Qualifier("class") AdditionalNote additionalNote2,
                     SecondBook secondBook) {

        this.additionalNote = additionalNote;
        this.secondBook = secondBook;
        this.additionalNote2 = additionalNote2;
    }

    public int cost1(){
        return 100 + additionalNote.additionalCost() + additionalNote2.additionalCost();
    }
}
