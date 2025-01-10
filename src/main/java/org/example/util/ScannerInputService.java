

package org.example.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class ScannerInputService implements UserInputService{
    private final Scanner scanner;
    @Autowired
    public ScannerInputService(Scanner scanner) {
        this.scanner = scanner;
    }
        public String getString (){
        return scanner.nextLine();
        }

        public int getInt(){
        return Integer.parseInt(scanner.nextLine());
        }
}