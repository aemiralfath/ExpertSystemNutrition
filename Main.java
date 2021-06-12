import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static Scanner data = new Scanner(System.in);
    private static BufferedReader reader;
    private static BufferedWriter output;
    private static BufferedWriter logs;
    private static List<Clause> sentenceList = new ArrayList<>();
    private static List<Clause> knowledeBase = new ArrayList<>();
    private static List<Clause> knowledeBaseRule = new ArrayList<>();

    public static void main(String args[]) {   
        
        try {
            logs = new BufferedWriter(new FileWriter("logs.txt"));
            output = new BufferedWriter(new FileWriter("output.txt"));
            

            boolean program = true;
            while(program){
                logs.newLine();
                logs.write("<Known/Deducted facts>#Rules Fires#NewlyEntailedFacts");
                logs.newLine();
                sentenceList.clear();
                knowledeBase.clear();

                System.out.println("==========================");
                System.out.println("  Sistem Pakar Ahli Gizi  ");
                System.out.println("==========================");
                System.out.println("Menu:");
                System.out.println("1. Konsultasi");
                System.out.println("2. Informasi");
                System.out.println("3. keluar");
                System.out.print("input menu: ");
                int menu = data.nextInt();
                System.out.println("");
                if(menu == 1){
                    User user = question();
                    String fc = forwardChaining("knowledgeBase.txt");

                    System.out.println();
                    System.out.println("Result");
                    System.out.println("Name   : "+user.getNama());
                    System.out.println("Age    : "+user.getUmur());
                    System.out.println("Gender : "+(user.getJK()=='l'?"Laki-laki":"Perempuan"));
                    System.out.println("Weight : "+user.getBB());
                    System.out.println("Height : "+user.getTinggi());
                    System.out.println("IMT    : "+user.getIMT());
                    System.out.println("Disease: "+user.getPenyakit());
                    System.out.println("");

                    System.out.println("Jenis Makanan yang direkomendasikan:");
                    Result result = new Result(fc);
                    result.run();
                    System.out.print("Input apa saja untuk keluar: ");
                    data.next();
                    System.out.println("Terima kasih "+user.getNama());
                    System.out.println("");
                }else if(menu == 2){
                    Result result = new Result();
                    result.categoryA();System.out.println("");
                    result.categoryB();System.out.println("");
                    result.categoryC();System.out.println("");
                    result.categoryD();System.out.println("");
                    result.categoryE();System.out.println("");
                    result.categoryF();System.out.println("");
                    result.categoryG();System.out.println("");
                    result.categoryH();System.out.println("");
                    result.categoryI();System.out.println("");
                    result.categoryJ();System.out.println("");
                    result.categoryK();System.out.println("");
                    result.categoryL();System.out.println("");
                    result.categoryM();System.out.println("");
                    result.categoryN();System.out.println("");
                    System.out.print("Input apa saja untuk keluar: ");
                    data.next();
                    System.out.println("Terima kasih\n");
                }else if(menu == 3){
                    program = false;
                    System.out.println("Terima kasih\n");
                }else{
                    System.out.println("Input salah\n");
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try{
            output.close();
            logs.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static User question(){
        User user = new User();
        System.out.println("");
        System.out.println("Halo!");
        System.out.print("Masukan nama kamu dulu ya: ");
        user.setNama(data.next());

        System.out.print(user.getNama()+" laki-laki atau perempuan? (l/p): ");
        user.setJK(data.next().charAt(0));
        Clause clauseJK = new Clause(user.getJK() == 'l' ? "LK" : "PR");
        knowledeBase.add(clauseJK);

        System.out.print("Umur "+user.getNama()+" berapa?: ");
        user.setUmur(data.nextInt());
        String umur;
        if(user.getUmur() >= 0 && user.getUmur() <= 5){
            umur = "BALITA";
        }else if(user.getUmur() >= 6 && user.getUmur() <= 11){
            umur = "ANAK";
        }else if(user.getUmur() >= 12 && user.getUmur() <= 25){
            umur = "REMAJA";
        }else if(user.getUmur() >= 26 && user.getUmur() <= 60){
            umur = "DEWASA";
        }else{
            umur = "LANSIA";
        }
        Clause clauseUmur = new Clause(umur);
        knowledeBase.add(clauseUmur);

        System.out.print("Kira-kira berat badan "+user.getNama()+" sekarang berapa?: ");
        user.setBB(data.nextDouble());

        System.out.print("Kira-kira tinggi badan "+user.getNama()+" sekarang berapa?: ");
        user.setTinggi(data.nextDouble());

        double imt = user.getBB() / ( (user.getTinggi()/100) * (user.getTinggi()/100) );
        user.setIMT(imt);

        String bb;
        if(user.getJK() == 'l'){
            if(imt < 18){
                bb = "K";
            }else if(imt >= 18 && imt <= 24.9){
                bb = "I";
            }else if(imt >= 25 && imt <= 27){
                bb = "G";
            }else{
                bb = "O";
            }
        }else{
            if(imt < 17){
                bb = "K";
            }else if(imt >= 17 && imt <= 22.9){
                bb = "I";
            }else if(imt >= 23 && imt <= 27){
                bb = "G";
            }else{
                bb = "O";
            }
        }
        Clause clauseBB = new Clause(bb);
        knowledeBase.add(clauseBB);

        System.out.println(user.getNama()+" ada penyakit ini gak?");
        System.out.println("1. Diabetes Mellitus");
        System.out.println("2. Penyakit Lambung");
        System.out.println("3. Rendah Protein");
        System.out.println("4. Penyakit Hati");
        System.out.println("5. Penyakit Jantung");
        System.out.println("6. Penyakit Kolesterol");
        System.out.println("7. Penyakit Asam Urat");
        System.out.println("8. Tidak ada satupun");
        String disease[] = {
            "Diabetes Mellitus", "Penyakit Lambung", "Rendah Protein", "Penyakit Hati",
            "Penyakit Jantung", "Penyakit Kolesterol", "Penyakit Asam Urat", "Tidak ada satupun"
        };
        String diseaseVar[] = {
            "P1", "P2", "P3", "P4",
            "P5", "P6", "P7", "P8"
        };
        System.out.print("input: ");
        int index = data.nextInt()-1;
        user.setPenyakit(disease[index]);
        Clause clausePenyakit = new Clause(diseaseVar[index]);
        knowledeBase.add(clausePenyakit);
        knowledeBaseRule = new ArrayList<Clause>(knowledeBase);
        return user;
    }

    public static String forwardChaining(String knowledgeBaseFile){
            String out = "";
            try{
                int i = 1;
                
                while(i <= 208){

                    String line;
                    reader = new BufferedReader(new FileReader(knowledgeBaseFile));
                    while((line = reader.readLine()) != null){
                        Clause clause = new Clause(line);
                        sentenceList.add(clause);
                        if(knowledeBase.isEmpty()){
                            knowledeBase = new ArrayList<Clause>(knowledeBaseRule);
                        }
                    }
        
                    if(run("M"+i) == true){
                        out = "M"+i;
                        output.write("M"+i);
                        output.newLine();
                    }
                    
                    logs.write("-----------------------------------------------------------------------");
                    logs.newLine();
                    knowledeBase.clear();
                    sentenceList.clear();

                    i++;
                }
                
            }catch(Exception e){
                e.printStackTrace();
            }
            return out;
    }

    public static boolean run(String alpha){
        String conclusion = "";
        int loopCount = 0;
        while(loopCount != sentenceList.size()){
            loopCount = 0;
            for(Clause clause:sentenceList){
                loopCount++;
                String str = clause.getString();
                String str2 = str.substring(str.indexOf('-')+2);
                
                if(notInKnowledgeBase(str2) != true){
                    if(clause.getParsed() == true){
                        conclusion = "";
                    }else{
                        conclusion = addToKnowledgeBase(clause);
						loopCount = 0;	
						break;
                    }
                }
            }
            
            // System.out.println(conclusion+" "+alpha);
            if(conclusion.equalsIgnoreCase(alpha)){
                return true;
            }
        }
        return false;
    }

    public static boolean notInKnowledgeBase(String str){
        int actualCount = 0;
        String strArray[] = str.split(",");
        
        for(Clause clause: knowledeBase){
            for(int i=0; i<strArray.length;i++){
                if(clause.getString().equalsIgnoreCase(strArray[i])){
                    actualCount++;
                }
            }
        }
        return actualCount == strArray.length ? false:true;
    }

    public static String addToKnowledgeBase(Clause clause){
		String c = clause.getString().subSequence(0, clause.getString().indexOf(" ")).toString();
		printForwardDeducedFacts();
		printForwardRulesFired(clause);
		printForwardNewFacts(c.toString());
		knowledeBase.add(new Clause(c));
		clause.setParsed(true);
		return c;
    }

    public static void printForwardDeducedFacts(){
        try{
            for(int i=0; i<knowledeBase.size();i++){
                logs.write(knowledeBase.get(i).getString());
                logs.write(", ");
            }
            logs.write("# ");
        }catch(Exception e){
			e.printStackTrace();
		}
    }

    public static void printForwardRulesFired(Clause clause){
		try{
            logs.write(clause.getString());
			logs.write("# ");
		}catch(Exception e){
			e.printStackTrace();
		}
    }
    
    public static void printForwardNewFacts(String str){
		try{
			logs.write(str);
			logs.newLine();
		}catch(Exception e){
			e.printStackTrace();
		}
	 }
}