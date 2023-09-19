package org.example.lesson6;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
public class Year {
    public boolean isLeap(int i) {
        if (i % 4 == 0) {
            return i % 100 != 0 || i % 400 == 0;
        }
        return false;
    }
}
