

package org.example.input;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class ScannerInputService {
    private Scanner scanner;
    @Autowired
    public ScannerInputService(Scanner scanner) {
        this.scanner = scanner;
    }
}
