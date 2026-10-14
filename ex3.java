System.out.print("Basic Pay: ");
            double basicPay = sc.nextDouble();

            switch (ch) {

                case 1:
                    if (basicPay >= 15000 && basicPay <= 20000) {
                        Programmer p = new Programmer();
                        p.setDetails(id, name, address, mail, mobile, basicPay);
                        p.salary();
                    } else {
                        System.out.println("Invalid Basic Pay!");
                        System.out.println("Programmer Basic Pay should be between 15000 and 20000.");
                    }
                    break;

                case 2:
                    if (basicPay >= 20001 && basicPay <= 30000) {
                        AssistantProfessor ap = new AssistantProfessor();
                        ap.setDetails(id, name, address, mail, mobile, basicPay);
                        ap.salary();
                    } else {
                        System.out.println("Invalid Basic Pay!");
                        System.out.println("Assistant Professor Basic Pay should be between 20001 and 30000.");
                    }
                    break;

                case 3:
                    if (basicPay >= 30001 && basicPay <= 40000) {
                        AssociateProfessor asp = new AssociateProfessor();
                        asp.setDetails(id, name, address, mail, mobile, basicPay);
                        asp.salary();
                    } else {
                        System.out.println("Invalid Basic Pay!");
                        System.out.println("Associate Professor Basic Pay should be between 30001 and 40000.");
                    }
                    break;

                case 4:
                    if (basicPay > 40000) {
                        Professor prof = new Professor();
                        prof.setDetails(id, name, address, mail, mobile, basicPay);
                        prof.salary();
                    } else {
                        System.out.println("Invalid Basic Pay!");
                        System.out.println("Professor Basic Pay should be greater than 40000.");
                    }
                    break;

                default:
                    System.out.println("Invalid Choice! Please enter a number between 1 and 5.");
            }
        }

        sc.close();
    }
}
