public static void main(String[] args) {
        //Definir credenciales.
        String numero_cuenta_debito = "5300";
        String clave_cuenta_debito = "123";
        String numero_cuenta_credito = "1013";
        String clave_cuenta_credito = "123";
        //Definir montos
        double monto_debito = 1700000;
        double monto_credito = 2000000;
        int opciones_menu = 0;
        //Definir el menú
        System.out.println("""
                           ****************************************
                                        ¡Bienvenido!
                            1.       Cuenta Débito.
                            2.       Cuenta Crédito.
                           ****************************************
                            """);
        int opcion_tipocuenta = new Scanner(System.in).nextInt();

        if (opcion_tipocuenta == 1) {
            System.out.println("Ingrese el numero de cuenta");
            String numero_cuenta_aux = new Scanner(System.in).nextLine();
            while (!numero_cuenta_aux.equalsIgnoreCase(numero_cuenta_debito)) {
                System.out.println("Error, numero de cuenta no encontrado. Intente nuevamente!");
                numero_cuenta_aux = new Scanner(System.in).nextLine();
            }
            System.out.println("Ingrese la contraseña");
            String clave_cuenta_aux = new Scanner(System.in).nextLine();
            while (!clave_cuenta_aux.equalsIgnoreCase(clave_cuenta_debito)) {
                System.out.println("Error, contraseña erronea. Intente nuevamente!");
                clave_cuenta_aux = new Scanner(System.in).nextLine();
            }
            do {
                System.out.println("""
                                   ****************************************
                                            1.  Retirar
                                            2.  Depositar
                                            3.  Transferir
                                            4.  Consultar Saldo
                                            5.  Cambiar clave
                                            6.  Salir.
                                   ****************************************
                                """);
                opciones_menu = new Scanner(System.in).nextInt();
                while (opciones_menu < 1 || opciones_menu > 6) {
                    System.out.println("Error, opciones no validas, intente nuevamente.");
                    opciones_menu = new Scanner(System.in).nextInt();
                }
                switch (opciones_menu) {
                    case 1:
                        System.out.println("************ MODULO RETIRAR ************");
                        System.out.println("Ingrese el valor a retirar, su saldo actual es de: " + monto_debito);
                        double monto_sacar = new Scanner(System.in).nextDouble();
                        while (monto_sacar % 10000 != 0 || monto_sacar > monto_debito || monto_sacar <= 0) {
                            if (monto_sacar % 10000 != 0) {
                                System.out.println("Error, ingrese por favor un valor multiplo de 10.000 COP.");
                            } else {
                                if (monto_sacar > monto_debito) {
                                    System.out.println("Error, el monto a sacar supera el monto en tu cuenta.");
                                } else {
                                    System.out.println("Error, debe poner un monto superior a cero.");
                                }
                            }
                            monto_sacar = new Scanner(System.in).nextDouble();
                        }
                        monto_debito = monto_debito - monto_sacar;
                        System.out.println("Retiro exitoso!");
                        break;
                    case 2:
                        System.out.println("************ MODULO DEPOSITAR ************");
                        System.out.println("Ingrese el valor a consignar");
                        double valor_consignar = new Scanner(System.in).nextDouble();
                        while (valor_consignar <= 0) {
                            System.out.println("Error, ingrese valores positivos");
                            valor_consignar = new Scanner(System.in).nextDouble();
                        }
                        monto_debito = valor_consignar + monto_debito;
                        System.out.println("Deposito exitoso!");
                        break;
                    case 3:
                        System.out.println("************ MODULO TRANSFERENCIA ************");
                        System.out.println("Ingrese el valor a transferir");
                        double valor_transferencia = new Scanner(System.in).nextDouble();
                        while (valor_transferencia <= 0 || valor_transferencia > monto_debito) {
                            if (valor_transferencia <= 0) {
                                System.out.println("Error, ingrese valores positvos.");
                            } else {
                                System.out.println("Error, el monto a transferir, supera tu dinero en la cuenta.");
                            }
                            valor_transferencia = new Scanner(System.in).nextDouble();
                        }
                        monto_debito = monto_debito - valor_transferencia;
                        System.out.println("Deposito exitoso!");
                        break;
                    case 4:
                        System.out.println("************ MODULO CONSULTA ************");
                        System.out.println("SALDO ACTUAL: " + monto_debito);
                        break;
                    case 5:
                        System.out.println("************ MODULO CAMBIO CLAVE ************");
                        System.out.println("Ingrese la clave nueva");
                        String clave_aux = new Scanner(System.in).nextLine();
                        if (clave_aux.equalsIgnoreCase(clave_cuenta_debito)) {
                            System.out.println("La contraseña nueva es igual a la anterior.");
                        } else {
                            clave_cuenta_debito = clave_aux;
                        }
                        break;
                }
            } while (opciones_menu != 6);
        } else {
            System.out.println("Ingrese el numero de cuenta");
            String numero_cuenta_aux = new Scanner(System.in).nextLine();
            while (!numero_cuenta_aux.equalsIgnoreCase(numero_cuenta_credito)) {
                System.out.println("Error, numero de cuenta no encontrado. Intente nuevamente!");
                numero_cuenta_aux = new Scanner(System.in).nextLine();
            }
            System.out.println("Ingrese la contraseña");
            String clave_cuenta_aux = new Scanner(System.in).nextLine();
            while (!clave_cuenta_aux.equalsIgnoreCase(clave_cuenta_credito)) {
                System.out.println("Error, contraseña erronea. Intente nuevamente!");
                clave_cuenta_aux = new Scanner(System.in).nextLine();
            }
            do {
                System.out.println("""
                                   ****************************************
                                            1.  Retirar
                                            2.  Avances
                                            3.  Consultar Saldo
                                            4.  Cambiar clave
                                            5.  Salir.
                                   ****************************************
                                    """);
                opciones_menu = new Scanner(System.in).nextInt();
                while (opciones_menu < 1 || opciones_menu > 6) {
                    System.out.println("Error, opciones no validas, intente nuevamente.");
                    opciones_menu = new Scanner(System.in).nextInt();
                }
                switch (opciones_menu) {
                    case 1:
                        System.out.println("************ MODULO RETIRAR ************");
                        System.out.println("Ingrese el valor a retirar, su saldo actual es de: " + monto_credito);
                        double monto_sacar = new Scanner(System.in).nextDouble();
                        while (monto_sacar % 10000 != 0 || monto_sacar > monto_credito || monto_sacar <= 0) {
                            if (monto_sacar % 10000 != 0) {
                                System.out.println("Error, ingrese por favor un valor multiplo de 10.000 COP.");
                            } else {
                                if (monto_sacar > monto_credito) {
                                    System.out.println("Error, el monto a sacar supera el monto en tu cuenta.");
                                } else {
                                    System.out.println("Error, debe poner un monto superior a cero.");
                                }
                            }
                            monto_sacar = new Scanner(System.in).nextDouble();
                        }
                        monto_credito = monto_credito - monto_sacar;
                        System.out.println("Retiro exitoso!");
                        break;
                    case 2:
                        System.out.println("************ MODULO AVANCES ************");
                        System.out.println("Ingrese el valor a consignar");
                        double valor_consignar = new Scanner(System.in).nextDouble();
                        while (valor_consignar <= 0 || (monto_credito + valor_consignar) > 2000000) {
                            if (valor_consignar <= 0) {
                                System.out.println("Error, ingrese valores positivos");
                            } else {
                                System.out.println("Error, el valor a ingresar, supera el cupo de tu tarjeta, quedarías en: " + (monto_credito + valor_consignar));
                            }
                            valor_consignar = new Scanner(System.in).nextDouble();
                        }
                        monto_credito = valor_consignar + monto_credito;
                        System.out.println("Deposito exitoso!");
                        break;
                    case 3:
                        System.out.println("************ MODULO CONSULTA ************");
                        System.out.println("SALDO ACTUAL: " + monto_credito);
                        break;
                    case 4:
                        System.out.println("************ MODULO CAMBIO CLAVE ************");
                        System.out.println("Ingrese la clave nueva");
                        String clave_aux = new Scanner(System.in).nextLine();
                        if (clave_aux.equalsIgnoreCase(clave_cuenta_credito)) {
                            System.out.println("La contraseña nueva es igual a la anterior.");
                        } else {
                            clave_cuenta_credito = clave_aux;
                        }
                        break;
                }
            } while (opciones_menu != 5);
        }
    }