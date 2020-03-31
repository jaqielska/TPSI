/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author Basia
 */
public class Lab3 {

    
    public static void main(String[] args) {
        Set<String> zbiorDni = new HashSet<>();
		
		zbiorDni.add("poniedziałek");
		zbiorDni.add("wtorek");
		zbiorDni.add("środa");
		zbiorDni.add("czwartek");
		zbiorDni.add("piątek");
		zbiorDni.add("sobota");
		zbiorDni.add("niedziela");
		
		System.out.println(zbiorDni);
                
                //1 Hash - nie ma wpływu na uporządkowanie, Tree są uporządkowane w konkretny sposób
                //2 gdy chcemy mieć uporządkowane bierzemy Tree, a jak nie jest istotna kolejność to Hash
                //3 trzeba było tylko zaimportować dodatkowo bibliotekę
                
                Map<Integer, List<Student>> grupy = new HashMap();
                
                Map<String, Teacher> osoby = new TreeMap<>();
                osoby.put("angielski", new Teacher("Jan","Kowalski", "angielski"));
                osoby.put("programowanie obiektowe", new Teacher("Andrzej","Mikrut", "programowanie obiektowe"));
                osoby.put("programowanie obiektowe", new Teacher("Monika","Kozłowska", "programowanie obiektowe"));
                
                List<Student> grupa32a = new ArrayList<>();
                grupa32a.add(new Student("Basia","Jagielska","TPSI"));
                grupa32a.add(new Student("Piotr","Wyczołek","TPSI"));
                grupa32a.add(new Student("Jakub","Piechota","TPSI"));
	    
	    	List<Student> grupa3 = new ArrayList<>();
                grupa3.add(new Student("Ola","Jagielska","TPSI"));
                grupa3.add(new Student("Monika","Wyczołek","TPSI"));
                grupa3.add(new Student("Zdzisław","Piechota","TPSI"));
                
                //System.out.println(osoby.get("programowanie obiektowe"));
	    
	        Map<String, List<Student>> uczniowie = new HashMap<>();
                uczniowie.put("32a",grupa32);
                System.out.println(uczniowie.get("32a"));
                
               try(BufferedReader in = new BufferedReader(new FileReader("plik.txt"))) 
               {

                String s = in.readLine();
                //System.out.println(s);

                List<Product> produkty = new ArrayList<>();

                Map<String, List<Product>> produkt_kat = new HashMap();
                Map<Integer, Product> produkt_id = new HashMap();

                    while(s!=null) {
                        String[] pola = s.split(";");
                        Product produkt = new Product(Integer.parseInt(pola[0]), pola[1], pola[2], Double.parseDouble(pola[3]));
                        produkty.add(produkt);

                        produkt_id.put(produkt.id,produkt);
                        
                        if(produkt_kat.containsKey(produkt.category)) 
                                {
                                        List<Product> lista = produkt_kat.get(produkt.category);
                                        lista.add(produkt);
                                }
                        else {
                                        List<Product> lista = new ArrayList<>();
                                        lista.add(produkt);
                                        produkt_kat.put(produkt.category, lista);
                             }

                        s = in.readLine();
                        //System.out.println(produkt_id.get(101));
                                }
                 } 
                         
                    catch (IOException ex) 
                        {
                            ex.printStackTrace();
                        }
               
     }
    
}
