/* 
 * Copyright 2019 Manu Portolés Zagalá.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Manu Portolés Zagalá
 */
public class Main {

    /**
     * param args the command line arguments
     */
    public static final Scanner SCN
            = new Scanner(System.in, "ISO-8859-1")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    public static void main(String[] args) {

        int anyAct;

        System.out.println("Alternativa Bisiesta");
        System.out.println("====================");

        try {

            System.out.print("Análisis año ...: ");
            anyAct = SCN.nextInt();

            String dec;

            if (anyAct % 400 == 0) {
                dec = "SI";
            } else if (anyAct % 100 == 0) {
                dec = "NO";
            } else if (anyAct % 4 == 0) {
                dec = "SI";
            } else {
                dec = "NO";
            }

            System.out.println("---");
            System.out.printf("%s %d %s %s %s%n", "El año", anyAct, "....:",
                    dec, "es bisiesto");

        } catch (Exception e) {
            System.out.println("ERROR: Entrada incorrecta");
        }
    }

}
