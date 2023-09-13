package org.example.lesson6;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class RepeatPrinter {
    public void printNTimes(int n, String string) {
        for (int i = 0; i < n; i++) {
            System.out.println(string);
        }
    }
}
