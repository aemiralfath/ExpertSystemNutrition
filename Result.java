public class Result{
    private String str;
    private String a[] = {"M1","M4","M19"};
    private String b[] = {"M2","M5"};
    private String c[] = {"M3","M6","M29"};
    private String d[] = {
        "M7", "M11", "M27", "M30", "M33", "M37", "M45", "M53", "M56", "M59", "M63", "M71", "M79", "M82", "M85",
        "M89", "M97", "M104", "M107", "M110", "M114", "M122", "M130", "M133", "M136", "M140", "M148", "M156", "M159",
        "M162", "M166", "M174", "M182", "M185", "M189", "M193", "M201"};
    private String e[] = {"M8","M13"};
    private String f[] = {"M9","M15"};
    private String g[] = {"M10","M16"};
    private String h[] = {
        "M12","M38","M46","M64","M72","M90","M98","M115","M123","M141","M149","M167","M175","M194","M202"
    };
    private String i[] = {
        "M14","M22","M40","M48","M66","M74","M92","M100","M17","M125","M143","M151","M169","M177","M196","M204"
    };
    private String j[] = {
        "M23", "M28", "M31", "M35", "M41", "M49", "M54", "M57", "M61", "M67", "M75", "M80", "M83",
        "M87", "M93", "M101", "M105", "M108", "M112", "M118", "M126", "M131", "M134", "M138", "M144",
        "M152", "M157", "M160", "M164", "M170", "M178", "M183", "M186", "M191", "M197", "M204"
    };
    private String k[] = {
        "M24", "M32", "M36", "M42", "M50", "M55", "M58", "M62", "M68", "M76", "M81", "M84", "M88", "M94", "M102",
        "M106", "M109", "M113", "M119", "M127", "M132", "M135", "M139", "M145", "M153", "M158", "M161", "M165",
        "M171", "M179", "M184", "M187", "M192", "M198","M206"};
    private String l[] = {
        "M21", "M34", "M39", "M47", "M60", "M65", "M73", "M86", "M91", "M99", "M111", "M116", "M124", "M137", "M142",
        "M150", "M163", "M168", "M176", "M190", "M195", "M203"};
    private String m[] = {
        "M17", "M25", "M43", "M51", "M69", "M77", "M95", "M103", "M120", "M128", "M146", "M154", "M172", "M180",
        "M199", "M207"
    };
    private String n[] = {
        "M18", "M26", "M44", "M52", "M70", "M96", "M103", "M121", "M129", "M147", "M155", "M173", "M181", "M200",
         "M208"
        };

        public Result(){

        }

        public Result(String str){
            this.str = str;
        }

        public void run(){
            for(String value: a){
                if(value.equalsIgnoreCase(str)){
                    categoryA();
                    break;
                }
            }

            for(String value: b){
                if(value.equalsIgnoreCase(str)){
                    categoryB();
                    break;
                }
            }

            for(String value: c){
                if(value.equalsIgnoreCase(str)){
                    categoryC();
                    break;
                }
            }

            for(String value: d){
                if(value.equalsIgnoreCase(str)){
                    categoryD();
                    break;
                }
            }

            for(String value: e){
                if(value.equalsIgnoreCase(str)){
                    categoryE();
                    break;
                }
            }

            for(String value: f){
                if(value.equalsIgnoreCase(str)){
                    categoryF();
                    break;
                }
            }

            for(String value: g){
                if(value.equalsIgnoreCase(str)){
                    categoryG();
                    break;
                }
            }

            for(String value: h){
                if(value.equalsIgnoreCase(str)){
                    categoryH();
                    break;
                }
            }

            for(String value: i){
                if(value.equalsIgnoreCase(str)){
                    categoryI();
                    break;
                }
            }

            for(String value: j){
                if(value.equalsIgnoreCase(str)){
                    categoryJ();
                    break;
                }
            }

            for(String value: k){
                if(value.equalsIgnoreCase(str)){
                    categoryK();
                    break;
                }
            }

            for(String value: l){
                if(value.equalsIgnoreCase(str)){
                    categoryL();
                    break;
                }
            }

            for(String value: m){
                if(value.equalsIgnoreCase(str)){
                    categoryM();
                    break;
                }
            }

            for(String value: n){
                if(value.equalsIgnoreCase(str)){
                    categoryN();
                    break;
                }
            }
        }

        public void categoryA(){
            System.out.println(
                "Kategori A\n"+
                "1. Nasi Tim\n"+
                "2. Nasi\n"+
                "3. Roti\n"+
                "4. Telur Goreng\n"+
                "5. Daging Bumbu\n"+
                "6. Ayam Goreng\n"+
                "7. Ikan Goreng\n"+
                "8. Sup Wortel\n"+
                "9. Telur Rebus\n"+
                "10. Tahu Tim\n"+
                "11. Pisang\n"+
                "12. Jeruk\n"+
                "13. Pepaya"
            );
        }

        public void categoryB(){
            System.out.println(
                "Kategori B\n"+
                "1. Nasi Tim\n"+
                "2. Semur Daging\n"+
                "3. Perkedel\n"+
                "4. Tahu\n"+
                "5. Sup Wortel\n"+
                "6. Sup Sayuran\n"+
                "7. Puding\n"+
                "8. Pisang\n"+
                "9. Pepaya"
            );
        }

        public void categoryC(){
            System.out.println(
                "Kategori C\n"+
                "1. Nasi Tim\n"+
                "2. Daging Bumbu\n"+
                "3. Telur Rebus\n"+
                "4. Sayur Bening\n"+
                "5. Tahu tim\n"+
                "6. Tempe bacem\n"+
                "7. Sup wortel\n"+
                "8. Pisang\n"+
                "9. pepaya"
            );
        }
  
        public void categoryD(){
            System.out.println(
                "Kategori D\n"+
                "1. Nasi\n"+
                "2. Roti\n"+
                "3. Jagung\n"+
                "4. Udang\n"+
                "5. Telur Goreng\n"+
                "6. Daging Bumbu\n"+
                "7. Ayam Goreng\n"+
                "8. Kerang Rebus\n"+
                "9. Ikan Bakar\n"+
                "10. Telur Rebus\n"+
                "11. Semangka\n"+
                "12. Jeruk\n"+
                "13. Nanas"
            );
        }
  
        public void categoryE(){
            System.out.println(
                "Kategori E\n"+
                "1. Nasi Tim\n"+
                "2. Semur Daging\n"+
                "3. Telur Rebus\n"+
                "4. Sayur Bening\n"+
                "5. Ikan Panggang\n"+
                "6. Ikan Pepes\n"+
                "7. Tumis Kangkung\n"+
                "8. Pisang\n"+
                "9. Pepaya"
            );
        }
  
        public void categoryF(){
            System.out.println(
                "Kategori F\n"+
                "1. Nasi\n"+
                "2. Nasi Tim\n"+
                "3. Roti\n"+
                "4. Telur Dadar\n"+
                "5. Semur Daging\n"+
                "6. Tahu\n"+
                "7. Tempe Bacem\n"+
                "8. Cah Wortel\n"+
                "9. Sup Sayuran\n"+
                "10. Perkedel\n"+
                "11. Pisang\n"+
                "12. Pepaya"
            );
        }
  
        public void categoryG(){
            System.out.println(
                "Kategori G\n"+
                "1. Nasi Tim\n"+
                "2. Daging Bumbu\n"+
                "3. Ikan Pepes\n"+
                "4. Sayur Bening\n"+
                "5. Tahu Tim\n"+
                "6. Tempe Bacem\n"+
                "7. Tumis Kangkung \n"+
                "8. Pisang\n"+
                "9. pepaya"
            );
        }
  
        public void categoryH(){
            System.out.println(
                "Kategori H\n"+
                "1. Nasi\n"+
                "2. Roti\n"+
                "3. Margarine\n"+
                "4. Daging Bumbu\n"+
                "5. Telur Rebus\n"+
                "6. Ikan Goreng\n"+
                "7. Sup Bayam\n"+
                "8. Cah Sawi\n"+
                "9. Lalap Tomat\n"+
                "10. Sla Ketimun\n"+
                "11. Nanas\n"+
                "12. Pisang\n"+
                "13. Pepaya"
            );
        }
  
        public void categoryI(){
            System.out.println(
                "Kategori I\n"+
                "1. Nasi\n"+
                "2. Nasi Goreng\n"+
                "3. Bola-bola Ubi\n"+
                "4. Telur Dadar\n"+
                "5. Ayam Goreng\n"+
                "6. Ikan Acar Kuning\n"+
                "7. Cah Sayuran\n"+
                "8. Sayur Asem\n"+
                "9. Lalap Timun\n"+
                "10. Agar-agar\n"+
                "11. Apel\n"+
                "12. Pepaya\n"+
                "13. Madu"
            );
        }
  
        public void categoryJ(){
            System.out.println(
                "Kategori J\n"+
                "1. Nasi Tim\n"+
                "2. Roti Bakar\n"+
                "3. Telur Dadar\n"+
                "4. Semur Daging\n"+
                "5. Asam Buncis\n"+
                "6. Tempe Bacem\n"+
                "7. Cah Wortel\n"+
                "8. Sup Sayuran\n"+
                "9. Perkedel\n"+
                "10. Puding\n"+
                "11. Pisang\n"+
                "12. Pepaya\n"+
                "13. Teh Manis"
            );
        }
  
        public void categoryK(){
            System.out.println(
                "Kategori K\n"+
                "1. Nasi Tim\n"+
                "2. Daging Bumbu\n"+
                "3. Ikan Pepes\n"+
                "4. Sayur Bening\n"+
                "5. Tahu Tim\n"+
                "6. Tempe Bacem\n"+
                "7. Tumis Kangkung\n"+
                "8. Pisang\n"+
                "9. Pepaya\n"+
                "10. Telur Rebus\n"+
                "11. Setup Wortel\n"+
                "12. Teh Manis"
            );
        }
 

        public void categoryL(){
            System.out.println(
                "Kategori L\n"+
                "1. Nasi tim\n"+
                "2. Telur ½ matang\n"+
                "3. Setus buncis\n"+
                "4. Biskuit\n"+
                "5. Susu\n"+
                "6. Semur daging\n"+
                "7. Ikan panggang\n"+
                "8. Sayur bening\n"+
                "9. Tumis tempe\n"+
                "10. Sup wortel\n"+
                "11. Pisang\n"+
                "12. Pepaya"
            );
        }

        public void categoryM(){
            System.out.println(
                "Kategori M\n"+
                "1. Nasi\n"+
                "2. Tempe bacem\n"+
                "3. Ikan bakar\n"+
                "4. Cah sawi wortel\n"+
                "5. Tahu\n"+
                "6. Tumis kangkung\n"+
                "7. Lalap tomat\n"+
                "8. Cah oyong tahu\n"+
                "9. pisang\n"+
                "10. pepaya"
            );
        }

        public void categoryN(){
            System.out.println(
                "Kategori N\n"+
                "1. Nasi\n"+
                "2. Jagung rebus\n"+
                "3. Ayam bumbu\n"+
                "4. Ikan bakar\n"+
                "5. Telur rebus\n"+
                "6. Sayur bayam\n"+
                "7. Pepes ikan\n"+
                "8. Sayur asem\n"+
                "9. Tumis buncis\n"+
                "10. Pisang rebus\n"+
                "11. Semangka"
            );
        }
}