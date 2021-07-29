public class CovidVaccinationCenter {
    String slot_date;
    String center_name;
    int age_group;

    public CovidVaccinationCenter(String slot_date, String center_name, int age_group) {
        this.slot_date = slot_date;
        this.center_name = center_name;
        this.age_group = age_group;
    }

    public static void main(String[] args) {
        CovidVaccinationCenter patient1 = new CovidVaccinationCenter("02-06-2021", "Bengaluru", 21);
        patient1.getVaccine();
        CovidVaccinationCenter patient2 = new CovidVaccinationCenter("22-05-2021", "Mangaluru", 50);
        patient2.getVaccine();
        CovidVaccinationCenter patient3 = new CovidVaccinationCenter("21-04-2020", "Udupi", 30);
        patient3.getVaccine();
    }

    public void getVaccine() {
        if (age_group >= 18 && age_group <= 44) {
            String[] day = slot_date.split("-");
            String date = day[0];
            String month = day[1];
            String year = day[2];
            int d = Integer.parseInt(date);
            int m = Integer.parseInt(month);
            int y = Integer.parseInt(year);
            if (d >= 01 && d <= 05 && m == 6 && y == 2021) {
                System.out.println("Vaccine Available for 18-44 Age Group");
            }else{
                System.out.println("Vaccine not available");
            }
        } else if (age_group >= 45 && age_group <= 75) {
            String[] day1 = slot_date.split("-");
            String date1 = day1[0];
            String month1 = day1[1];
            String year1 = day1[2];
            int d1 = Integer.parseInt(date1);
            int m1 = Integer.parseInt(month1);
            int y1 = Integer.parseInt(year1);
            if (d1 >= 21 && d1 <= 30 && m1 == 5 && y1 == 2021) {
                System.out.println("Vaccine Available for 45-75 Age Group");
            }
        } else {
            System.out.println("Vaccine not available");
        }
    }
}


